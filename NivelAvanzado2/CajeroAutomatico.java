package NivelAvanzado2;

public class CajeroAutomatico {
    private Cuenta cuenta;

    public CajeroAutomatico(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public String autenticar(String pin) {
        if (cuenta.validarPin(pin)) return "OK";
        return "PIN incorrecto.";
    }

    public String consultarSaldo() {
        return "Saldo actual: $" + cuenta.getSaldo();
    }

    public String depositar(double monto) {
        return cuenta.depositar(monto);
    }

    public String retirar(double monto) {
        return cuenta.retirar(monto);
    }

    public String verHistorial() {
        return cuenta.verHistorial();
    }

    public Cuenta getCuenta() { return cuenta; }
}
