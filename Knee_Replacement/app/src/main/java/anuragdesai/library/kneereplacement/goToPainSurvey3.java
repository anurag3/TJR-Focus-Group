package anuragdesai.library.kneereplacement;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anurag on 11/2/2015.
 */
public class goToPainSurvey3 extends AppCompatActivity implements View.OnClickListener {

    private UserDataCollector udc;
    public static int count3;
    private Button button1;
    public Button B1;
    public Button B2;
    public Button B3;
    public Button B4;
    public Button B5;
    public List<Integer> arr= new ArrayList<Integer>();
    public int a1;
    public int a2;
    public int a3;
    public int a4;
    public int a5;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.painsurvey3);
        udc = new UserDataCollector();
        setTitle("Interface 3");
    }
    public void buttonselection3(View view) {
        B1 = (Button) view.findViewById(R.id.bodybtn1);
        B2 = (Button) view.findViewById(R.id.bodybtn2);
        B3 = (Button) view.findViewById(R.id.bodybtn3);
        B4 = (Button) view.findViewById(R.id.bodybtn4);
        B5 = (Button) view.findViewById(R.id.bodybtn5);

        arr.add(0);
        arr.add(0);
        arr.add(0);
        arr.add(0);
        arr.add(0);

        int id = view.getId();
        switch (id) {
            case R.id.bodybtn1:
                udc.writeToSDFile("Back Pain Survery Started");
                arr.set(0, 1);
                horizontalscroll();
                break;
            case R.id.bodybtn2:
                udc.writeToSDFile("Right Hip Survery Started");
                arr.set(1, 1);
                horizontalscroll();
                break;
            case R.id.bodybtn3:
                udc.writeToSDFile("Left Hip Survery Started");
                arr.set(2, 1);
                horizontalscroll();
                break;
            case R.id.bodybtn4:
                udc.writeToSDFile("Right Knee Survey Started");
                arr.set(3, 1);
                horizontalscroll();
                break;
            case R.id.bodybtn5:
                udc.writeToSDFile("Left Knee Survey Started");
                arr.set(4, 1);
                horizontalscroll();
                break;

        }

    }
    public void horizontalscroll() {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        AlertDialog dialog;
        alert.setTitle("Pain Survey");

        LayoutInflater inflater = (LayoutInflater)
                this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.popup3, null);

        final SeekBar sb = (SeekBar) v.findViewById(R.id.seekBar);

        alert.setView(v);
        alert.setPositiveButton("Save",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        int progress = sb.getProgress();
                        String s;

                        if (progress <= 16.7) {
                            s = "No Hurt";
                        } else if (progress <= 33.3) {
                            s = "Hurts Little Bit";
                        } else if (progress <= 50) {
                            s = "Hurts Little More";
                        } else if (progress <= 66.7) {
                            s = "Hurts Even More";
                        } else if (progress <= 83.3) {
                            s = "Hurts Whole Lot";
                        } else {
                            s = "Hurts Worst";
                        }
                        udc.writeToSDFile("Survey 3 submitted");
                        udc.writeToSDFile("Survey 3 result: " + s);


                    }
                });
        alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                udc.writeToSDFile("Survey 3 cancelled");
            }
        });
        dialog = alert.create();
        dialog.show();


        // dialog.dismiss();


    }
    public void onClick(View view) {
        for(int i=0;i<arr.size();i++)
        {
            if(arr.get(i)==0)
            {
                arr.remove(i);
                i=0;
            }

        }

        if(arr.size()>=3)
        {
            button1 = (Button) this.findViewById(R.id.interface3next);
            button1.setOnClickListener(this);
            Intent intent = new Intent(this, infopage3.class);
            //sa.surveysRotate();
            startActivity(intent);
        }
        else {
            Toast.makeText(this.getApplicationContext(), "Please Complete Pain Input for 3 Joints",
                    Toast.LENGTH_SHORT).show();

        }

    }
    public void onBackPressed() {}

}

