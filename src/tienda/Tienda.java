/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tienda;

/**
 *
 * @author user
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Productos Marcador = new Productos("Marcador",1,55,10,1500,10);
        Productos Libreta= new Productos("Libreta de apuntes",1,23,15,5500,87);
        Productos Leche=new Productos("leche en blosa 1 litro",2,150,30,2100,30);
        Productos Jabon=new Productos("jabon en polvo",2,15,50,4200,80);
        Productos Aspirina=new Productos("Aspirina",3,60,100,2400,80);
        
        System.out.println("Marcador" + Marcador.toString());
        System.out.println("libreta de apuntes " + Libreta.toString());
        System.out.println("leche en polvo " + Leche.toString());
        System.out.println("jabon el polvo " + Jabon.toString());
        System.out.println("Aspirina " + Aspirina.toString());
        
        //Expresiones aritmeticas 1
        
        System.out.println("Expresiones aritmeticas 1: ");
        double leche=Leche.getCantidadBodega()- Leche.getCantidadMinima();
        System.out.println("leche: " + leche);
        double aspirina=Aspirina.getValorUnitario()/(Aspirina.getCantidadBodega()*12);
        System.out.println("aspirina: " + aspirina);
        double jabon=(Jabon.getTotalProductosVendidos()+Jabon.getCantidadBodega())*(Jabon.getValorUnitario()*Productos.IVA_MERCADO);
        System.out.println("jabon: " + jabon);
        double libreta= Libreta.getValorUnitario()*Libreta.getCantidadBodega()/Libreta.getCantidadMinima();
        System.out.println("libreta: " + libreta);
        leche=Leche.getValorUnitario()*Leche.getTotalProductosVendidos()*Productos.IVA_MERCADO;
        System.out.println("leche: " + leche);
        
        //Expresiones aritmeticas 2
        
        System.out.println("Expresiones aritmeticas 2: ");
        aspirina= Aspirina.getValorUnitario() * (1+Productos.IVA_FARMACIA)*Aspirina.getTotalProductosVendidos()/Aspirina.getCantidadBodega();
        System.out.println("aspirina: " + aspirina);
        double La_tienda=Marcador.getValorUnitario()+ Libreta.getValorUnitario()+ Leche.getValorUnitario()+Jabon.getValorUnitario()+Aspirina.getValorUnitario()/4;
        System.out.println("La tienda: " + La_tienda);
        La_tienda=(Marcador.getCantidadBodega()-Marcador.getCantidadMinima())*(Marcador.getValorUnitario()*(1+Productos.IVA_PAPEL));
        System.out.println("la Tienda: " + La_tienda);
        
        //Expresiones aritmeticas 3
        
        La_tienda=Leche.getTotalProductosVendidos()*(1+Productos.IVA_MERCADO);
        System.out.println("la tienda: " + La_tienda);
        
        
    }
    
    
    
}
