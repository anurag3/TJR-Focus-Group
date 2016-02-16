package anuragdesai.library.kneereplacement;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
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
    public Drawable d1;
    public DataEntry entry = null;

    public basetaptap6button(Button taptap6button, Taptap6 M, int buttonNum, NextButtonController nextBtn) {
        this.taptap6button = taptap6button;
        this.M = M;
        this.buttonNum = buttonNum;
        this.nextBtn = nextBtn;
        buttonsPressed = 0;
        //d1= getResources().getDrawable(R.drawable.roundbutton1);
        d1 = ContextCompat.getDrawable(M, R.drawable.round_button_with_center);
    }


    public void onClick(View view) {
        int value = -1;
        if(entry == null){
            entry = DataEntry.startEntry(6, "TapTap6", Joint.getJointFromButtonNumber(buttonNum));

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
            d1 = ContextCompat.getDrawable(M, R.drawable.round_button_with_center);


            if (i == 7) {
                i = 0;
            }
            if (i == 0) {
                d1.setColorFilter(Color.GRAY, PorterDuff.Mode.SCREEN);
                taptap6button.setBackground(d1);
                value = -1;
                //taptap6button.setBackgroundColor(Color.GRAY);
            }


            if (i == 1) {
                value = 0;
                d1.setColorFilter(Color.parseColor("#FF669900"), PorterDuff.Mode.SCREEN);
                taptap6button.setBackground(d1);
                //taptap6button.setBackgroundColor(Color.parseColor("#FF669900"));
//                Toast.makeText(M.getApplicationContext(), "No Hurt",
//                        Toast.LENGTH_SHORT).show();
                ToastManager.makeNewToastMessage(M.getApplicationContext(), "0. No Hurt");
            }
            if (i == 2) {
                value = 2;
                d1.setColorFilter(Color.parseColor("#FF99CC00"), PorterDuff.Mode.SCREEN);
                taptap6button.setBackground(d1);
                //taptap6button.setBackgroundColor(Color.parseColor("#FF99CC00"));
//                Toast.makeText(M.getApplicationContext(), "Hurts Little Bit",
//                        Toast.LENGTH_SHORT).show();
                ToastManager.makeNewToastMessage(M.getApplicationContext(), "2. Hurts Little Bit");
            }
            if (i == 3) {
                value = 4;
                d1.setColorFilter(Color.YELLOW, PorterDuff.Mode.SCREEN);
                taptap6button.setBackground(d1);
                //taptap6button.setBackgroundColor(Color.YELLOW);
//                Toast.makeText(M.getApplicationContext(), "Hurts Little More",
//                        Toast.LENGTH_SHORT).show();
                ToastManager.makeNewToastMessage(M.getApplicationContext(), "4. Hurts Little More");
            }
            if (i == 4) {
                value = 6;
                d1.setColorFilter(Color.parseColor("#FFFFBB33"), PorterDuff.Mode.SCREEN);
                taptap6button.setBackground(d1);
                //taptap6button.setBackgroundColor(Color.parseColor("#FFFFBB33"));
//                Toast.makeText(M.getApplicationContext(), "Hurts Even More",
//                        Toast.LENGTH_SHORT).show();
                ToastManager.makeNewToastMessage(M.getApplicationContext(), "6. Hurts Even More");
            }
            if (i == 5) {
                value = 8;
                d1.setColorFilter(Color.parseColor("#FFFF8800"), PorterDuff.Mode.SCREEN);
                taptap6button.setBackground(d1);
                //taptap6button.setBackgroundColor(Color.parseColor("#FFFF8800"));
//                Toast.makeText(M.getApplicationContext(), "Hurts Whole Lot",
//                        Toast.LENGTH_SHORT).show();
                ToastManager.makeNewToastMessage(M.getApplicationContext(), "8. Hurts Whole Lot");
            }
            if (i == 6) {
                value = 10;
                d1.setColorFilter(Color.RED, PorterDuff.Mode.SCREEN);
                taptap6button.setBackground(d1);
                //taptap6button.setBackgroundColor(Color.RED);
//                Toast.makeText(M.getApplicationContext(), "Hurts Worst",
//                        Toast.LENGTH_SHORT).show();
                ToastManager.makeNewToastMessage(M.getApplicationContext(), "10. Hurts Worst");
            }


        }
        /*
        buttonnxt bNext=new buttonnxt();
        bNext.inputB1(i);
        */

        entry.endEntry(value);
        switch(buttonNum){
            default:
            case 1:
                nextBtn.b1 = value;
                break;
            case 2:
                nextBtn.b2 = value;
                break;
            case 3:
                nextBtn.b3 = value;
                break;
            case 4:
                nextBtn.b4 = value;
                break;
            case 5:
                nextBtn.b5 = value;
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
