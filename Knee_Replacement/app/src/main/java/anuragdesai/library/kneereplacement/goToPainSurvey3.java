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
import android.widget.SeekBar;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anurag on 11/2/2015.
 */
public class goToPainSurvey3 extends AppCompatActivity implements View.OnClickListener {

    private UserDataCollector udc;
    private SeekBar sb;
    private Button button1;
    public Button B1;
    public Button B2;
    public Button B3;
    public Button B4;
    public Button B5;
    public List<Integer> arr = new ArrayList<Integer>();
    private Utils.buttonCounter buttonCounter = new Utils.buttonCounter();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.painsurvey3);
        udc = new UserDataCollector();
        setTitle("Horizontal Slide");
        button1 = (Button) this.findViewById(R.id.interface3next);
        button1.setOnClickListener(this);
        button1.setEnabled(false);
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
                horizontalscroll(B1);
                break;
            case R.id.bodybtn2:
                udc.writeToSDFile("Right Hip Survery Started");
                arr.set(1, 1);
                horizontalscroll(B2);
                break;
            case R.id.bodybtn3:
                udc.writeToSDFile("Left Hip Survery Started");
                arr.set(2, 1);
                horizontalscroll(B3);
                break;
            case R.id.bodybtn4:
                udc.writeToSDFile("Right Knee Survey Started");
                arr.set(3, 1);
                horizontalscroll(B4);
                break;
            case R.id.bodybtn5:
                udc.writeToSDFile("Left Knee Survey Started");
                arr.set(4, 1);
                horizontalscroll(B5);
                break;

        }

    }

    public void horizontalscroll(final Button button) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        AlertDialog dialog;
        alert.setTitle("Pain Survey");

        LayoutInflater inflater = (LayoutInflater)
                this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.popup3, null);

        sb = (SeekBar) v.findViewById(R.id.seekBar);

        alert.setView(v);
        alert.setPositiveButton("Save",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        int colorToChangeTo = 0;
                        int progress = sb.getProgress();
                        String s;

                        if (progress <= 16.7) {
                            s = "No Hurt";
                            colorToChangeTo = Utils.getColorForLevel(1);
                        } else if (progress <= 33.3) {
                            s = "Hurts Little Bit";
                            colorToChangeTo = Utils.getColorForLevel(2);
                        } else if (progress <= 50) {
                            s = "Hurts Little More";
                            colorToChangeTo = Utils.getColorForLevel(3);
                        } else if (progress <= 66.7) {
                            s = "Hurts Even More";
                            colorToChangeTo = Utils.getColorForLevel(4);
                        } else if (progress <= 83.3) {
                            s = "Hurts Whole Lot";
                            colorToChangeTo = Utils.getColorForLevel(5);
                        } else {
                            s = "Hurts Worst";
                            colorToChangeTo = Utils.getColorForLevel(6);
                        }
                        udc.writeToSDFile("Survey 3 submitted");
                        udc.writeToSDFile("Survey 3 result: " + s);
                        button.setBackgroundColor(colorToChangeTo);
                        buttonCounter.recordValueStored(button);
                        /*if (buttonCounter.areButtonsStored(3)) {
                            button1.setEnabled(true);
                        } else {
                            button1.setEnabled(false);
                        }*/

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
        Intent intent = new Intent(this, infopage3.class);
        //sa.surveysRotate();
        startActivity(intent);

    }
    public void onface(View v) {
        String facenumber = (String) v.getTag();

        switch (facenumber) {
            case "6":
                sb.setProgress(97);
                break;
            case "5":
                sb.setProgress(77);
                break;
            case "4":
                sb.setProgress(58);
                break;
            case "3":
                sb.setProgress(40);
                break;
            case "2":
                sb.setProgress(22);
                break;
            case "1":
                sb.setProgress(5);
                break;

        }
    }

    public void showlegend(View view)
    {
        AlertDialog.Builder alert_legend = new AlertDialog.Builder(this);
        AlertDialog dialog;
        alert_legend.setTitle("Legends");

        LayoutInflater inflater = (LayoutInflater)
                this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.legends, null);
        alert_legend.setPositiveButton("Ok",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        dialog.dismiss();
                    }
                });
        alert_legend.setView(v);
        dialog = alert_legend.create();
        dialog.show();
    }

    public void onBackPressed() {
    }

}

