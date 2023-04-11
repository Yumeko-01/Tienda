/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

/**
 *
 * @author SG701-04
 */
public class Tienda1 {
    
    //atributos
    private String nombre;
    
    //cuatro productos
    private Productos p1;
    private Productos p2;
    private Productos p3;
    private Productos p4;
    
    //constructor

    public Tienda1() {
        p1=new Productos();
        p2=new Productos();
        p3=new Productos();
        p4=new Productos();
    }

    public Tienda1(String nombre, Productos p1, Productos p2, Productos p3, Productos p4) {
        this.nombre = nombre;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }
    public Tienda1(String nombreTienda) {
        this.nombre= nombreTienda;
        p1=new Productos();
        p2=new Productos();
        p3=new Productos();
        p4=new Productos();
    }

    
    //metodos set and gets

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Productos getP1() {
        return p1;
    }

    public void setP1(Productos p1) {
        this.p1 = p1;
    }

    public Productos getP2() {
        return p2;
    }

    public void setP2(Productos p2) {
        this.p2 = p2;
    }

    public Productos getP3() {
        return p3;
    }

    public void setP3(Productos p3) {
        this.p3 = p3;
    }

    public Productos getP4() {
        return p4;
    }

    public void setP4(Productos p4) {
        this.p4 = p4;
    }

    //to string

    @Override
    public String toString() {
        return "Tienda1{" + "nombre=" + nombre + ", p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + ", p4=" + p4 + '}';
    }
    
    
}
