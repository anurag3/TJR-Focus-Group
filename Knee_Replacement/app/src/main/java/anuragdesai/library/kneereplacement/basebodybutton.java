package anuragdesai.library.kneereplacement;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
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
    boolean pressedYet = false;
    NextButtonController nextBtn = null;
    public Drawable d1;
    public DataEntry entry = null;

    public basebodybutton(Button button, Taptap3 M, int buttonNum, NextButtonController nextBtn) {
        this.button = button;
        this.M = M;
        this.buttonNum = buttonNum;
        this.nextBtn = nextBtn;
        //d1= getResources().getDrawable(R.drawable.roundbutton);
        d1 = ContextCompat.getDrawable(M, R.drawable.roundbutton);

    }


    public void onClick(View view) {
        if(entry == null){
            entry = DataEntry.startEntry(5, "TapTap3", Joint.getJointFromButtonNumber(buttonNum));

            switch(buttonNum){
                case 1:
                    nextBtn.entry1 = entry;
                    break;
                case 2:
                    nextBtn.entry2 = entry;
                    break;
                case 3:
                    nextBtn.entry3 = entry;
                    break;
                case 4:
                    nextBtn.entry4 = entry;
                    break;
                case 5:
                    nextBtn.entry5 = entry;
                    break;
            }
        }

        {
            i++;
            //mToast.cancel();
            d1 = ContextCompat.getDrawable(M, R.drawable.roundbutton);

            if (i == 4)
                i = 0;
            if (i == 0) {
                d1.setColorFilter(Color.GRAY, PorterDuff.Mode.SRC_ATOP);
                button.setBackground(d1);
                //button.setBackgroundColor(Color.GRAY);
            }
            if (i == 1) {
                d1.setColorFilter(Color.GREEN, PorterDuff.Mode.SRC_ATOP);
                button.setBackground(d1);
                //button.setBackgroundColor(Color.GREEN);
                ToastManager.makeNewToastMessage(M.getApplicationContext(), "No Hurt - Hurts Little Bit");

                //Toast.makeText(M.getApplicationContext(), "No Hurt - Hurts Little Bit",
                //Toast.LENGTH_SHORT).show();
            }
            if (i == 2) {
                d1.setColorFilter(Color.YELLOW, PorterDuff.Mode.SRC_ATOP);
                button.setBackground(d1);
                //button.setBackgroundColor(Color.YELLOW);
                ToastManager.makeNewToastMessage(M.getApplicationContext(), "Hurts Little More - Hurts Even More");

                //Toast.makeText(M.getApplicationContext(), "Hurts Little More - Hurts Even More",
                //Toast.LENGTH_SHORT).show();
            }
            if (i == 3) {
                d1.setColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP);
                button.setBackground(d1);
                //button.setBackgroundColor(Color.RED);
                ToastManager.makeNewToastMessage(M.getApplicationContext(), "Hurts Whole Lot - Hurts Worst");
                //Toast.makeText(M.getApplicationContext(), "Hurts Whole Lot - Hurts Worst",
                //Toast.LENGTH_SHORT).show();
            }
        }

        switch(buttonNum){
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
        //buttonnxt.b5 = i;
        if(!pressedYet) {
            Taptap3.count5++;
            pressedYet = true;
        }

        if(Taptap3.count5 >= 3){
            nextBtn.setButtonEnabled(true);
        }
        else{
            nextBtn.setButtonEnabled(false);
        }

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