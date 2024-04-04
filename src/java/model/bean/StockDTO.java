package model.bean;


public class StockDTO {
    private int idStock;
    private int productId;
    private int quantityStock;

    public StockDTO() {
    }

    public StockDTO(int idStock, int productId, int quantityStock) {
        this.idStock = idStock;
        this.productId = productId;
        this.quantityStock = quantityStock;
    }

    public int getIdStock() {
        return idStock;
    }

    public void setIdStock(int idStock) {
        this.idStock = idStock;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantityStock() {
        return quantityStock;
    }

    public void setQuantityStock(int quantityStock) {
        this.quantityStock = quantityStock;
    }
    
    
}
