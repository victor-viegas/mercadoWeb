package model.bean;

public class ProductDTO {

    private int idProduct;
    private int categoryId;
    private String name;
    private byte[] image;
    private float price;

    public ProductDTO() {
    }

    public ProductDTO(int idProduct, int categoryId, String name, byte[] image, float price) {
        this.idProduct = idProduct;
        this.categoryId = categoryId;
        this.name = name;
        this.image = image;
        this.price = price;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
