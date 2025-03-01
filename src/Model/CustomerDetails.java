package Model;


public class CustomerDetails {


    private int customerId;
    private String customerName;

    private String phoneNumber;




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

    public String setCustomerName(String customerName) {
        this.customerName = customerName;
        return customerName;
    }

    @Override
    public String toString() {
        return "CustomerDetails{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return phoneNumber;
    }





}
