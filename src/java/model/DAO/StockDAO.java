package model.DAO;

import connection.ConnectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.StockDTO;

public class StockDAO {
        public List<StockDTO> read() {
        List<StockDTO> stock = new ArrayList<>();
        String sql = "SELECT * FROM estoque";
        try {
            Connection connection = ConnectionDB.connect();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            stmt = connection.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                StockDTO objStock = new StockDTO();
                objStock.setIdStock(rs.getInt("id_estoque"));
                objStock.setProductId(rs.getInt("produto_id2"));
                objStock.setQuantityStock(rs.getInt("quantidade_estoque"));
                stock.add(objStock);
            }
            rs.close();
            stmt.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Leitura de estoque: " + e);
        }
        return stock;
    }
}
