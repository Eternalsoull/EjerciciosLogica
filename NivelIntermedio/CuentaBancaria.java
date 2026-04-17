package NivelIntermedio;

public class CuentaBancaria {
    private String titular;
    private double saldo;
    private String numeroCuenta;

    public CuentaBancaria(String titular, String numeroCuenta) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0;
    }

    public void depositar(double monto) {
        if (monto <= 0) {
            System.out.println("El depósito debe ser mayor que 0.");
            return;
        }
        saldo += monto;
        System.out.println("Depósito exitoso. Saldo actual: " + saldo);
    }

    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("El retiro debe ser mayor que 0.");
            return;
        }
        if (monto > saldo) {
            System.out.println("Fondos insuficientes. Saldo actual: " + saldo);
            return;
        }
        saldo -= monto;
        System.out.println("Retiro exitoso. Saldo actual: " + saldo);
    }

    public double consultarSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }
}

