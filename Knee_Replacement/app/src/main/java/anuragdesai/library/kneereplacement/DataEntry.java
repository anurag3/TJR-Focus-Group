package anuragdesai.library.kneereplacement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * Created by Joshua on 12/1/2015.
 */
public class DataEntry implements Comparable<DataEntry>{
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
    private long duration = -1;

    public static UserDataCollector udc = new UserDataCollector("TJRRawData.csv", getHeaders());
    private static List<DataEntry> entries = new ArrayList<>();

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
        this.duration =  endMilliseconds - startMilliseconds;
    }

    public void setDetails(String details){
        this.details = details;
    }

    public static String getHeaders(){
        return "SubjectID, Order, InterfaceNumber, InterfaceName, StartDate, StartMilliseconds, EndDate, EndMilliseconds, Duration (ms), Interface Button, PainLevel, Details";
    }

    public String getCSV(){
        return subjectId + "," + order + "," + interfaceNumber + "," + interfaceName + ","
                + startDate + "," + startMilliseconds + "," + endDate + ","
                + endMilliseconds + "," + duration + "," + joint + "," + painLevel + "," + details;
    }

    public void saveEntry(){
        udc.checkExternalMedia();
        udc.writeEntry(this);
        entries.add(this);
    }

    @Override
    public int compareTo(DataEntry other){
        // compareTo should return < 0 if this is supposed to be
        // less than other, > 0 if this is supposed to be greater than
        // other and 0 if they are supposed to be equal
        int order = this.subjectId - other.subjectId;

        if(order == 0){
            order = this.interfaceNumber - other.interfaceNumber;
        }

        if(order == 0){
            order = this.joint.toString().compareTo(other.joint.toString());
        }

        return order;
    }

    public static void generateReports(){
        UserDataCollector sorted = new UserDataCollector("TJRSortedData.csv", getHeaders());
        sorted.checkExternalMedia();
        Collections.sort(entries);
        for(DataEntry e: entries){
            sorted.writeEntry(e);
        }

    }

    public static void clearEntries(){
        entries.clear();
    }
}
