package model.bean;

public class OrderDTO {
    private int idOrder;
    private int userId;
    private int adressId;
    private String statusPayment;
    private String methodPayment;
    private double totalPrice;
    private String dateTime;

    public OrderDTO() {
    }

    public OrderDTO(int idOrder, int userId, int adressId, String statusPayment, String methodPayment, double totalPrice, String dateTime) {
        this.idOrder = idOrder;
        this.userId = userId;
        this.adressId = adressId;
        this.statusPayment = statusPayment;
        this.methodPayment = methodPayment;
        this.totalPrice = totalPrice;
        this.dateTime = dateTime;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAdressId() {
        return adressId;
    }

    public void setAdressId(int adressId) {
        this.adressId = adressId;
    }

    public String getStatusPayment() {
        return statusPayment;
    }

    public void setStatusPayment(String statusPayment) {
        this.statusPayment = statusPayment;
    }

    public String getMethodPayment() {
        return methodPayment;
    }

    public void setMethodPayment(String methodPayment) {
        this.methodPayment = methodPayment;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
    
    
}
