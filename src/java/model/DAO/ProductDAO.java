package model.DAO;

import connection.ConnectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.bean.ProductDTO;

public class ProductDAO {

    public List<ProductDTO> read() {
        List<ProductDTO> products = new ArrayList<>();
        String sql = "SELECT * FROM produtos";
        try {
            Connection connection = ConnectionDB.connect();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            stmt = connection.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                ProductDTO objProduct = new ProductDTO();
                objProduct.setIdProduct(rs.getInt("id_produto"));
                objProduct.setName(rs.getString("nome"));
                objProduct.setPrice(rs.getFloat("valor"));
                objProduct.setCategoryId(rs.getInt("categoria_id"));
                objProduct.setImage(rs.getBytes("imagem"));
                products.add(objProduct);
            }
            rs.close();
            stmt.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Leitura de produtos: " + e);
        }
        return products;
    }

    public void insertProduct(ProductDTO objProduct) {
        try {
            Connection connection = ConnectionDB.connect();
            PreparedStatement stmt = null;
            stmt = connection.prepareStatement("INSERT INTO produtos (nome, imagem,valor,categoria_id) VALUES (?, ?, ?, ?)");
            stmt.setString(1, objProduct.getName());
            stmt.setBytes(2, objProduct.getImage());
            stmt.setFloat(3, objProduct.getPrice());
            stmt.setInt(4, objProduct.getCategoryId());
            stmt.executeUpdate();
            stmt.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Erro no insert de produto: " + e);
        }
    }
}
