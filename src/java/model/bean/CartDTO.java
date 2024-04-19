package model.bean;

public class CartDTO {

    private int idProduct;
    private String name;
    private int quantity;
    private double priceUnitary;

    public CartDTO() {
    }

    public CartDTO(int idProduct, String name, int quantity, double priceUnitary) {
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

    public double getPriceUnitary() {
        return priceUnitary;
    }

    public void setPriceUnitary(double priceUnitary) {
        this.priceUnitary = priceUnitary;
    }

}
