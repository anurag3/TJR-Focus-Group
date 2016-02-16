package anuragdesai.library.kneereplacement;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

/**
 * Created by Anurag on 10/16/2015.
 */
public class Taptap3 extends BaseSurveyPage {

    public Button button1,button2,button4;
    public static int count5;

    protected void onCreate(Bundle savedInstanceState) {
        interfaceName = "TapTap3";
        interfaceNumber = 5;

        System.gc();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.painsurvey5);
        setTitle("3 Taps");


        Button buttonnxt = (Button) this.findViewById(R.id.interface5next);
        NextButtonController buttonController = new NextButtonController(buttonnxt, this, new Intent(this, infopage5.class));
        buttonnxt.setOnClickListener(buttonController);
        buttonnxt.setEnabled(false);

       /* Button button1 = (Button) this.findViewById(R.id.bodybtn1);
        button1.setOnClickListener(new basebodybutton(button1, this, 1, buttonController));

        Button button2 = (Button) this.findViewById(R.id.bodybtn2);
        button2.setOnClickListener(new basebodybutton(button2, this, 2, buttonController));


        Button button3 = (Button) this.findViewById(R.id.bodybtn3);
        button3.setOnClickListener(new basebodybutton(button3, this, 3, buttonController));

        Button button4 = (Button) this.findViewById(R.id.bodybtn4);
        button4.setOnClickListener(new basebodybutton(button4, this, 4, buttonController));

        Button button5 = (Button) this.findViewById(R.id.bodybtn5);
        button5.setOnClickListener(new basebodybutton(button5, this, 5, buttonController));
*/
        Button button1_ext = (Button) this.findViewById(R.id.bodybtn1_ext);
        button1_ext.setOnClickListener(new basebodybutton(button1_ext, this, 1, buttonController));

        Button button2_ext  = (Button) this.findViewById(R.id.bodybtn2_ext);
        button2_ext.setOnClickListener(new basebodybutton(button2_ext, this, 2, buttonController));

        Button button4_ext  = (Button) this.findViewById(R.id.bodybtn4_ext);
        button4_ext.setOnClickListener(new basebodybutton(button4_ext, this, 4, buttonController));

    }
    /*public void checker()
    {
        if(count5>=3)
        {
            button1 = (Button) this.findViewById(R.id.interface5next);
            button1.setVisibility(View.VISIBLE);
        }

    }*/

    public void onBackPressed() {
    }

}
