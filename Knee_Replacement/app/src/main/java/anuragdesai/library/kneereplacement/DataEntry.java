package anuragdesai.library.kneereplacement;

import java.util.Date;

/**
 * Created by Joshua on 12/1/2015.
 */
public class DataEntry {
    private Date startDate;
    private long startMilliseconds = -1;
    private Date endDate;
    private long endMilliseconds = -1;
    private int subjectId = -1;
    private int interfaceNumber = -1;
    private String interfaceName = "";
    private int painLevel = -1;
    private String details = "";
    private Joint joint;
    private String order = "";

    public static UserDataCollector udc = new UserDataCollector();

    private DataEntry(){

    }

    public static DataEntry startEntry(int interfaceNumber, String interfaceName, Joint joint){
        DataEntry entry =  new DataEntry();
        entry.startDate = new Date();
        entry.startMilliseconds = System.currentTimeMillis();
        entry.interfaceNumber = interfaceNumber;
        entry.subjectId = Integer.parseInt(MainActivity.tyu.toString());
        entry.interfaceName = interfaceName;
        entry.joint = joint;
        entry.order = gotoSurveyActivity.getOrder();
        return entry;
    }

    public void endEntry(int pain){

        this.endDate = new Date();
        this.endMilliseconds = System.currentTimeMillis();
        this.painLevel = pain;
    }

    public void setDetails(String details){
        this.details = details;
    }

    public static String getHeaders(){
        return "SubjectID, Order, InterfaceNumber, InterfaceName, StartDate, StartMilliseconds, EndDate, EndMilliseconds, Joint, PainLevel, Details";
    }

    public String getCSV(){
        return subjectId + "," + order + "," + interfaceNumber + "," + interfaceName + ","
                + startDate + "," + startMilliseconds + "," + endDate + ","
                + endMilliseconds + "," + joint + "," + painLevel + "," + details;
    }

    public void saveEntry(){
        udc.writeEntry(this);
    }
}
