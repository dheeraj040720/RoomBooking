package Service;

import Model.CustomerDetails;

public interface Service {

    void addCustomerDetails(CustomerDetails customer);
    void deleteCustomerDetailsById(CustomerDetails customer);

    void displayAllCustomerDetails();
    void displayCustomerDetailsById(int cid);

}
