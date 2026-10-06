package ejercicio;

public interface Cobrable {
    int monto();

    default String recibo() {
        return "Cobro: $" + monto();
    }
}