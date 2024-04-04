package model.bean;

public class CartDTO {
    private int idProduct;
    private String name;
    private int quantity;
    private float priceUnitary;

    public CartDTO() {
    }

    public CartDTO(int idProduct, String name, int quantity, float priceUnitary) {
        this.idProduct = idProduct;
        this.name = name;
        this.quantity = quantity;
        this.priceUnitary = priceUnitary;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPriceUnitary() {
        return priceUnitary;
    }

    public void setPriceUnitary(float priceUnitary) {
        this.priceUnitary = priceUnitary;
    }
    
    
}
