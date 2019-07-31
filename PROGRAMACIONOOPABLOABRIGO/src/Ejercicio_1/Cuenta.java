
package Ejercicio_1;

public class Cuenta {
    private String nombreDelCliente;
    private String numeroDeCuenta;
    private double tipoDeInteres;
    private double saldo;

    public Cuenta() {
    }

    public Cuenta(String nombreDelCliente, String numeroDeCuenta, double tipoDeInteres, double saldo) {
        this.nombreDelCliente = nombreDelCliente;
        this.numeroDeCuenta = numeroDeCuenta;
        this.tipoDeInteres = tipoDeInteres;
        this.saldo = saldo;
    }

    public String getNombreDelCliente() {
        return nombreDelCliente;
    }

    public void setNombreDelCliente(String nombreDelCliente) {
        this.nombreDelCliente = nombreDelCliente;
    }

    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public double getTipoDeInteres() {
        return tipoDeInteres;
    }

    public void setTipoDeInteres(double tipoDeInteres) {
        this.tipoDeInteres = tipoDeInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean Ingreso(double cantidad) {

        if (cantidad > 0) {
            double Ingreso = getSaldo() + cantidad;
            return true;
        } else {
            return false;
        }
    }

    public boolean Reintegro(double cantidad) {
        if (saldo >= cantidad) {
            double reintegro = getSaldo() - cantidad;
            return true;
        } else {
            return false;
        }
    }
}

