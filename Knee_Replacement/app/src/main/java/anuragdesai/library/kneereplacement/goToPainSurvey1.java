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
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anurag on 11/1/2015.
 */
public class goToPainSurvey1 extends AppCompatActivity implements View.OnClickListener {

    private UserDataCollector udc;
    private RadioButton RB1;
    private RadioButton RB2;
    private RadioButton RB3;
    private RadioButton RB4;
    private RadioButton RB5;
    private RadioButton RB6;
    public Button button1;
    Boolean b = false;
    public Button B1;
    public Button B2;
    public Button B3;
    public Button B4;
    public Button B5;
    public static int count1;
    public List<Integer> arr= new ArrayList<Integer>();
    public int a1;
    public int a2;
    public int a3;
    public int a4;
    public int a5;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.painsurvey1);
        udc= new UserDataCollector();
        setTitle("Interface 1");

    }
    public void buttonselection1(View view) {
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


        int id=view.getId();
        switch(id) {
            case R.id.bodybtn1:
                udc.writeToSDFile("Back Pain Survery Started");
                arr.set(0,1);
                horizontaltap();
                break;
            case R.id.bodybtn2:
                udc.writeToSDFile("Right Hip Survery Started");
                arr.set(1,1);
                horizontaltap();
                break;
            case R.id.bodybtn3:
                udc.writeToSDFile("Left Hip Survery Started");
                arr.set(2,1);
                horizontaltap();
                break;
            case R.id.bodybtn4:
                udc.writeToSDFile("Right Knee Survey Started");
                arr.set(3,1);
                horizontaltap();
                break;
            case R.id.bodybtn5:
                udc.writeToSDFile("Left Knee Survey Started");
                arr.set(4,1);
                horizontaltap();
                break;

        }
    }


    public void horizontaltap() {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        final AlertDialog dialog;
        alert.setTitle("Pain Survey 1");

        LayoutInflater inflater = (LayoutInflater)
                this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.popup1, null);

        RB1 = (RadioButton) v.findViewById(R.id.radioButton1);
        RB2 = (RadioButton) v.findViewById(R.id.radioButton2);
        RB3 = (RadioButton) v.findViewById(R.id.radioButton3);
        RB4 = (RadioButton) v.findViewById(R.id.radioButton4);
        RB5 = (RadioButton) v.findViewById(R.id.radioButton5);
        RB6 = (RadioButton) v.findViewById(R.id.radioButton6);

        b = false;

        alert.setView(v);
        alert.setPositiveButton("Save",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                    }
                });
        alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                udc.writeToSDFile("Survey 1 Cancelled");
            }
        });

        dialog = alert.create();
        dialog.show();
        dialog.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                udc.writeToSDFile("Survey 1 Submitted");
                if (RB1.isChecked()) {
                    udc.writeToSDFile("Survey 1 result: No Hurt");
                    b = true;
                } else if (RB2.isChecked()) {
                    udc.writeToSDFile("Survey 1 result: Hurts Little Bit");
                    b = true;
                } else if (RB3.isChecked()) {
                    udc.writeToSDFile("Survey 1 result: Hurts Little More");
                    b = true;
                } else if (RB4.isChecked()) {
                    udc.writeToSDFile("Survey 1 result: Hurts Even More");
                    b = true;
                } else if (RB5.isChecked()) {
                    udc.writeToSDFile("Survey 1 result: Hurts Whole Lot");
                    b = true;
                } else if (RB6.isChecked()) {
                    udc.writeToSDFile("Survey 1 result: Hurts Worst");
                    b = true;
                } else {
                    Toast.makeText(getApplicationContext(), "Please Select A Pain Level",
                            Toast.LENGTH_SHORT).show();
                }

                if (b) {


                    dialog.dismiss();

                }

                //else dialog stays open. Make sure you have an obvious way to close the dialog especially if you set cancellable to false.
            }
        });

        System.out.println(arr);

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

        if(arr.size()>=3) {
            System.out.println(arr);
            button1 = (Button) this.findViewById(R.id.interface1next);
            button1.setOnClickListener(this);
            Intent intent = new Intent(this, infopage1.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(this.getApplicationContext(), "Please Complete Pain Input for 3 Joints",
                    Toast.LENGTH_SHORT).show();

        }

    }

    //control all the button so that only one choice can be chosen
    public void face1(View view) {
        resetAllRadio();
        RB1.setChecked(true);
    }
    //control all the button so that only one choice can be chosen
    public void face2(View view) {
        resetAllRadio();
        RB2.setChecked(true);
    }
    //control all the button so that only one choice can be chosen
    public void face3(View view) {
        resetAllRadio();
        RB3.setChecked(true);
    }
    //control all the button so that only one choice can be chosen
    public void face4(View view) {
        resetAllRadio();
        RB4.setChecked(true);
    }
    //control all the button so that only one choice can be chosen
    public void face5(View view) {
        resetAllRadio();
        RB5.setChecked(true);
    }
    //control all the button so that only one choice can be chosen
    public void face6(View view) {
        resetAllRadio();
        RB6.setChecked(true);
    }
    //control all the button so that only one choice can be chosen
    private void resetAllRadio() {
        RB1.setChecked(false);
        RB2.setChecked(false);
        RB3.setChecked(false);
        RB4.setChecked(false);
        RB5.setChecked(false);
        RB6.setChecked(false);
    }

    public void onBackPressed() {}

}
