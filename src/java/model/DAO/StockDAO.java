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
        try {
            Connection connection = ConnectionDB.connect();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            stmt = connection.prepareStatement("SELECT * FROM estoque");
            rs = stmt.executeQuery();
            while (rs.next()) {
                StockDTO objStock = new StockDTO();
                objStock.setIdStock(rs.getInt("id_estoque"));
                objStock.setProductId(rs.getInt("produto_id"));
                objStock.setQuantityStock(rs.getInt("quantidade_estoque"));
                stock.add(objStock);
            }
            rs.close();
            stmt.close();
            connection.close();

        } catch (SQLException e) {
            System.out.println("Erro na leitura do estoque: " + e);
        }
        return stock;
    }
    
    public void updateStock(StockDTO objStock) {
        try {
            Connection connection = ConnectionDB.connect();
            PreparedStatement stmt = null;
            stmt = connection.prepareStatement("UPDATE estoque SET quantidade_estoque = ? WHERE produto_id = ?");
            stmt.setInt(1, objStock.getQuantityStock());
            stmt.setInt(2, objStock.getProductId());
            stmt.executeUpdate();
            stmt.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Erro no update do estoque: " + e);
        }
    }
}
