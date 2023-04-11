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
        
        Tienda1 miTienda=new Tienda1("tienda a todo a mil");
        
        Productos Marcador = new Productos("Marcador",Productos.PAPELERIA,55,10,1500,10);
        Productos Libreta= new Productos("Libreta de apuntes",Productos.PAPELERIA,23,15,5500,87);
        Productos Leche=new Productos("leche en blosa 1 litro",Productos.SUPERMERCADO,150,30,2100,30);
        Productos Jabon=new Productos("jabon en polvo",Productos.SUPERMERCADO,15,50,4200,80);
        Productos Aspirina=new Productos("Aspirina",Productos.DROGERIA,60,100,2400,80);
        
        //asignar los productos a la tienda
        miTienda.setP1(Libreta);
        miTienda.setP2(Leche);
        miTienda.setP3(Jabon);
        miTienda.setP4(Aspirina);
        
        
        System.out.println("mi Tienda: " + miTienda.toString());
        
        /*
        System.out.println("Marcador" + Marcador.toString());
        System.out.println("libreta de apuntes " + Libreta.toString());
        System.out.println("leche en polvo " + Leche.toString());
        System.out.println("jabon el polvo " + Jabon.toString());
        System.out.println("Aspirina " + Aspirina.toString());
        */
        
        
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
        double La_tienda= (miTienda.getP1().getValorUnitario()+ miTienda.getP2().getValorUnitario()+ miTienda.getP3().getValorUnitario()+miTienda.getP4().getValorUnitario())/4;
        System.out.println("La tienda: " + La_tienda);
        La_tienda=(Libreta.getCantidadBodega()-Libreta.getCantidadMinima())*(Libreta.getValorUnitario()*(1+Productos.IVA_PAPEL));
        System.out.println("la Tienda: " + La_tienda);
        
        //Expresiones aritmeticas 3
        
        System.out.println("Expresiones aritmeticas 3: ");
        La_tienda=Leche.getTotalProductosVendidos()*(1+Productos.IVA_MERCADO);
        System.out.println("la tienda: " + La_tienda);
        
        //taller 2 expresiones Relacionales
        
        System.out.println("Expresiones aritmeticas Relacionales 1");
        //Tipo == PAPELERIA
        boolean libreta1= Libreta.getTipo()== Productos.PAPELERIA;
        System.out.println("libreta: " + libreta1);
        //Tipo != DROGUERIA
        libreta1= Libreta.getTipo() != Productos.DROGERIA;
        System.out.println("libreta: " + libreta1);
        //CantidadMinima >= cantidadBodega
        boolean leche1= Leche.getCantidadMinima() >= Leche.getCantidadBodega();
        System.out.println("Leche: " + leche1);
        //ValorUnitario <= 10000
        boolean jabon1= Jabon.getValorUnitario() <= 1000;
        System.out.println("Jabon: " + jabon1);
        //cantidadBodega – cantidadMinima != totalProductosVendidos
        boolean aspirina1= Aspirina.getCantidadBodega()- Aspirina.getCantidadMinima() != Aspirina.getTotalProductosVendidos();
        System.out.println("Aspirina: " + aspirina1);
        //cantidadBodega * valorUnitario == totalProductosVendidos * IVA_PAPEL
        jabon1= Jabon.getCantidadBodega()*Jabon.getValorUnitario() == Jabon.getTotalProductosVendidos()* Productos.IVA_PAPEL;
        System.out.println("Jabon: " + jabon1);
        //p1.darProductosVendidos ( ) + p2.darProductosVendidos ( ) > p3.darProductosVendidos ( )
        boolean laTienda1= miTienda.getP1().getTotalProductosVendidos()+miTienda.getP2().getTotalProductosVendidos()>miTienda.getP3().getTotalProductosVendidos();
        System.out.println("mi Tienda: " + laTienda1);
        
        //Expresiones relacionales 2
        System.out.println("Expresiones Relacionales 2");
        //( p1.darCantidadBodega ( ) + p2.darCantidadBodega ( ) + p3.darCantidadBodega ( ) + p4.darCantidadBodega ( ) ) <= 1000
        laTienda1=(miTienda.getP1().getCantidadBodega()+miTienda.getP2().getCantidadBodega()+miTienda.getP3().getCantidadBodega()+miTienda.getP4().getTotalProductosVendidos())<=1000;
        System.out.println("mi Tienda: " + laTienda1);
        
        //Creacion de Expreciones Racionales
        System.out.println("Creacion de Expresiones Racionales");
        //¿La cantidad en bodega es mayor o igual al doble de la cantidad mínima?
        boolean producto1=miTienda.getP1().getCantidadBodega()>= 2*miTienda.getP1().getCantidadMinima();
        System.out.println("Producto: " + producto1);
        //¿El tipo no es PAPELERIA?
        producto1= miTienda.getP1().getTipo()!=Productos.PAPELERIA;
        System.out.println("Productos: " + producto1);
        //¿El total de productos vendidos, es igual a la cantidad en bodega?
        producto1= miTienda.getP1().getTotalProductosVendidos()== miTienda.getP1().getCantidadBodega();
        System.out.println("Productos: " + producto1);
        // ¿El nombre del producto comienza por el carácter ‘a’?
        producto1=miTienda.getP1().getNombre()== "a";
        System.out.println("producto: " + producto1);
        //¿El nombre del producto 2 es “aspirina”?
        laTienda1=miTienda.getP2().getNombre()=="aspirina";
        System.out.println("la Tienda: " + laTienda1);
        
        
        
    }
    
    
    
}
