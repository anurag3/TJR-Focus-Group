package anuragdesai.library.kneereplacement;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anurag on 10/22/2015.
 */
public class NextButtonController extends AppCompatActivity implements OnClickListener {
    //Button buttonnxt;
    Button button1;
    Activity M;
    Intent intent;
    int b1 = -1, b2 = -1, b3 = -1, b4 = -1, b5 = -1;
    DataEntry entry1, entry2, entry3, entry4, entry5;
    //public UserDataCollector udc;

    public NextButtonController(Button button1, Activity M, Intent intent) {
        this.button1 = button1;
        this.M = M;
        this.intent = intent;
    }

    public NextButtonController() {

    }


    public void onClick(View v) {

        String sb1 = String.valueOf(b1);
        String sb2 = String.valueOf(b2);
        String sb3 = String.valueOf(b3);
        String sb4 = String.valueOf(b4);
        String sb5 = String.valueOf(b5);
        //udc = new UserDataCollector();
        //udc.checkExternalMedia();


           /* List<Integer> arr= new ArrayList<Integer>();
            arr.add(b1);
            arr.add(b2);
            arr.add(b3);
            arr.add(b4);
            arr.add(b5);
            System.out.println(arr);


            for(int i=0;i<arr.size();i++)
            {
                if(arr.get(i)==0)
                {
                    arr.remove(i);
                    i=0;
                }

            }
            System.out.println(arr);

                        if (arr.size()>=3) {
            */
        if (b1 != -1 && entry1 != null) {
            //entry1.endEntry(b1);
            entry1.saveEntry();
        }
        if (b2 != -1 && entry2 != null) {
            //entry2.endEntry(b2);
            entry2.saveEntry();
        }
        if (b3 != -1 && entry3 != null) {
            //entry3.endEntry(b3);
            entry3.saveEntry();
        }
        if (b4 != -1 && entry4 != null) {
            //entry4.endEntry(b4);
            entry4.saveEntry();
        }
        if (b5 != -1 && entry5 != null) {
            //entry5.endEntry(b5);
            entry5.saveEntry();
        }


        //Intent intent = new Intent(M, infopage5.class);
        M.startActivity(intent);
        finish();
            /*
            }
            else
            {
                Toast.makeText(M.getApplicationContext(), "Please complete Pain Input for 3 joints",
                        Toast.LENGTH_SHORT).show();
            }
            */
    }

    public void setButtonEnabled(boolean enable) {
        button1.setEnabled(enable);
    }

}