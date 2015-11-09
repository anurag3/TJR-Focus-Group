package anuragdesai.library.kneereplacement;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Anurag on 11/3/2015.
 */
public class basetaptap6button extends AppCompatActivity implements View.OnClickListener {

    int i = 0;
    Button taptap6button;
    //public UserDataCollector udc;
    //public String tyu;
    Taptap6 M;
    int buttonNum = -1;
    NextButtonController nextBtn;
    boolean pressedYet = false;
    static int buttonsPressed = 0;

    public basetaptap6button(Button taptap6button, Taptap6 M, int buttonNum, NextButtonController nextBtn) {
        this.taptap6button = taptap6button;
        this.M = M;
        this.buttonNum = buttonNum;
        this.nextBtn = nextBtn;
        buttonsPressed = 0;
    }


    public void onClick(View view) {
        {
            i++;


            if (i == 7)
                i = 0;
            if (i == 0) {
                taptap6button.setBackgroundColor(Color.GRAY);
            }


            if (i == 1) {
                taptap6button.setBackgroundColor(Color.parseColor("#FF669900"));
//                Toast.makeText(M.getApplicationContext(), "No Hurt",
//                        Toast.LENGTH_SHORT).show();
                ToastManager.makeNewToastMessage(M.getApplicationContext(), "No Hurt");
            }
            if (i == 2) {
                taptap6button.setBackgroundColor(Color.parseColor("#FF99CC00"));
//                Toast.makeText(M.getApplicationContext(), "Hurts Little Bit",
//                        Toast.LENGTH_SHORT).show();
                ToastManager.makeNewToastMessage(M.getApplicationContext(), "Hurts Little Bit");
            }
            if (i == 3) {
                taptap6button.setBackgroundColor(Color.YELLOW);
//                Toast.makeText(M.getApplicationContext(), "Hurts Little More",
//                        Toast.LENGTH_SHORT).show();
                ToastManager.makeNewToastMessage(M.getApplicationContext(), "Hurts Little More");
            }
            if (i == 4) {
                taptap6button.setBackgroundColor(Color.parseColor("#FFFFBB33"));
//                Toast.makeText(M.getApplicationContext(), "Hurts Even More",
//                        Toast.LENGTH_SHORT).show();
                ToastManager.makeNewToastMessage(M.getApplicationContext(), "Hurts Even More");
            }
            if (i == 5) {
                taptap6button.setBackgroundColor(Color.parseColor("#FFFF8800"));
//                Toast.makeText(M.getApplicationContext(), "Hurts Whole Lot",
//                        Toast.LENGTH_SHORT).show();
                ToastManager.makeNewToastMessage(M.getApplicationContext(), "Hurts Whole Lot");
            }
            if (i == 6) {
                taptap6button.setBackgroundColor(Color.RED);
//                Toast.makeText(M.getApplicationContext(), "Hurts Worst",
//                        Toast.LENGTH_SHORT).show();
                ToastManager.makeNewToastMessage(M.getApplicationContext(), "Hurts Worst");
            }


        }
        /*
        buttonnxt bNext=new buttonnxt();
        bNext.inputB1(i);
        */

        switch (buttonNum) {
            default:
            case 1:
                nextBtn.b1 = i;
                break;
            case 2:
                nextBtn.b2 = i;
                break;
            case 3:
                nextBtn.b3 = i;
                break;
            case 4:
                nextBtn.b4 = i;
                break;
            case 5:
                nextBtn.b5 = i;
                break;
        }
        //taptap6buttonnxt.b1=i;
        if(!pressedYet) {
            buttonsPressed++;
            pressedYet = true;
        }

        if(buttonsPressed >= 3){
            nextBtn.setButtonEnabled(true);
        }
        else{
            nextBtn.setButtonEnabled(false);
        }

        System.out.println("Count" + buttonNum + " =" + buttonsPressed);
        /*
        System.out.println(i);
        tyu = String.valueOf(i);
        udc = new UserDataCollector();
        udc.checkExternalMedia();
        udc.writeToSDFile("Hip_Pain_Level = "+tyu);
        */
    }
}
