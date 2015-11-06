package anuragdesai.library.kneereplacement;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Anurag on 11/3/2015.
 */
public class taptap6button1 extends AppCompatActivity implements View.OnClickListener {

    int i=0;
    Button taptap6button1;
    public UserDataCollector udc;
    public String tyu;
    Taptap6 M;

    public taptap6button1(Button taptap6button1,Taptap6 M) {
        this.taptap6button1= taptap6button1;
        this.M = M;
    }




    public void onClick(View view) {
        {
            i++;


            if (i == 7)
                i = 0;
            if (i == 0)
                taptap6button1.setBackgroundColor(Color.GRAY);


            if (i == 1) {
                taptap6button1.setBackgroundColor(Color.GREEN);
                Toast.makeText(M.getApplicationContext(), "No Hurt",
                        Toast.LENGTH_SHORT).show();
            }
            if (i == 2) {
                taptap6button1.setBackgroundColor(Color.YELLOW);
                Toast.makeText(M.getApplicationContext(), "Hurts Little Bit",
                        Toast.LENGTH_SHORT).show();
            }
            if (i == 3) {
                taptap6button1.setBackgroundColor(Color.YELLOW);
                Toast.makeText(M.getApplicationContext(), "Hurts Little More",
                        Toast.LENGTH_SHORT).show();
            }
            if (i == 4) {
                taptap6button1.setBackgroundColor(Color.YELLOW);
                Toast.makeText(M.getApplicationContext(), "Hurts Even More",
                        Toast.LENGTH_SHORT).show();
            }
            if (i == 5) {
                taptap6button1.setBackgroundColor(Color.YELLOW);
                Toast.makeText(M.getApplicationContext(), "Hurts Whole Lot",
                        Toast.LENGTH_SHORT).show();
            }
            if (i == 6) {
                taptap6button1.setBackgroundColor(Color.RED);
                Toast.makeText(M.getApplicationContext(), "Hurts Worst",
                        Toast.LENGTH_SHORT).show();
            }


        }
        /*
        buttonnxt bNext=new buttonnxt();
        bNext.inputB1(i);
        */
        taptap6buttonnxt.b1=i;
        /*
        System.out.println(i);
        tyu = String.valueOf(i);
        udc = new UserDataCollector();
        udc.checkExternalMedia();
        udc.writeToSDFile("Hip_Pain_Level = "+tyu);
        */
    }}
