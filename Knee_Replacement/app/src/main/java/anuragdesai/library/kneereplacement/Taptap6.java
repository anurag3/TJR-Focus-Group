package anuragdesai.library.kneereplacement;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

/**
 * Created by Anurag on 11/3/2015.
 */
public class Taptap6 extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.painsurvey6);
        setTitle("Interface 6");


        Button taptap6button1 = (Button) this.findViewById(R.id.bodybtn1);
        taptap6button1.setOnClickListener(new taptap6button1(taptap6button1,this));
        Button taptap6button2 = (Button) this.findViewById(R.id.bodybtn2);
        taptap6button2.setOnClickListener(new taptap6button2(taptap6button2,this));
        Button taptap6button3 = (Button) this.findViewById(R.id.bodybtn3);
        taptap6button3.setOnClickListener(new taptap6button3(taptap6button3,this));
        Button taptap6button4 = (Button) this.findViewById(R.id.bodybtn4);
        taptap6button4.setOnClickListener(new taptap6button4(taptap6button4,this));
        Button taptap6button5 = (Button) this.findViewById(R.id.bodybtn5);
        taptap6button5.setOnClickListener(new taptap6button5(taptap6button5,this));
        System.out.println(this);
        Button taptap6buttonnxt = (Button) this.findViewById(R.id.interface6next);
        taptap6buttonnxt.setOnClickListener(new taptap6buttonnxt(taptap6buttonnxt,this));
    }

    public void onBackPressed() {}

}

