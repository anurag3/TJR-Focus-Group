package anuragdesai.library.kneereplacement;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * Created by Anurag on 10/21/2015.
 */
public class basebodybutton extends AppCompatActivity implements OnClickListener {

    int i = 0;
    Button button;
    //public UserDataCollector udc;
    //public String tyu;
    Taptap3 M;
    int buttonNum = -1;


    public basebodybutton(Button button5, Taptap3 M, int buttonNum) {
        this.button = button5;
        this.M = M;
        this.buttonNum = buttonNum;

    }


    public void onClick(View view) {
        {
            i++;
            //mToast.cancel();

            if (i == 4)
                i = 0;
            if (i == 0)
                button.setBackgroundColor(Color.GRAY);
            if (i == 1) {
                button.setBackgroundColor(Color.GREEN);
                ToastManager.makeNewToastMessage(M.getApplicationContext(), "No Hurt - Hurts Little Bit");

                //Toast.makeText(M.getApplicationContext(), "No Hurt - Hurts Little Bit",
                //Toast.LENGTH_SHORT).show();
            }
            if (i == 2) {
                button.setBackgroundColor(Color.YELLOW);
                ToastManager.makeNewToastMessage(M.getApplicationContext(), "Hurts Little More - Hurts Even More");

                //Toast.makeText(M.getApplicationContext(), "Hurts Little More - Hurts Even More",
                //Toast.LENGTH_SHORT).show();
            }
            if (i == 3) {
                button.setBackgroundColor(Color.RED);
                ToastManager.makeNewToastMessage(M.getApplicationContext(), "Hurts Whole Lot - Hurts Worst");
                //Toast.makeText(M.getApplicationContext(), "Hurts Whole Lot - Hurts Worst",
                //Toast.LENGTH_SHORT).show();
            }
        }

        switch(buttonNum){
            default:
            case 1:
                buttonnxt.b1 = i;
                break;
            case 2:
                buttonnxt.b2 = i;
                break;
            case 3:
                buttonnxt.b3 = i;
                break;
            case 4:
                buttonnxt.b4 = i;
                break;
            case 5:
                buttonnxt.b5 = i;
                break;
        }
        //buttonnxt.b5 = i;
        Taptap3.count5++;
        System.out.println("Count" + buttonNum + " =" + Taptap3.count5);

    }

        /*
        System.out.println(i);
        tyu = String.valueOf(i);
        udc = new UserDataCollector();
        udc.checkExternalMedia();
        udc.writeToSDFile("Left_Ankle_Pain_Level = "+tyu);
    */
}