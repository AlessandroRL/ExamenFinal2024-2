package com.example.facturacion;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class FacturaHandler {

    public static void procesarFactura(String tiendaUUID, String facturaJSON) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            CallableStatement stmt = conn.prepareCall("{CALL procesar_factura(?, ?)}");
            stmt.setString(1, tiendaUUID);
            stmt.setString(2, facturaJSON);

            stmt.execute();
            System.out.println("Factura procesada exitosamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void consultarFactura(String tiendaUUID, String tokenCajero, String clienteDocumento, int facturaId) {
        try (Connection conn = DatabaseConnection.getConnection()) {
            CallableStatement stmt = conn.prepareCall("{CALL consultar_factura(?, ?, ?, ?)}");
            stmt.setString(1, tiendaUUID);
            stmt.setString(2, tokenCajero);
            stmt.setString(3, clienteDocumento);
            stmt.setInt(4, facturaId);

            stmt.executeQuery();
            System.out.println("Factura consultada correctamente.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}