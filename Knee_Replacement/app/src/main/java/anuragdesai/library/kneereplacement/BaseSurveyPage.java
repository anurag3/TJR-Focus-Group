package anuragdesai.library.kneereplacement;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Joshua on 1/20/2016.
 */
public class BaseSurveyPage extends AppCompatActivity {
    private DataEntry fullInterfaceEntry;

    protected String interfaceName = "N/A";
    protected int interfaceNumber = -1;

    @Override
    protected void onStart(){
        super.onStart();
        fullInterfaceEntry = DataEntry.startEntry(interfaceNumber, interfaceName, Joint.getJointFromButtonNumber(-1));

    }

    @Override
    protected void onStop(){
        super.onStop();
        fullInterfaceEntry.endEntry(-1);
        fullInterfaceEntry.saveEntry();

    }
}
