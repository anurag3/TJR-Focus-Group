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

/**
 * Created by Anurag on 11/2/2015.
 */
public class goToPainSurvey4 extends AppCompatActivity implements View.OnClickListener {

    private UserDataCollector udc;
    private Button button1;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.painsurvey4);
        udc = new UserDataCollector();
        setTitle("Interface 4");
    }


    public void verticalscroll(View view)
    {
    AlertDialog.Builder alert = new AlertDialog.Builder(this);
    AlertDialog dialog;
    alert.setTitle("Pain Survey");

    LayoutInflater inflater = (LayoutInflater)
            this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    View v = inflater.inflate(R.layout.popup4, null);

    final SeekBar sb = (SeekBar) v.findViewById(R.id.VerticalSeekBar1);

    alert.setView(v);
    alert.setPositiveButton("Save",
            new DialogInterface.OnClickListener()

            {
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
            }

    );
    alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener()

            {
                public void onClick(DialogInterface dialog, int whichButton) {
                    udc.writeToSDFile("Survey 4 cancelled");
                }
            }

    );


    dialog=alert.create();
    dialog.show();

}
    public void onClick(View view) {
        //gotoSurveyActivity sa = new gotoSurveyActivity();
        button1 = (Button) this.findViewById(R.id.interface4next);
        button1.setOnClickListener(this);
        Intent intent = new Intent(this,infopage4.class);
        //sa.surveysRotate();
        startActivity(intent);

    }
}