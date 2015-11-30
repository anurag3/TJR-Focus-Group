package anuragdesai.library.kneereplacement;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
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
 * Created by Anurag on 11/2/2015.
 */
public class goToPainSurvey2 extends AppCompatActivity implements View.OnClickListener {

    private UserDataCollector udc;
    private RadioButton RB1;
    private RadioButton RB2;
    private RadioButton RB3;
    private RadioButton RB4;
    private RadioButton RB5;
    private RadioButton RB6;
    private Button button1;
    Boolean b = false;
    public Button B1;
    public Button B2;
    public Button B3;
    public Button B4;
    public Button B5;
    public static int count2;
    public List<Integer> arr = new ArrayList<Integer>();
    public int a1;
    public int a2;
    public int a3;
    public int a4;
    public int a5;
    private Utils.buttonCounter buttonCounter = new Utils.buttonCounter();
    public Drawable d1;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.painsurvey2);
        udc = new UserDataCollector();
        setTitle("Vertical Tap");
        button1 = (Button) this.findViewById(R.id.interface2next);
        button1.setOnClickListener(this);
        button1.setEnabled(false);
        d1= getResources().getDrawable(R.drawable.roundbutton);

    }

    public void buttonselection2(View view) {
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
                verticaltap(B1);
                break;
            case R.id.bodybtn2:
                udc.writeToSDFile("Right Hip Survery  Started");
                arr.set(1, 1);
                verticaltap(B2);
                break;
            case R.id.bodybtn3:
                udc.writeToSDFile("Left Hip Survery Started");
                arr.set(2, 1);
                verticaltap(B3);
                break;
            case R.id.bodybtn4:
                udc.writeToSDFile("Right Knee Survey Started");
                arr.set(3, 1);
                verticaltap(B4);
                break;
            case R.id.bodybtn5:
                udc.writeToSDFile("Left Knee Survey Started");
                arr.set(4, 1);
                verticaltap(B5);
                break;

        }

    }

    public void verticaltap(final Button button) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        final AlertDialog dialog;
        alert.setTitle("Pain Survey 2");

        LayoutInflater inflater = (LayoutInflater)
                this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.popup2, null);

        RB1 = (RadioButton) v.findViewById(R.id.radioButton1);
        RB2 = (RadioButton) v.findViewById(R.id.radioButton2);
        RB3 = (RadioButton) v.findViewById(R.id.radioButton3);
        RB4 = (RadioButton) v.findViewById(R.id.radioButton4);
        RB5 = (RadioButton) v.findViewById(R.id.radioButton5);
        RB6 = (RadioButton) v.findViewById(R.id.radioButton6);


        alert.setView(v);
        alert.setPositiveButton("Save",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {

                    }
                });
        alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                udc.writeToSDFile("Survey 2 cancelled");
            }
        });

        b = false;

        dialog = alert.create();
        dialog.show();
        dialog.getButton(AlertDialog.BUTTON_POSITIVE).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int colorToChangeTo = 0;
                udc.writeToSDFile("Survey 2 submitted");
                if (RB6.isChecked()) {
                    udc.writeToSDFile("Survey 2 result: No Hurt");
                    b = true;
                    colorToChangeTo = Utils.getColorForLevel(1);
                } else if (RB5.isChecked()) {
                    udc.writeToSDFile("Survey 2 result: Hurts Little Bit");
                    b = true;
                    colorToChangeTo = Utils.getColorForLevel(2);
                } else if (RB4.isChecked()) {
                    udc.writeToSDFile("Survey 2 result: Hurts Little More");
                    b = true;
                    colorToChangeTo = Utils.getColorForLevel(3);
                } else if (RB3.isChecked()) {
                    udc.writeToSDFile("Survey 2 result: Hurts Even More");
                    b = true;
                    colorToChangeTo = Utils.getColorForLevel(4);
                } else if (RB2.isChecked()) {
                    udc.writeToSDFile("Survey 2 result: Hurts Whole Lot");
                    b = true;
                    colorToChangeTo = Utils.getColorForLevel(5);
                } else if (RB1.isChecked()) {
                    udc.writeToSDFile("Survey 2 result: Hurts Worst");
                    b = true;
                    colorToChangeTo = Utils.getColorForLevel(6);
                } else {
                    Toast.makeText(getApplicationContext(), "Please Select A Pain Level",
                            Toast.LENGTH_SHORT).show();
                }

                if (b) {
                    buttonCounter.recordValueStored(button);
                    if (buttonCounter.areButtonsStored(3)) {
                        button1.setEnabled(true);
                    } else {
                        button1.setEnabled(false);
                    }
                    d1.setColorFilter(colorToChangeTo, PorterDuff.Mode.SRC_ATOP);
                    button.setBackground(d1);
                    dialog.dismiss();
                }
            }
        });

        System.out.println(arr);

    }


    public void onClick(View view) {
        Intent intent = new Intent(this, infopage2.class);
        startActivity(intent);

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

    public void onBackPressed() {
    }
}
