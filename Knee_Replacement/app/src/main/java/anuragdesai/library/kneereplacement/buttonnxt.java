package anuragdesai.library.kneereplacement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * Created by Anurag on 10/22/2015.
 */
public class buttonnxt extends AppCompatActivity implements OnClickListener {
    Button buttonnxt;
    Taptap3 M;
    static int b1,b2,b3,b4,b5;
    public UserDataCollector udc;
    public buttonnxt(Button buttonnxt, Taptap3 M) {
        this.buttonnxt = buttonnxt;
        this.M = M;
    }
    public buttonnxt()
    {

    }


    @Override
    public void onClick(View v) {

        String sb1 = String.valueOf(b1);
        String sb2 = String.valueOf(b2);
        String sb3 = String.valueOf(b3);
        String sb4 = String.valueOf(b4);
        String sb5 = String.valueOf(b5);
        udc = new UserDataCollector();
        udc.checkExternalMedia();
        //System.out.println("outside1");
        //System.out.println(b1);
        if(b1!=0)
            //System.out.println("1");

        udc.writeToSDFile("Back_Pain_Level = "+sb1);
        if(b2!=0)
        udc.writeToSDFile("Right_Hip_Pain_Level = "+sb2);
        if(b3!=0)
        udc.writeToSDFile("Left_Hip_Pain_Level = "+sb3);
        if(b4!=0)
        udc.writeToSDFile("Right_Knee_Pain_Level = "+sb4);
        if(b5!=0)
        udc.writeToSDFile("Left_Knee_Pain_Level = "+sb5);

        Intent intent = new Intent(M , infopage5.class);
        M.startActivity(intent);

    }
}