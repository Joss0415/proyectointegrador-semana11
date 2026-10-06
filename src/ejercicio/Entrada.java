package ejercicio;

public class Entrada implements Cobrable {
    private int cantidad;

    public Entrada(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public int monto() {
        return cantidad * 5;
    }
}
