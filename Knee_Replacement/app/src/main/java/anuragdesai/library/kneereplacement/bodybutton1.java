package anuragdesai.library.kneereplacement;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


/**
 * Created by Anurag on 10/21/2015.
 */
public class bodybutton1 extends basebodybutton implements OnClickListener {

   /* int i=0;
    Button button1;
    public UserDataCollector udc;
    public String tyu;
    Taptap3 M;
    Button button;*/


    public bodybutton1(Button button1, Taptap3 M) {
        super(button1, M, 1);
        //this.button1= button1;
        //this.M = M;


    }

//
//
//    public void onClick(View view) {
//        {
//            i++;
//
//            if (i == 4)
//                i = 0;
//            if (i == 0)
//                button1.setBackgroundColor(Color.GRAY);
//
//            if (i == 1) {
//                button1.setBackgroundColor(Color.GREEN);
//               /* Context context1 = this.getApplicationContext();
//                CharSequence text1 = "No Hurt - Hurts Little Bit";
//                int duration1 = Toast.LENGTH_SHORT;
//                Toast toast1 = Toast.makeText(context1, text1, duration1);
//                toast1.show();*/
//                Toast.makeText(M.getApplicationContext(), "No Hurt - Hurts Little Bit",
//                        Toast.LENGTH_SHORT).show();
//            }
//            if (i == 2) {
//                button1.setBackgroundColor(Color.YELLOW);
//               /* Context context2 = getApplicationContext();
//                CharSequence text2 = "Hurts Little More - Hurts Even More";
//                int duration2 = Toast.LENGTH_SHORT;
//                Toast toast2 = Toast.makeText(context2, text2, duration2);
//                toast2.show();
//                */
//                Toast.makeText(M.getApplicationContext(), "Hurts Little More - Hurts Even More",
//                        Toast.LENGTH_SHORT).show();
//            }
//            if (i == 3) {
//                button1.setBackgroundColor(Color.RED);
//              /*  Context context3 = getApplicationContext();
//                CharSequence text3 = "Hurts Whole Lot - Hurts Worst";
//                int duration3 = Toast.LENGTH_SHORT;
//                Toast toast3 = Toast.makeText(context3, text3, duration3);
//                toast3.show();*/
//                Toast.makeText(M.getApplicationContext(), "Hurts Whole Lot - Hurts Worst",
//                        Toast.LENGTH_SHORT).show();
//            }
//        }
//        /*
//        buttonnxt bNext=new buttonnxt();
//        bNext.inputB1(i);
//        */
//        buttonnxt.b1 = i;
//        Taptap3.count5++;
//        System.out.println("Count5 ="+Taptap3.count5);
//    }
//
//        /*
//        System.out.println(i);
//        tyu = String.valueOf(i);
//        udc = new UserDataCollector();
//        udc.checkExternalMedia();
//        udc.writeToSDFile("Hip_Pain_Level = "+tyu);
//        */
//    }
}