package Model;


public class CustomerDetails {


    private int customerId;
    private String customerName;

    private String phoneNumber;

    private int roomId;

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomType() {
        return roomType;
    }

    public String setRoomType(String roomType) {
        this.roomType = roomType;
        return roomType;
    }

    public double getPriceFor24Hours() {
        return priceFor24Hours;
    }

    public void setPriceFor24Hours(double priceFor24Hours) {
        this.priceFor24Hours = priceFor24Hours;
    }

    private String roomType;

    private double priceFor24Hours;
    private boolean isAvaliable;


   public  CustomerDetails()
    {

    }

    public int getCustomerId() {
        return customerId;
    }

    public int setCustomerId(int customerId) {
        this.customerId = customerId;
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    @Override
    public String toString() {
        return "CustomerDetails{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", roomId=" + roomId +
                ", roomType='" + roomType + '\'' +

                ", isAvaliable=" + isAvaliable +
                '}';
    }

    public String setCustomerName(String customerName) {
        this.customerName = customerName;
        return customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return phoneNumber;
    }





}
