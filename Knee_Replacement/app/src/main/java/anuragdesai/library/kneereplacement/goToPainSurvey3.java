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


        int id = view.getId();
        switch (id) {
            case R.id.bodybtn1:
                udc.writeToSDFile("Back Pain Survery Started");
                horizontalscroll();

                break;
            case R.id.bodybtn2:
                udc.writeToSDFile("Right Hip Survery Started");
                horizontalscroll();

                break;
            case R.id.bodybtn3:
                udc.writeToSDFile("Left Hip Survery Started");

                horizontalscroll();
                break;
            case R.id.bodybtn4:
                udc.writeToSDFile("Right Knee Survey Started");
                horizontalscroll();

                break;
            case R.id.bodybtn5:
                udc.writeToSDFile("Left Knee Survey Started");
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
                        //if(i%2==1)
                        count3++;
                        //i++;

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
        if(count3>=3) {
            //gotoSurveyActivity sa = new gotoSurveyActivity();

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

