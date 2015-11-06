package anuragdesai.library.kneereplacement;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

/**
 * Created by Anurag on 10/16/2015.
 */
public class Taptap3 extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.painsurvey5);
        setTitle("Interface 5");


        Button button1 = (Button) this.findViewById(R.id.bodybtn1);
        button1.setOnClickListener(new bodybutton1(button1,this));
        Button button2 = (Button) this.findViewById(R.id.bodybtn2);
        button2.setOnClickListener(new bodybutton2(button2, this));
        Button button3 = (Button) this.findViewById(R.id.bodybtn3);
        button3.setOnClickListener(new bodybutton3(button3,this));
        Button button4 = (Button) this.findViewById(R.id.bodybtn4);
        button4.setOnClickListener(new bodybutton4(button4,this));
        Button button5 = (Button) this.findViewById(R.id.bodybtn5);
        button5.setOnClickListener(new bodybutton5(button5,this));
        Button buttonnxt = (Button) this.findViewById(R.id.interface5next);
        buttonnxt.setOnClickListener(new buttonnxt(buttonnxt, this));
    }
}
