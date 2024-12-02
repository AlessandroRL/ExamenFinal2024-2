package com.example.facturacion.models;

import java.util.List;

public class Factura {
    private double impuesto;
    private Cliente cliente;
    private List<Producto> productos;
    private List<MedioPago> mediosPago;
    private String vendedorDocumento;
    private String cajeroToken;

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public List<MedioPago> getMediosPago() {
        return mediosPago;
    }

    public void setMediosPago(List<MedioPago> mediosPago) {
        this.mediosPago = mediosPago;
    }

    public String getVendedorDocumento() {
        return vendedorDocumento;
    }

    public void setVendedorDocumento(String vendedorDocumento) {
        this.vendedorDocumento = vendedorDocumento;
    }

    public String getCajeroToken() {
        return cajeroToken;
    }

    public void setCajeroToken(String cajeroToken) {
        this.cajeroToken = cajeroToken;
    }
}
