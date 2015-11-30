package anuragdesai.library.kneereplacement;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
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
    private LinearLayout LL1;
    private LinearLayout LL2;
    private LinearLayout LL3;
    private LinearLayout LL4;
    private LinearLayout LL5;
    private LinearLayout LL6;
    public Button button1;
    Boolean b = false;
    public Button B1;
    public Button B2;
    public Button B3;
    public Button B4;
    public Button B5;
    public List<Integer> arr = new ArrayList<Integer>();
    public int a1;
    public int a2;
    public int a3;
    public int a4;
    public int a5;
    private Utils.buttonCounter buttonCounter = new Utils.buttonCounter();
    public Drawable d1;
    private int currentSelectedFace = -1;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.painsurvey1);
        udc = new UserDataCollector();
        setTitle("Horizontal Tap");
        button1 = (Button) this.findViewById(R.id.interface1next);
        button1.setOnClickListener(this);
        button1.setEnabled(false);
        d1= getResources().getDrawable(R.drawable.roundbutton);


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


        int id = view.getId();
        switch (id) {
            case R.id.bodybtn1:
                udc.writeToSDFile("Back Pain Survery Started");
                arr.set(0, 1);
                horizontaltap(B1);
                break;
            case R.id.bodybtn2:
                udc.writeToSDFile("Right Hip Survery Started");
                arr.set(1, 1);
                horizontaltap(B2);
                break;
            case R.id.bodybtn3:
                udc.writeToSDFile("Left Hip Survery Started");
                arr.set(2, 1);
                horizontaltap(B3);
                break;
            case R.id.bodybtn4:
                udc.writeToSDFile("Right Knee Survey Started");
                arr.set(3, 1);
                horizontaltap(B4);
                break;
            case R.id.bodybtn5:
                udc.writeToSDFile("Left Knee Survey Started");
                arr.set(4, 1);
                horizontaltap(B5);
                break;

        }
    }


    public void horizontaltap(final Button button) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        final AlertDialog dialog;
        alert.setTitle("Pain Survey 1");

        LayoutInflater inflater = (LayoutInflater)
                this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //View v = inflater.inflate(R.layout.popup1, null);
        View v = inflater.inflate(R.layout.activity_transparent_button_horizontal, null);


        /*RB1 = (RadioButton) v.findViewById(R.id.radioButton1);
        RB2 = (RadioButton) v.findViewById(R.id.radioButton2);
        RB3 = (RadioButton) v.findViewById(R.id.radioButton3);
        RB4 = (RadioButton) v.findViewById(R.id.radioButton4);
        RB5 = (RadioButton) v.findViewById(R.id.radioButton5);
        RB6 = (RadioButton) v.findViewById(R.id.radioButton6);*/
        LL1 = (LinearLayout) v.findViewById(R.id.layoutbutton1);
        LL2 = (LinearLayout) v.findViewById(R.id.layoutbutton2);
        LL3 = (LinearLayout) v.findViewById(R.id.layoutbutton3);
        LL4 = (LinearLayout) v.findViewById(R.id.layoutbutton4);
        LL5 = (LinearLayout) v.findViewById(R.id.layoutbutton5);
        LL6 = (LinearLayout) v.findViewById(R.id.layoutbutton6);

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
                int colorToChangeTo = 0;
                udc.writeToSDFile("Survey 1 Submitted");
                /*if (RB1.isChecked()) {
                    udc.writeToSDFile("Survey 1 result: No Hurt");
                    b = true;
                    colorToChangeTo = Utils.getColorForLevel(1);
                } else if (RB2.isChecked()) {
                    udc.writeToSDFile("Survey 1 result: Hurts Little Bit");
                    b = true;
                    colorToChangeTo = Utils.getColorForLevel(2);
                } else if (RB3.isChecked()) {
                    udc.writeToSDFile("Survey 1 result: Hurts Little More");
                    b = true;
                    colorToChangeTo = Utils.getColorForLevel(3);
                } else if (RB4.isChecked()) {
                    udc.writeToSDFile("Survey 1 result: Hurts Even More");
                    b = true;
                    colorToChangeTo = Utils.getColorForLevel(4);
                } else if (RB5.isChecked()) {
                    udc.writeToSDFile("Survey 1 result: Hurts Whole Lot");
                    b = true;
                    colorToChangeTo = Utils.getColorForLevel(5);
                } else if (RB6.isChecked()) {
                    udc.writeToSDFile("Survey 1 result: Hurts Worst");
                    b = true;
                    colorToChangeTo = Utils.getColorForLevel(6);
                } else {
                    Toast.makeText(getApplicationContext(), "Please Select A Pain Level",
                            Toast.LENGTH_SHORT).show();
                }*/
                switch (currentSelectedFace) {
                    case 6:
                        udc.writeToSDFile("Survey 1 result: No Hurt");
                        b = true;
                        colorToChangeTo = Utils.getColorForLevel(1);
                        break;
                    case 5:
                        udc.writeToSDFile("Survey 1 result: Hurts Little Bit");
                        b = true;
                        colorToChangeTo = Utils.getColorForLevel(2);
                        break;
                    case 4:
                        udc.writeToSDFile("Survey 1 result: Hurts Little More");
                        b = true;
                        colorToChangeTo = Utils.getColorForLevel(3);
                        break;
                    case 3:
                        udc.writeToSDFile("Survey 1 result: Hurts Even More");
                        b = true;
                        colorToChangeTo = Utils.getColorForLevel(4);
                        break;
                    case 2:
                        udc.writeToSDFile("Survey 1 result: Hurts Whole Lot");
                        b = true;
                        colorToChangeTo = Utils.getColorForLevel(5);
                        break;
                    case 1:
                        udc.writeToSDFile("Survey 1 result: Hurts Worst");
                        b = true;
                        colorToChangeTo = Utils.getColorForLevel(6);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "Please Select A Pain Level",
                                Toast.LENGTH_SHORT).show();
                        break;
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

                //else dialog stays open. Make sure you have an obvious way to close the dialog especially if you set cancellable to false.
            }
        });

        System.out.println(arr);

    }


    public void onClick(View view) {
        Intent intent = new Intent(this, infopage1.class);
        startActivity(intent);

    }
    //control all the button so that only one choice can be chosen
    public void face1(View view) {
        enableUnclickedLayouts(1);
        //resetAllRadio();
        //RB1.setChecked(true);
    }

    //control all the button so that only one choice can be chosen
    public void face2(View view) {
        enableUnclickedLayouts(2);
        //resetAllRadio();
        //RB2.setChecked(true);
    }

    //control all the button so that only one choice can be chosen
    public void face3(View view) {
        enableUnclickedLayouts(3);
        //resetAllRadio();
        //RB3.setChecked(true);
    }

    //control all the button so that only one choice can be chosen
    public void face4(View view) {
        enableUnclickedLayouts(4);
        //resetAllRadio();
        //RB4.setChecked(true);
    }

    //control all the button so that only one choice can be chosen
    public void face5(View view) {
        enableUnclickedLayouts(5);
        //resetAllRadio();
        //RB5.setChecked(true);
    }

    //control all the button so that only one choice can be chosen
    public void face6(View view) {
        enableUnclickedLayouts(6);
        //resetAllRadio();
        //RB6.setChecked(true);
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

    private void enableUnclickedLayouts(int selected) {
        currentSelectedFace = selected;
        LL1.setEnabled(selected != 1);
        LL2.setEnabled(selected != 2);
        LL3.setEnabled(selected != 3);
        LL4.setEnabled(selected != 4);
        LL5.setEnabled(selected != 5);
        LL6.setEnabled(selected != 6);
    }

    public void onBackPressed() {
    }

}
