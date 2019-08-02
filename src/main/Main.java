package main;

import impuestos.Parafiscaleslogica;
import static constantes.ParafiscalesString.*;

import javax.swing.*;

public class Main {
    public static void main (String[] args){

        //instancionamos la clase
        Parafiscaleslogica parafiscaleslogica=new Parafiscaleslogica();


        String nombre = JOptionPane.showInputDialog(null,
                MENSAJE_NOMBRE.getMensaje());

        String salario = JOptionPane.showInputDialog(null,
                MENSAJE_SALARIO.getMensaje());


        parafiscaleslogica.setNombre(nombre);
        parafiscaleslogica.setSalario(Double.parseDouble(salario));
        JOptionPane.showMessageDialog(null,  MENSAJE_EMPLEOADO.getMensaje()+ parafiscaleslogica.getNombre()+ "\n" +
                MENSAJE_BASE.getMensaje() + parafiscaleslogica.getSalario()+ "\n"+
                MENSAJE_DESCUENTO_PENSION.getMensaje() + parafiscaleslogica.calcularPension() + "\n" +
                MENSAJE_DESCUENTO_SALUD.getMensaje() + parafiscaleslogica.calcularSalud() + "\n" +
                MENSAJE_SALARIO_FINAL.getMensaje() + parafiscaleslogica.totalSalario());



    }
}
