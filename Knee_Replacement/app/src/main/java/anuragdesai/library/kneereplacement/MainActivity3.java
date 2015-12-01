package anuragdesai.library.kneereplacement;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Toast;




/**
 * Created by Anurag on 10/19/2015.
 */
public class MainActivity3 extends AppCompatActivity {

    private RadioButton RB1;
    private RadioButton RB2;
    private RadioButton RB3;
    private RadioButton RB4;
    private RadioButton RB5;
    private RadioButton RB6;
    //private UserDataCollector udc;
    Boolean b = false;
    private Button B1;
    private Button B2;
    private Button B3;
    private Button B4;
    private Button B5;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.painsurvey1);
        //udc= new UserDataCollector();
    }
/*
    public void goToPainSurvey(View view) {
        B1 = (Button) view.findViewById(R.id.bodybtn11);
        B2 = (Button) view.findViewById(R.id.bodybtn21);
        B3 = (Button) view.findViewById(R.id.bodybtn31);
        B4 = (Button) view.findViewById(R.id.bodybtn41);
        B5 = (Button) view.findViewById(R.id.bodybtn51);





        int id=view.getId();
        switch(id) {
            case R.id.bodybtn11:
                udc.writeToSDFile("Hip_Pain_Survery_Started");
                //surveyscalls();
                goToPainSurvey1();
                break;
            case R.id.bodybtn21:
                udc.writeToSDFile("Right_Quadriceps_Survery_Started");
                //surveyscalls();
                goToPainSurvey1();
                break;
            case R.id.bodybtn31:
                udc.writeToSDFile("Left_Quadriceps_Survery_Started");
                //surveyscalls();
                goToPainSurvey1();
                break;
            case R.id.bodybtn41:
                udc.writeToSDFile("Right_Ankle_Survey_Started");
                //surveyscalls();
                goToPainSurvey1();
                break;
            case R.id.bodybtn51:
                udc.writeToSDFile("Left_Ankle_Survey_Started");
                //surveyscalls();
                goToPainSurvey1();
                break;

       }
    }


   /* public boolean surveyscalls() {
        String order = "";
        for(int i=1;i<5;i++) {
            order = order + " " + Integer.toString(i);


    switch (i) {
        case 1:
            udc.writeToSDFile("Survey 1 start");
            goToPainSurvey1();
            i++;
            break;
        case 2:
            udc.writeToSDFile("Survey 2 start");
            goToPainSurvey2();
            i++;
            break;
        case 3:
            udc.writeToSDFile("Survey 3 start");
            goToPainSurvey3();
            i++;
            break;
        case 4:
            udc.writeToSDFile("Survey 4 start");
            goToPainSurvey4();
            i=1;
            break;
        default:
    }}
    return false;
}
*/



 /*   public void goToPainSurvey1() {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        final AlertDialog dialog;
        alert.setTitle("Pain_Survey_1");

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
                    //surveyscalls();
                    goToPainSurvey2();

                    dialog.dismiss();

                }

                //else dialog stays open. Make sure you have an obvious way to close the dialog especially if you set cancellable to false.
            }
        });
    }


    public void goToPainSurvey2() {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        final AlertDialog dialog;
        alert.setTitle("Pain Survey");

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
                udc.writeToSDFile("Survey 2 submitted");
                if (RB6.isChecked()) {
                    udc.writeToSDFile("Survey 2 result: No Hurt");
                    b = true;
                } else if (RB5.isChecked()) {
                    udc.writeToSDFile("Survey 2 result: Hurts Little Bit");
                    b = true;
                } else if (RB4.isChecked()) {
                    udc.writeToSDFile("Survey 2 result: Hurts Little More");
                    b = true;
                } else if (RB3.isChecked()) {
                    udc.writeToSDFile("Survey 2 result: Hurts Even More");
                    b = true;
                } else if (RB2.isChecked()) {
                    udc.writeToSDFile("Survey 2 result: Hurts Whole Lot");
                    b = true;
                } else if (RB1.isChecked()) {
                    udc.writeToSDFile("Survey 2 result: Hurts Worst");
                    b = true;
                } else {
                    Toast.makeText(getApplicationContext(), "Please Select A Pain Level",
                            Toast.LENGTH_SHORT).show();
                }

                if (b) {
                    //surveyscalls();
                    goToPainSurvey3();
                    System.out.println("inside 2");
                    dialog.dismiss();
                }
            }
        });
    }


    public void goToPainSurvey3() {
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
                        goToPainSurvey4();
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

        System.out.println("inside 31");

        System.out.println("inside 3");

       // dialog.dismiss();



    }




    public void goToPainSurvey4() {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        AlertDialog dialog;
        alert.setTitle("Pain Survey");

        LayoutInflater inflater = (LayoutInflater)
                this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.popup4, null);

        final SeekBar sb = (SeekBar) v.findViewById(R.id.VerticalSeekBar1);

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
                        udc.writeToSDFile("Survey 4 submitted");
                        udc.writeToSDFile("Survey 4 result: " + s);

                    }
                });
        alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                udc.writeToSDFile("Survey 4 cancelled");
            }
        });



        dialog = alert.create();
        dialog.show();


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

public void onClickExit(View v){
    finish();
    System.exit(0);
}
*/


}