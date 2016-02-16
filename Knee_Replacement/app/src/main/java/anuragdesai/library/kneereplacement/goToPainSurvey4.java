package anuragdesai.library.kneereplacement;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SeekBar;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anurag on 11/2/2015.
 */
public class goToPainSurvey4 extends BaseSurveyPage implements View.OnClickListener {

    //private UserDataCollector udc;
    private Button button1;
    private SeekBar sb;
    public static int count4;
    public Button B1;
    public Button B2;
    public Button B3;
    public Button B4;
    public Button B5;
    public Button B1_ext;
    public Button B2_ext;
    public Button B4_ext;
    private LinearLayout LL1;
    private LinearLayout LL2;
    private LinearLayout LL3;
    private LinearLayout LL4;
    private LinearLayout LL5;
    private LinearLayout LL6;

    public List<Integer> arr = new ArrayList<Integer>();
    public int a1;
    public int a2;
    public int a3;
    public int a4;
    public int a5;
    private Utils.buttonCounter buttonCounter = new Utils.buttonCounter();
    public Drawable d1;
    private DataEntry entry;

    protected void onCreate(Bundle savedInstanceState) {
        interfaceName = "Vertical Slide";
        interfaceNumber = 4;
        System.gc();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.painsurvey4);
        //udc = new UserDataCollector();
        setTitle(interfaceName);
        button1 = (Button) this.findViewById(R.id.interface4next);
        button1.setOnClickListener(this);
        button1.setEnabled(false);
        d1= getResources().getDrawable(R.drawable.round_button_with_center);

        B1 = (Button) this.findViewById(R.id.bodybtn1);
        B2 = (Button) this.findViewById(R.id.bodybtn2);
        B3 = (Button) this.findViewById(R.id.bodybtn3_ext);
        B4 = (Button) this.findViewById(R.id.bodybtn4);
        B5 = (Button) this.findViewById(R.id.bodybtn5_ext);
        B1_ext = (Button) this.findViewById(R.id.bodybtn1_ext);
        B2_ext = (Button) this.findViewById(R.id.bodybtn2_ext);
        B4_ext = (Button) this.findViewById(R.id.bodybtn4_ext);
    }

    public void buttonselection4(View view) {


        arr.add(0);
        arr.add(0);
        arr.add(0);
        arr.add(0);
        arr.add(0);

        int id = view.getId();
        switch (id) {
            case R.id.bodybtn1:
            case R.id.bodybtn1_ext:
                //udc.writeToSDFile("Back Pain Survery Started");
                entry = DataEntry.startEntry(interfaceNumber, interfaceName, Joint.getJointFromButtonNumber(1));
                arr.set(0, 1);
                verticalscroll(B1_ext);
                break;
            case R.id.bodybtn2:
            case R.id.bodybtn2_ext:
                //udc.writeToSDFile("Right Hip Survery Started");
                entry = DataEntry.startEntry(interfaceNumber, interfaceName, Joint.getJointFromButtonNumber(2));
                arr.set(1, 1);
                verticalscroll(B2_ext);
                break;
            case R.id.bodybtn3_ext:
                //udc.writeToSDFile("Left Hip Survery Started");
                entry = DataEntry.startEntry(interfaceNumber, interfaceName, Joint.getJointFromButtonNumber(3));
                arr.set(2, 1);
                verticalscroll(B3);
                break;
            case R.id.bodybtn4:
            case R.id.bodybtn4_ext:
                //udc.writeToSDFile("Right Knee Survey Started");
                entry = DataEntry.startEntry(interfaceNumber, interfaceName, Joint.getJointFromButtonNumber(4));
                arr.set(3, 1);
                verticalscroll(B4_ext);
                break;
            case R.id.bodybtn5_ext:
                //udc.writeToSDFile("Left Knee Survey Started");
                entry = DataEntry.startEntry(interfaceNumber, interfaceName, Joint.getJointFromButtonNumber(5));
                arr.set(4, 1);
                verticalscroll(B5);
                break;

        }

    }

    public void verticalscroll(final Button button) {

        d1 = ContextCompat.getDrawable(this, R.drawable.round_button_with_center);
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        AlertDialog dialog;
        alert.setTitle("Pain Survey");

        LayoutInflater inflater = (LayoutInflater)
                this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //View v = inflater.inflate(R.layout.popup4, null);
        View v = inflater.inflate(R.layout.transparent_button_vertical_scroll, null);

        sb = (SeekBar) v.findViewById(R.id.VerticalSeekBar1);

        SeekBar.OnSeekBarChangeListener onChangeListener = new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                System.out.println("HELLO IT'S CHANGED");
                if (progress <= 20) {
                    enableUnclickedLayouts(6);
                } else if (progress <= 40) {
                    enableUnclickedLayouts(5);
                } else if (progress <= 60) {
                    enableUnclickedLayouts(4);
                } else if (progress <= 80) {
                    enableUnclickedLayouts(3);
                } else {
                    enableUnclickedLayouts(2);
                }/* else {
                    enableUnclickedLayouts(1);
                }*/
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
        };

        sb.setOnSeekBarChangeListener(onChangeListener);

        //LL1 = (LinearLayout) v.findViewById(R.id.layoutbutton1);
        LL2 = (LinearLayout) v.findViewById(R.id.layoutbutton2);
        LL3 = (LinearLayout) v.findViewById(R.id.layoutbutton3);
        LL4 = (LinearLayout) v.findViewById(R.id.layoutbutton4);
        LL5 = (LinearLayout) v.findViewById(R.id.layoutbutton5);
        LL6 = (LinearLayout) v.findViewById(R.id.layoutbutton6);

        alert.setView(v);
        alert.setPositiveButton("Save",
                new DialogInterface.OnClickListener()

                {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        int colorToChangeTo = 0;
                        int progress = sb.getProgress();
                        String s;
                        if (progress <= 20) {
                            s = "No Hurt";
                            colorToChangeTo = Utils.getColorForLevel(1);
                            entry.endEntry(0);
                        } else if (progress <= 40) {
                            s = "Hurts Little Bit";
                            colorToChangeTo = Utils.getColorForLevel(2);;
                            entry.endEntry(2);
                        } else if (progress <= 60) {
                            s = "Hurts Little More";
                            colorToChangeTo = Utils.getColorForLevel(3);;
                            entry.endEntry(4);
                        } else if (progress <= 80) {
                            s = "Hurts Even More";
                            colorToChangeTo = Utils.getColorForLevel(4);;
                            entry.endEntry(6);
                        } else {
                            s = "Hurts Whole Lot";
                            colorToChangeTo = Utils.getColorForLevel(5);;
                            entry.endEntry(8);
                        } /*else {
                            s = "Hurts Worst";
                            colorToChangeTo = Utils.getColorForLevel(6);;
                            entry.endEntry(10);
                        }*/
                        //udc.writeToSDFile("Survey 4 submitted");
                        //udc.writeToSDFile("Survey 4 result: " + s);
                        System.out.println(d1);
                        System.out.println(button);
                        d1.setColorFilter(colorToChangeTo, PorterDuff.Mode.SCREEN);
                        button.setBackground(d1);
                        buttonCounter.recordValueStored(button);
                        if (buttonCounter.areButtonsStored(3)) {
                            button1.setEnabled(true);
                        } else {
                            button1.setEnabled(false);
                        }
                        entry.saveEntry();
                    }
                }

        );
        alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener()

                {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        //udc.writeToSDFile("Survey 4 cancelled");
                    }
                }

        );

        dialog = alert.create();
        dialog.show();

    }

    public void onClick(View view) {
        Intent intent = new Intent(this, infopage4.class);
        //sa.surveysRotate();
        startActivity(intent);

        finish();

    }

    public void onface(View v) {
        String facenumber = (String) v.getTag();

        switch (facenumber) {
            /*case "1":
                sb.setProgress(97);
                break;*/
            case "2":
                sb.setProgress(90);
                break;
            case "3":
                sb.setProgress(70);
                break;
            case "4":
                sb.setProgress(50);
                break;
            case "5":
                sb.setProgress(30);
                break;
            case "6":
                sb.setProgress(10);
                break;

        }
    }

    private void enableUnclickedLayouts(int selected) {
      //  LL1.setEnabled(selected != 1);
        LL2.setEnabled(selected != 2);
        LL3.setEnabled(selected != 3);
        LL4.setEnabled(selected != 4);
        LL5.setEnabled(selected != 5);
        LL6.setEnabled(selected != 6);
    }

    public void onBackPressed() {
    }


}