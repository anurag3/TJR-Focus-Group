package anuragdesai.library.kneereplacement;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Anurag on 11/5/2015.
 */
public class infopage4 extends AppCompatActivity implements View.OnClickListener {
    Button button1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.infopage4);
    }

    public void onClick(View view) {
        button1 = (Button) this.findViewById(R.id.infopage4next);
        button1.setOnClickListener(this);
        Intent intent = new Intent(this, gotoSurveyActivity.class);
        startActivity(intent);
        finish();
    }
    public void onBackPressed() {}

}
