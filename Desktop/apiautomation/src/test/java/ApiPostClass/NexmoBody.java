package ApiPostClass;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class NexmoBody {

    private String product;
    private String start_date;
    private  String end_date;
    private String sms_type;


    public String setproduct(String sms)
    {
        return product;
    }
    public void getproduct(String product)
    {
        this.product=product;
    }

    public String setstart_date(String start_date)
    {

        return start_date;
    }
    public void getstart_date(String end_date)
    {
        this.start_date=start_date;
    }

    public String setend_date()
    {
        return end_date;
    }
    public void getend_date(String end_date)
    {
        this.end_date=end_date;
    }


    public String setsms_type()
    {
        return sms_type;
    }
    public void getsms_type(String sms_type)
    {
        this.sms_type=sms_type;
    }
}
