/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejemplo;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class Practica {

    public static void main(String[] args) {
    Connection con = Conexion.getConnection();
        if (con != null) {
            System.out.println("Conexión exitosa");
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
}
