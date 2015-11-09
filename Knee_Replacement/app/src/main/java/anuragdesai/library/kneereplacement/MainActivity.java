package anuragdesai.library.kneereplacement;

import anuragdesai.library.kneereplacement.UserDataCollector;
import android.app.ActionBar;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.view.View.OnClickListener;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

public class MainActivity extends AppCompatActivity implements OnClickListener
{


    private Button button1;
    private PopupWindow popup1;
    private LayoutInflater layoutinflater1;
    private RelativeLayout relativelayout1;
    public UserDataCollector udc;
    public Editable tyu;
    public EditText et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et = (EditText) this.findViewById(R.id.editText1);
        tyu= et.getText();
        System.out.println(et.getText());



/*
        try {
        FileOutputStream fo = new FileOutputStream("D:\\test.txt");
        byte[] t = new byte[20];
        t= {1,2,3};
        fo.write();
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
            String str = "SomeMoreTextIsHere";
            File newTextFile = new File("D://test.txt");
            FileWriter fw = new FileWriter(newTextFile);
            fw.write(str);
            fw.close();
            System.out.println("hii");

        } catch (IOException iox) {
            //do stuff with exception
            iox.printStackTrace();
        }
    */
    }





        //button1 = (Button) findViewById(R.id.button1);
        //relativelayout1 = (RelativeLayout) findViewById(R.id.relative);



    public void onClick(View view)
    {
        System.out.println(et.getText());
        udc = new UserDataCollector();
        udc.checkExternalMedia();
        udc.writeToSDFile("Patient_ID = " + tyu);

        button1 = (Button) this.findViewById(R.id.button1);
        button1.setOnClickListener(this);
        if( et.getText().toString().trim().equals("")){


            et.setError( "Patient ID is required!" );

        }else{
            Intent intent = new Intent(this,informrandomorder.class);
            startActivity(intent);
        }

    }
}

  /* public void onClickMain1(View view)

    {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        AlertDialog dialog;
        alert.setTitle("Pain Survey 1");

        LayoutInflater inflater = (LayoutInflater)
                this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.popup1, null);
        alert.setView(v);
        AlertDialog.Builder builder = alert.setPositiveButton("Next",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog ,int wh)
                    {
                        onClickNext1();   //(DialogInterface dialog, int whichButton) {

                    }
                });
        alert.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                // do nothing

            }
        });

        dialog = alert.create();
        dialog.show();
    }

    private void onClickNext1()
        {

            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            AlertDialog dialog;
            alert.setTitle("Pain Survey 2");

            LayoutInflater inflater = (LayoutInflater)
                    this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View v1 = inflater.inflate(R.layout.popup2, null);
            alert.setView(v1);
            alert.setPositiveButton("Submit",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int whichButton) {

                            onClickNext2();
                        }
                    });
            alert.setNegativeButton("Back", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {
                    // do nothing

                }
            });

            dialog = alert.create();
            dialog.show();
        }


    private void onClickNext2()
        {

            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            AlertDialog dialog;
            alert.setTitle("Pain Survey 3");

            LayoutInflater inflater = (LayoutInflater)
                    this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View v1 = inflater.inflate(R.layout.popup3, null);
            alert.setView(v1);
            alert.setPositiveButton("Submit",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int whichButton) {

                            onClickNext3();
                        }
                    });
            alert.setNegativeButton("Back", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {
                    // do nothing

                }
            });

            dialog = alert.create();
            dialog.show();

    }


    private void onClickNext3() {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        AlertDialog dialog;
        alert.setTitle("Pain Survey 5");

        LayoutInflater inflater = (LayoutInflater)
                this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v1 = inflater.inflate(R.layout.smoking_status, null);
        alert.setView(v1);
        alert.setPositiveButton("Submit",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {

                    }
                });
        alert.setNegativeButton("Back", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                // do nothing

            }
        });

        dialog = alert.create();
        dialog.show();
    }


}

//public static void onClickRadio()
  //      {

    //    }


/*
    public void face1(View view) {
        Log.e("hg", "gjmbbjhbhkjjhkjhvjkg");
    }

    public void face2(View view) {
        Log.e("hg","gjmbbjhbhkjjhkjhvjkg");
    }

    public void face3(View view) {
        Log.e("hg","gjmbbjhbhkjjhkjhvjkg");
    }

    public void face4(View view) {
        Log.e("hg","gjmbbjhbhkjjhkjhvjkg");
    }

    public void face5(View view) {
        Log.e("hg","gjmbbjhbhkjjhkjhvjkg");
    }

    public void face6(View view) {
        Log.e("hg", "gjmbbjhbhkjjhkjhvjkg");
    }
}

*/








   /* button1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                layoutinflater1= (LayoutInflater) getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
                ViewGroup container= (ViewGroup)layoutinflater1.inflate(R.layout.popup1,null);

                popup1 = new PopupWindow(container,400,400,true);
                popup1.showAtLocation(relativelayout1, Gravity.NO_GRAVITY,500,500);

                container.setOnTouchListener(new View.OnTouchListener() {

                    public boolean onTouch(View view, MotionEvent motionEvent)
                    {
                        popup1.dismiss();
                        return true;
                    }

                });

            }
        });

    }


}
*/


/*
  @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

*/