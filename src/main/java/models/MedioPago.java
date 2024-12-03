package models;

public class MedioPago {
    private String tipoPago;
    private String tarjetaTipo;
    private int cuotas;
    private double valor;

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getTarjetaTipo() {
        return tarjetaTipo;
    }

    public void setTarjetaTipo(String tarjetaTipo) {
        this.tarjetaTipo = tarjetaTipo;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
