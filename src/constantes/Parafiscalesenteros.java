package constantes;

public enum Parafiscalesenteros {

    CERO(0),
    NOVECIENTOS(900000);

    private int numero;

    Parafiscalesenteros(int i) {

        this.numero = i;

    }

    public int getNumero() {
        return numero;
    }


}
