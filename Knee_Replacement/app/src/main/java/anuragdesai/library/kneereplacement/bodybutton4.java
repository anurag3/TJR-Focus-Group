package anuragdesai.library.kneereplacement;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Anurag on 10/21/2015.
 */
public class bodybutton4 extends AppCompatActivity implements OnClickListener{

    int i=0;
    Button button4;
    public UserDataCollector udc;
    public String tyu;
    Taptap3 M;



    public bodybutton4(Button button4,Taptap3 M) {
        this.button4= button4;
        this.M = M;
    }




    public void onClick(View view) {
        {
            i++;

            if (i == 4)
                i = 0;
            if (i == 0)
                button4.setBackgroundColor(Color.GRAY);
            if (i == 1){
                button4.setBackgroundColor(Color.GREEN);
            Toast.makeText(M.getApplicationContext() , "No Hurt - Hurts Little Bit",
                    Toast.LENGTH_SHORT).show();}
            if (i == 2) {
                button4.setBackgroundColor(Color.YELLOW);
                Toast.makeText(M.getApplicationContext(), "Hurts Little More - Hurts Even More",
                        Toast.LENGTH_SHORT).show();
            }if (i == 3) {
            button4.setBackgroundColor(Color.RED);
            Toast.makeText(M.getApplicationContext(), "Hurts Whole Lot - Hurts Worst",
                    Toast.LENGTH_SHORT).show();
        }
        }
        buttonnxt.b4=i;
        /*
        System.out.println(i);
        tyu = String.valueOf(i);
        udc = new UserDataCollector();
        udc.checkExternalMedia();
        udc.writeToSDFile("Right_Ankle_Pain_Level = "+tyu);
 */
    }}