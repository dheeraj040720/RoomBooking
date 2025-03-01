package Service;

import Model.CustomerDetails;

public interface Service {

    void addCustomerDetails();
    void deleteCustomerDetailsById(CustomerDetails customer);

    void displayAllCustomerDetails();
    void displayCustomerDetailsById(int cid);
    void RoomCalculation();

}
