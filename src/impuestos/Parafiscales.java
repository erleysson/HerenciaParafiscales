package impuestos;


import  static constantes.Parafiscalesenteros.CERO;

public class Parafiscales {

    private double salario;

    //construtor
//estos es una sobrecargar de metodos, este ejemplo es  con los constructorews

    public Parafiscales(double salario) {
        this.salario = salario;
    }


    public Parafiscales() {
        this.salario = CERO.getNumero();
    }


    //get y set
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
