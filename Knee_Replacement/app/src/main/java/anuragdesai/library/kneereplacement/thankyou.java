package anuragdesai.library.kneereplacement;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Anurag on 11/8/2015.
 */
public class thankyou extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thankyou);
}

public void onClick(View view)
{
    Intent intent = new Intent(this,MainActivity.class);
    startActivity(intent, null);
}
}
