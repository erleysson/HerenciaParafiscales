package impuestos;
import static constantes.Parafiscalesenteros.NOVECIENTOS;
import  static  constantes.ParafiscalesDouble.*;

public class Parafiscaleslogica extends ParafiscalesNombre {

    public Parafiscaleslogica() {
        //alcanza al constructor

    }

    public double calcularSalud(){

       if(this.getSalario()> NOVECIENTOS.getNumero()){
           return (this.getSalario()* CERO_PUNTO_CUATRO.getDescuento());
       }else{
           return (this.getSalario()* CERO_PUNTO_DOS.getDescuento());
    }


}

    public double calcularPension(){

        if(this.getSalario()> NOVECIENTOS.getNumero()){
            return (this.getSalario()* CERO_PUNTP_CINCO.getDescuento());
        }else{
            return (this.getSalario()* CERO_PUNTO_TRES.getDescuento());
        }


    }

    public double totalSalario(){
        return (this.getSalario()-(this.calcularSalud()+ this.calcularPension()));

    }


    }
