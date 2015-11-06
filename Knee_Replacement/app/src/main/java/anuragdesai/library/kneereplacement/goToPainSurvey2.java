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

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.painsurvey2);
        udc= new UserDataCollector();
        setTitle("Interface 2");
        //final ActionBar supportAB = getSupportActionBar();
        //supportAB.setTitle("R E L A X");
    }

    public void verticaltap(View view) {
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
                    dialog.dismiss();
                }
            }
        });
    }



    public void onClick(View view) {

        button1 = (Button) this.findViewById(R.id.interface2next);
        button1.setOnClickListener(this);
        Intent intent = new Intent(this,infopage2.class);
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
}
