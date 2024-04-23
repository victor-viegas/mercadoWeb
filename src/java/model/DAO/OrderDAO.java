package model.DAO;

import connection.ConnectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.bean.CartDTO;
import model.bean.CartSingleton;
import model.bean.OrderDTO;

public class OrderDAO {

    public List<OrderDTO> read() {
        List<OrderDTO> pedidos = new ArrayList<>();
        String sql = "SELECT * FROM pedidos";
        try {
            Connection connection = ConnectionDB.connect();
            PreparedStatement stmt = null;
            ResultSet rs = null;
            stmt = connection.prepareStatement(sql);
            rs = stmt.executeQuery();
            while (rs.next()) {
                OrderDTO objOrder = new OrderDTO();
                objOrder.setIdOrder(rs.getInt("id_pedido"));
                objOrder.setUserId(rs.getInt("usuario_id"));
                objOrder.setStatusPayment(rs.getString("status_pagamento"));
                objOrder.setMethodPayment(rs.getString("metodo_pagamento"));
                objOrder.setTotalPrice(rs.getFloat("valor_total"));
                objOrder.setDateTime(rs.getString("data_hora"));
                pedidos.add(objOrder);
            }
            rs.close();
            stmt.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Erro leirura de pedidos: " + e);
        }
        return pedidos;
    }

    public void insertOrder(OrderDTO objOrder) {
        String sql = "INSERT INTO pedidos (usuario_id2, metodo_pagamento, valor_total, data_hora) VALUES (?, ?, ?, NOW())";
        try {
            Connection connection = ConnectionDB.connect();
            PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setInt(1, objOrder.getUserId());
            stmt.setString(2, objOrder.getMethodPayment());
            stmt.setDouble(3, objOrder.getTotalPrice());

            stmt.executeUpdate();
            ResultSet generatedKeys = stmt.getGeneratedKeys();
            int idPedido = -1;
            if (generatedKeys.next()) {
                idPedido = generatedKeys.getInt(1);
            } else {
                throw new SQLException("Falha ao recuperar o ID do pedido gerado automaticamente.");
            }

            insertItensOrder(CartSingleton.getInstance().getCarrinhoItens(), idPedido);

            stmt.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Insere Pedido: " + e);
        }
    }

    private void insertItensOrder(List<CartDTO> cartItens, int idOrder) {
        String sql = "INSERT INTO pedidos_produtos (pedido_id, produto_id, quantidade, preco_unitario) VALUES (?, ?, ?, ?)";
        try {
            Connection connection = ConnectionDB.connect();
            PreparedStatement stmt = connection.prepareStatement(sql);

            for (CartDTO item : cartItens) {
                stmt.setInt(1, idOrder);
                stmt.setInt(2, item.getIdProduct());
                stmt.setInt(3, item.getQuantity());
                stmt.setDouble(4, item.getPriceUnitary());
                stmt.executeUpdate();
            }

            stmt.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println("Inserir Itens do Pedido: " + e);
        }
    }
}
