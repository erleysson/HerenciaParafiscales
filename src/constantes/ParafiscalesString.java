package constantes;

public enum ParafiscalesString {
    MENSAJE_NOMBRE("Ingresa el nombre del empelado"),
    MENSAJE_SALARIO("ingrese el salario del empleado"),
    MENSAJE_EMPLEOADO("SU EMPLEADO"),
    MENSAJE_BASE("EL SALARIO BASE ES"),
    MENSAJE_DESCUENTO_PENSION("su descuentos de pensiones es:"),
    MENSAJE_DESCUENTO_SALUD("su descuento en salud es"),
    MENSAJE_SALARIO_FINAL("SU SALARIO FINAL ES");


    private String mensaje;

    ParafiscalesString(String m) {
        this.mensaje = m;
    }

    public String getMensaje() {
        return mensaje;
    }



}
