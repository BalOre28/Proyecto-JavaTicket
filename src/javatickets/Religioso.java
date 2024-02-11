/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatickets;
/**
 *
 * @author balto
 */
public class Religioso extends Eventos {

    private int convertidos;
    
    public Religioso(int codigo, String titulo, String descripcion, int year, int month,
     int date, int hour, int minute, double monto, int convertidos) {

        super(codigo, titulo, descripcion, year, month, date, hour, minute, (monto + 2000));
        this.convertidos = convertidos;
        capacidad = 30000;

    }

    public int getConvertidos() {
        return convertidos;
    }

    @Override
    public void cancelarEvento() {
        monto = 0;
        cancelado = true;
    }
    
    public void setConvertidos(int convertidos) {
        this.convertidos = convertidos;
    }

    @Override
    public String toString() {
        return (super.toString() +
            "\nEvento Religioso" +
            "\nPersonas convertidas: "+ convertidos+"\n\n");
    }

}
