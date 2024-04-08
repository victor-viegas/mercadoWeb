package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {

    private static final String url = "jdbc:mysql://localhost:3306/mercadoWeb";
    private static final String usuario = "root";
    private static final String senha = "";
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    
    public static Connection conectar() {
        Connection con = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, usuario, senha);
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
