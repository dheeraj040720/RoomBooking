package ServiceImpl;

import Model.CustomerDetails;

import Service.Service;

import java.util.LinkedList;
import java.util.Scanner;

public class ServiceImplementation  implements Service {

    static LinkedList<CustomerDetails>customerList=new LinkedList<>();


static     LinkedList<Object>RoomBooking = new LinkedList<>();


static int noOfDays;

    static int count=0;
    static int counter=101;

    static int price=60;
    @Override
    public void addCustomerDetails() {

        CustomerDetails customer = new CustomerDetails();
      //  Room room = new Room();
        Scanner scan = new Scanner(System.in);


       System.out.println("enter your name");


       String s=customer.setCustomerName(scan.next());
        System.out.println("enter your phone number");
        String p=customer.setPhoneNumber(scan.next());
        System.out.println("enter number of days staying");
         noOfDays=scan.nextInt();

        System.out.println("enter the type of room");
        String roomType=customer.setRoomType(scan.next());
   customerList.add(customer);
   while(customerList!=null)
   {
       count++;
       customer.setCustomerId(count);
       break;
   }

while(customerList!=null)
{
    counter++;
    customer.setRoomId(counter);
    break;

}


    }


    @Override
    public void displayAllCustomerDetails() {


        for(  CustomerDetails s :customerList )
        {

            System.out.println(s.toString());
        }


    }

    @Override
    public void displayCustomerDetailsById(int cid) {

        try {
            System.out.println("before removing" + customerList.toString());
            customerList.removeIf(customerDetails -> customerDetails.getCustomerId()==cid);
            System.out.println("after removing"+customerList.toString());
        } catch (Exception ex)
        {
            System.out.println(ex.getMessage());

        }



    }

    @Override
    public void RoomCalculation(String name) {
        CustomerDetails customer=new CustomerDetails();


      //  Room room1=new Room(101,"deluxe",150.0);
       // Room room2 = new Room(102,"Standard",100.0);

        System.out.println("\n ===ChekOut Receipt====");
        for(  CustomerDetails s :customerList )
        {


            if(s.getCustomerName().equalsIgnoreCase(name))
            System.out.println(s);
        }



        if(customer.getRoomType()=="deluxe")
        {
           System.out.println("Deluxe Room charge 150");
            double totalAmount=noOfDays*150;

            System.out.println("total amount" + totalAmount);
        }
        else {
            System.out.println("Single Room charge 100");
            double totalAmount=noOfDays*100;
            System.out.println("total amount" + totalAmount);
        }
        System.out.println("Checkout Successful");



        //numberofday*priceperday


    }


}


    /* System.out.println("Customer Name:"+   customerList.contains(customer.getCustomerName()));
             System.out.println("Room type" + customer.getRoomType());
             System.out.println("Room id" + customer.getRoomId());
             System.out.println("Enter the number of days stayed" + noOfDays);*/