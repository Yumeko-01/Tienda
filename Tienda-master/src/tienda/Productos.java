/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda;

/**
 *
 * @author user
 */
public class Productos {
    
    //constantes
    
    public final static int PAPELERIA=1;
    public final static int SUPERMERCADO=2;
    public final static int DROGERIA=3;
    public final static double IVA_PAPEL=0.16;
    public final static double IVA_MERCADO=0.04;
    public final static double IVA_FARMACIA=0.12;

    //ATRIBUTOS
    
    private String nombre;
    private int tipo;
    private int cantidadBodega;
    private int cantidadMinima;
    private double valorUnitario;
    private int totalProductosVendidos;
    
    //CONSTRUCTOR

    public Productos() {
        this.nombre=" ";
    }

    public Productos(String nombre, int tipo, int cantidadBodega, int cantidadMinima, double valorUnitario, int totalProductosVendidos) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidadBodega = cantidadBodega;
        this.cantidadMinima = cantidadMinima;
        this.valorUnitario = valorUnitario;
        this.totalProductosVendidos = totalProductosVendidos;
    }
    
    //sets and gets

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getCantidadBodega() {
        return cantidadBodega;
    }

    public void setCantidadBodega(int cantidadBodega) {
        this.cantidadBodega = cantidadBodega;
    }

    public int getCantidadMinima() {
        return cantidadMinima;
    }

    public void setCantidadMinima(int cantidadMinima) {
        this.cantidadMinima = cantidadMinima;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public int getTotalProductosVendidos() {
        return totalProductosVendidos;
    }

    public void setTotalProductosVendidos(int totalProductosVendidos) {
        this.totalProductosVendidos = totalProductosVendidos;
    }
    
    //visualizar los contenidos de los objetos productos to String

    @Override
    public String toString() {
        return "\n Productos{" + "nombre=" + nombre + ", tipo=" + tipo + ", cantidadBodega=" + cantidadBodega + ", cantidadMinima=" + cantidadMinima + ", valorUnitario=" + valorUnitario + ", totalProductosVendidos=" + totalProductosVendidos + '}';
    }
    
    
    
}
