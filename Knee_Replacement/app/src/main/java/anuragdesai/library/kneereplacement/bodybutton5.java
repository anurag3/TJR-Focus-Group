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
public class bodybutton5 extends basebodybutton implements OnClickListener {

    /*int i = 0;
    Button button5;
    Button button1;
    public UserDataCollector udc;
    public String tyu;
    Taptap3 M;
    Toast mToast;*/


    public bodybutton5(Button button5, Taptap3 M) {
        super(button5, M, 5);
        /*this.button5 = button5;
        this.M = M;
        this.mToast = Toast.makeText(M.getApplicationContext(), "",
                Toast.LENGTH_SHORT);*/

    }

/*
    public void onClick(View view) {
        {
            i++;
            //mToast.cancel();

            if (i == 4)
                i = 0;
            if (i == 0)
                button5.setBackgroundColor(Color.GRAY);
            if (i == 1) {
                button5.setBackgroundColor(Color.GREEN);
                ToastManager.makeNewToastMessage(M.getApplicationContext(), "No Hurt - Hurts Little Bit");

                //Toast.makeText(M.getApplicationContext(), "No Hurt - Hurts Little Bit",
                //Toast.LENGTH_SHORT).show();
            }
            if (i == 2) {
                button5.setBackgroundColor(Color.YELLOW);
                ToastManager.makeNewToastMessage(M.getApplicationContext(), "Hurts Little More - Hurts Even More");

                //Toast.makeText(M.getApplicationContext(), "Hurts Little More - Hurts Even More",
                //Toast.LENGTH_SHORT).show();
            }
            if (i == 3) {
                button5.setBackgroundColor(Color.RED);
                ToastManager.makeNewToastMessage(M.getApplicationContext(), "Hurts Whole Lot - Hurts Worst");
                //Toast.makeText(M.getApplicationContext(), "Hurts Whole Lot - Hurts Worst",
                //Toast.LENGTH_SHORT).show();
            }
        }
        buttonnxt.b5 = i;
        Taptap3.count5++;
        System.out.println("Count5 =" + Taptap3.count5);

    } */

        /*
        System.out.println(i);
        tyu = String.valueOf(i);
        udc = new UserDataCollector();
        udc.checkExternalMedia();
        udc.writeToSDFile("Left_Ankle_Pain_Level = "+tyu);
    */
}