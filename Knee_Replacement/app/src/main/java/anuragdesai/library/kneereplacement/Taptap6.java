package anuragdesai.library.kneereplacement;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

/**
 * Created by Anurag on 11/3/2015.
 */
public class Taptap6 extends AppCompatActivity {

    public static int count6;

    protected void onCreate(Bundle savedInstanceState)
    {
        System.gc();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.painsurvey6);
        setTitle("6 Taps");


        Button taptap6buttonnxt = (Button) this.findViewById(R.id.interface6next);
        NextButtonController buttonController = new NextButtonController(taptap6buttonnxt, this, new Intent(this, infopage6.class));
        taptap6buttonnxt.setOnClickListener(buttonController);
        taptap6buttonnxt.setEnabled(false);

        Button taptap6button1 = (Button) this.findViewById(R.id.bodybtn1);
        taptap6button1.setOnClickListener(new basetaptap6button(taptap6button1,this, 1, buttonController));
        Button taptap6button2 = (Button) this.findViewById(R.id.bodybtn2);
        taptap6button2.setOnClickListener(new basetaptap6button(taptap6button2,this, 2, buttonController));
        Button taptap6button3 = (Button) this.findViewById(R.id.bodybtn3);
        taptap6button3.setOnClickListener(new basetaptap6button(taptap6button3,this, 3, buttonController));
        Button taptap6button4 = (Button) this.findViewById(R.id.bodybtn4);
        taptap6button4.setOnClickListener(new basetaptap6button(taptap6button4, this, 4, buttonController));
        Button taptap6button5 = (Button) this.findViewById(R.id.bodybtn5);
        taptap6button5.setOnClickListener(new basetaptap6button(taptap6button5,this, 5, buttonController));

    }

    public void onBackPressed() {}

}

