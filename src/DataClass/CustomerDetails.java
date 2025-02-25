package DataClass;

import java.util.ArrayList;
import java.util.List;

public class CustomerDetails {

    private  String guestName;
    private  String guestPhoneno;


  public   CustomerDetails()
    {

    }
   /* public CustomerDetails(String guestName, String guestPhoneno) {
        this.guestName = guestName;
        this.guestPhoneno = guestPhoneno;
    }*/

    public String getGuestName() {
        return guestName;
    }

    public String setGuestName(String guestName) {
        this.guestName = guestName;
        return guestName;
    }

    public String setGuestPhoneno(String guestPhoneno) {
        this.guestPhoneno = guestPhoneno;
        return guestPhoneno;
    }

    @Override
    public String toString() {
        return "CustomerDetails{" +
                "guestName='" + guestName + '\'' +
                ", guestPhoneno='" + guestPhoneno + '\'' +
                '}';
    }

    public String getGuestPhoneno() {
        return guestPhoneno;
    }


}
