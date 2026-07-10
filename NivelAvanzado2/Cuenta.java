package NivelAvanzado2;

import java.util.ArrayList;

public class Cuenta {
    private String titular;
    private String pin;
    private double saldo;
    private ArrayList<Transaccion> historial;
    private double retiroHoy;
    private static final double LIMITE_DIARIO = 2000000;

    public Cuenta(String titular, String pin, double saldo) {
        this.titular = titular;
        this.pin = pin;
        this.saldo = saldo;
        this.historial = new ArrayList<>();
        this.retiroHoy = 0;
    }

    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }

    public boolean validarPin(String intento) {
        return this.pin.equals(intento);
    }

    public String depositar(double monto) {
        saldo += monto;
        historial.add(new Transaccion("Depósito", monto));
        return "Depósito exitoso. Saldo: $" + saldo;
    }

    public String retirar(double monto) {
        if (monto > saldo) return "Fondos insuficientes.";
        if (retiroHoy + monto > LIMITE_DIARIO) return "Límite diario de retiro alcanzado ($" + LIMITE_DIARIO + ").";
        if (monto % 10000 != 0) return "El monto debe ser múltiplo de $10.000.";

        saldo -= monto;
        retiroHoy += monto;
        historial.add(new Transaccion("Retiro", monto));
        return "Retiro exitoso. Saldo: $" + saldo + "\n" + billetes(monto);
    }

    private String billetes(double monto) {
        int restante = (int) monto;
        int[] denominaciones = {100000, 50000, 20000, 10000};
        StringBuilder sb = new StringBuilder("Billetes entregados:\n");
        for (int den : denominaciones) {
            int cantidad = restante / den;
            if (cantidad > 0) {
                sb.append("  $").append(den).append(" x ").append(cantidad).append("\n");
                restante %= den;
            }
        }
        return sb.toString();
    }

    public String verHistorial() {
        if (historial.isEmpty()) return "Sin transacciones.";
        StringBuilder sb = new StringBuilder("--- Historial ---\n");
        for (Transaccion t : historial) {
            sb.append(t.mostrar()).append("\n");
        }
        return sb.toString();
    }

    public String mostrar() {
        return "Titular: " + titular + " | Saldo: $" + saldo;
    }
}
