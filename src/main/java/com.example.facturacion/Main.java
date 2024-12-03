package com.example.facturacion;

import java.sql.Connection;
import java.sql.SQLException;


public class Main {
    public static void main(String[] args) {

        String tiendaUUID = "123e4567-e89b-12d3-a456-426614174000";

        String facturaJSON = """
            {
                "impuesto": 5,
                "cliente": {
                    "documento": "10000001",
                    "nombre": "Juan Pérez",
                    "tipo_documento": "CC"
                },
                "productos": [
                    {"referencia": "ELEC001", "cantidad": 2, "descuento": 10},
                    {"referencia": "ELEC002", "cantidad": 1, "descuento": 0}
                ],
                "medios_pago": [
                    {"tipo_pago": "TARJETA CREDITO", "valor": 4000},
                    {"tipo_pago": "TARJETA DEBITO", "valor": 2368}
                ],
                "vendedor": {"documento": "10101010"},
                "cajero": {"token": "token123"}
            }
        """;

        FacturaHandler.procesarFactura(tiendaUUID, facturaJSON);

        FacturaHandler.consultarFactura(tiendaUUID, "token123", "10000001", 1);

        try {
            Connection connection = DatabaseConnection.getConnection();
            System.out.println("Conexión exitosa a la base de datos.");
            // Cerrar la conexión
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error al conectar con la base de datos.");
        }
    }
}