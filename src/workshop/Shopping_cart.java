package workshop;
import javax.swing.*;

public class Shopping_cart {
    public static void main(String[] args) {
        int decision;
        int gDesicion;
        int pDesicion;
        int hDesicion;
        int price;
        int gPrice;
        int pPrice;
        int hPrice;

        products drink = new products();
        drink.name = "coca cola";
        drink.price = 3000;
        drink.amount = 10;

        products papas = new products();
        papas.name = "margarita";
        papas.price = 1500;
        papas.amount = 5;

        products icecream = new products();
        icecream.name = "polet";
        icecream.price = 2000;
        icecream.amount = 4;

        JOptionPane.showMessageDialog(null, "Bienvenido al carrito de compras");
        decision = Integer.parseInt(JOptionPane.showInputDialog("¿Desea agregar algo al carrito?   1.Si  2.No"));
        if (decision == 1) {
            gDesicion = Integer.parseInt(JOptionPane.showInputDialog("¿Desea agregar gaseosa? Hay " +drink.amount+ " de gaseosas disponibles   1.Si  2.No"));
            if(gDesicion == 1){
                gDesicion = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas gaseosas? "));
                if( gDesicion <= drink.amount){
                    JOptionPane.showMessageDialog(null,"Ha agregado "+gDesicion+" gaseosas al carrito");
                }else{
                    JOptionPane.showMessageDialog(null,"Cantidad que ingreso no es valida");
                }
            }else{JOptionPane.showMessageDialog(null,"No se ingresan gaseosa");}

            pDesicion = Integer.parseInt(JOptionPane.showInputDialog("¿Desea agregar papas? Hay " +papas.amount+ " papas disponibles   1.si  2.no"));
            if(pDesicion == 1){
                pDesicion = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas papas? "));
                if( pDesicion <= papas.amount){
                    JOptionPane.showMessageDialog(null,"Ha agregado "+pDesicion+" papas al carrito");
                }else{
                    JOptionPane.showMessageDialog(null,"Cantidad que ingreso no es valida");
                }
            }else{JOptionPane.showMessageDialog(null,"No se ingresan papas");}

            hDesicion = Integer.parseInt(JOptionPane.showInputDialog("¿Desea agregar helados? Hay " +icecream.amount+ " de helados disponibles   1.si  2.no"));
            if(hDesicion == 1){
                hDesicion = Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos helados? "));
                if( hDesicion <= icecream.amount){
                    JOptionPane.showMessageDialog(null,"Ha agregado "+hDesicion+" helados al carrito");
                }else{
                    JOptionPane.showMessageDialog(null,"Cantidad que ingreso no es valida");
                }
            }else{JOptionPane.showMessageDialog(null,"No se ingresa helados");}

            JOptionPane.showMessageDialog(null,"El precio de todo es:");
            gPrice = gDesicion * drink.price;
            JOptionPane.showMessageDialog(null,gPrice+"$ del total de gaseosas");

            pPrice = pDesicion * papas.price;
            JOptionPane.showMessageDialog(null,pPrice+"$ del total de papas");

            hPrice = hDesicion * icecream.price;
            JOptionPane.showMessageDialog(null,gPrice+"$ del total de helados");

            price = gPrice + pPrice + hPrice;

            JOptionPane.showMessageDialog(null,"el total a pagar por todo sera "+price+"$");

        } else {
            JOptionPane.showMessageDialog(null,"que vuelva pronto");
        }
    }
}

