/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javatickets;

/**
 *
 * @author balto
 */
public abstract class Limited {
    
    protected String usuario;
    protected String password;
    protected String nombre;
    protected int edad;
    
    public Limited(String usuario, String password, String nombre, int edad) {

        this.nombre = nombre;
        this.edad = edad;
        this.usuario = usuario;
        this.password = password;
        
    }
    
    public Limited(Limited user){
        
        this.usuario = user.usuario;
        this.password = user.password;
        
    }
    
    public void printUser() {
        
        System.out.println(usuario);
        
    }

    public abstract void agregarEvento(Eventos evento);
    
}
