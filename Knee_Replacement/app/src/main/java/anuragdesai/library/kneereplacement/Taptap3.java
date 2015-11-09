package anuragdesai.library.kneereplacement;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Anurag on 10/16/2015.
 */
public class Taptap3 extends AppCompatActivity{

    public Button button1;
    public static int count5;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.painsurvey5);
        setTitle("Interface 5");


        {
            Button button1 = (Button) this.findViewById(R.id.bodybtn1);
            button1.setOnClickListener(new basebodybutton(button1, this, 1));


        }
        {
            Button button2 = (Button) this.findViewById(R.id.bodybtn2);
            button2.setOnClickListener(new basebodybutton(button2, this, 2));


        }
        {
            Button button3 = (Button) this.findViewById(R.id.bodybtn3);
            button3.setOnClickListener(new basebodybutton(button3, this, 3));


        }
        {
            Button button4 = (Button) this.findViewById(R.id.bodybtn4);
            button4.setOnClickListener(new basebodybutton(button4, this, 4));

        }
        {
            Button button5 = (Button) this.findViewById(R.id.bodybtn5);
            button5.setOnClickListener(new basebodybutton(button5, this, 5));

        }
        {
            Button buttonnxt = (Button) this.findViewById(R.id.interface5next);
            buttonnxt.setOnClickListener(new buttonnxt(buttonnxt, this));

        }}
    /*public void checker()
    {
        if(count5>=3)
        {
            button1 = (Button) this.findViewById(R.id.interface5next);
            button1.setVisibility(View.VISIBLE);
        }

    }*/

       public void onBackPressed() {}

}
