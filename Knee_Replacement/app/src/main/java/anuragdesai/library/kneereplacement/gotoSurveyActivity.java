package anuragdesai.library.kneereplacement;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by Anurag on 11/1/2015.
 */


public class gotoSurveyActivity extends AppCompatActivity{
    private static UserDataCollector udc = new UserDataCollector();
    private static int i;
    private static List<Integer> dataList;
    public static int flag;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        if (flag == 0) {
            //setContentView(R.layout.startsurvey);
            // Generate a list of number of random order
            dataList = new ArrayList<Integer>();
            for (int i = 1; i < 7; i++) {
                dataList.add(i);
            }

            Collections.shuffle(dataList);
            dataList.add(7);
        /*num = new int[dataList.size()];
        for (int i = 0; i < dataList.size(); i++) {
            num[i] = dataList.get(i);
        }*/
            System.out.println(dataList);
            flag++;
        }
        

            switch (dataList.get(i))
            {
                    case 1:
                    udc.writeToSDFile("Interface 1 Opened");
                    System.out.println("1");
                    i++;
                    Intent intent1 = new Intent(this, goToPainSurvey1.class);
                    startActivity(intent1, null);
                    break;
                case 2:
                    udc.writeToSDFile("Interface 2 Opened");
                    System.out.println("2");
                    i++;
                    Intent intent2 = new Intent(this, goToPainSurvey2.class);
                    startActivity(intent2, null);
                    break;
                case 3:
                    udc.writeToSDFile("Interface 3 Opened");
                    System.out.println("3");
                    i++;
                    Intent intent3 = new Intent(this, goToPainSurvey3.class);
                    startActivity(intent3, null);
                    break;
                case 4:
                    udc.writeToSDFile("Interface 4 Opened");
                    System.out.println("4");
                    i++;
                    Intent intent4 = new Intent(this, goToPainSurvey4.class);
                    startActivity(intent4, null);
                    break;
                case 5:
                    udc.writeToSDFile("Interface 5 Opened");
                    System.out.println("5");
                    i++;
                    Intent intent5 = new Intent(this,Taptap3.class);
                    startActivity(intent5, null);
                    break;
                case 6:
                    udc.writeToSDFile("Interface 6 Opened");
                    System.out.println("6");
                    i++;
                    Intent intent6 = new Intent(this,Taptap6.class);
                    startActivity(intent6, null);
                    break;

                default:
                    flag=0;
                    i=0;
                   // resetpage rp = new resetpage();
                    //Test for github
                    Intent intent = new Intent(this,thankyou.class);
                    startActivity(intent, null);
            }}

       /* udc.writeToSDFile("Interface 5 Opened");
        System.out.println("5");
        Intent intent5 = new Intent(this,Taptap3.class);
        startActivity(intent5, null);*/






/*        if (dataList.get(i) == 1) {udc.writeToSDFile("Interface 1 Opened");
            System.out.println("1");
            i++;
            Intent intent1 = new Intent(this,goToPainSurvey1.class);
            startActivity(intent1, null);}
        else if (dataList.get(i) == 2) {udc.writeToSDFile("Interface 2 Opened");
            System.out.println("2");
            i++;
            Intent intent2 = new Intent(this,goToPainSurvey2.class);
            startActivity(intent2, null);}
        else if (dataList.get(i) == 3) {udc.writeToSDFile("Interface 3 Opened");
            System.out.println("3");
            i++;
            Intent intent3 = new Intent(this,goToPainSurvey3.class);
            startActivity(intent3, null);}
        else if (dataList.get(i) == 4) {udc.writeToSDFile("Interface 4 Opened");
            System.out.println("4");
            i++;
            Intent intent4 = new Intent(this,goToPainSurvey4.class);
            startActivity(intent4, null);}
        else {
        //surveysRotate();

    }}


    public void goToPainSurvey(View view) {

        /*surveyNum = 6;

        String order = "";
        for (int i = 6; i > -1; i--) {
            order = order + " " + Integer.toString(num[i]);
        }
        udc.writeToSDFile("Survey order" + order);*/
       /*final int min = 0;
       final int max = 5;
       final int random = Random.nextInt((max - min) + 1) + min;
       int i1=1;*/
      /* // Create an array
       Integer[] array = new Integer[]{1, 2, 3, 4};
       // Shuffle the elements in the array
       Collections.shuffle(Arrays.asList(array));*/
       //surveysRotate();



   /* public void surveysRotate()
    {
//num[surveyNum]
       // if(i>5)
        //if(no5==0)
        {udc.writeToSDFile("Interface 5 Opened");
        System.out.println("5");
        Intent intent5 = new Intent(this,Taptap3.class);
        startActivity(intent5, null);
        no5++;
        }
       // else
         //   onResume();

        /*
        //Random r = new Random();
        //int i1 = r.nextInt(5);

        // Create an array
       /* Integer[] array = new Integer[]{1, 2, 3, 4};
        // Shuffle the elements in the array
        Collections.shuffle(Arrays.asList(array));
        switch (dataList.get(i))
        {
            case 1:
                udc.writeToSDFile("Interface 1 Opened");
                System.out.println("1");
                i++;
                Intent intent = new Intent(this,goToPainSurvey1.class);
                startActivity(intent, null);
                //surveyNum--;
                break;
            case 2:
                udc.writeToSDFile("Interface 2 Opened");
                System.out.println("2");
                i++;
                //goToPainSurvey1();
                Intent intent1 = new Intent(this,goToPainSurvey2.class);
                startActivity(intent1, null);
                //surveyNum--;
                break;
            case 3:
                udc.writeToSDFile("Interface 3 Opened");
                System.out.println("3");
                i++;
                //goToPainSurvey1();
                Intent intent2 = new Intent(this,goToPainSurvey3.class);
                startActivity(intent2, null);
                //surveyNum--;
                break;
            case 4:
                udc.writeToSDFile("Interface 4 Opened");
                System.out.println("4");
                i++;
                //goToPainSurvey1();
                Intent intent3 = new Intent(this,goToPainSurvey4.class);
                startActivity(intent3, null);
                //surveyNum--;
                break;
           /* case 5:
                udc.writeToSDFile("Interface 5 Opened");
                //goToPainSurvey1();
                System.out.println("5");
                Intent intent4 = new Intent(this,goToPainSurvey1.class);
                startActivity(intent4, null);
                surveyNum--;
                break;
            case 6:
                udc.writeToSDFile("Interface 6 Opened");
                System.out.println("6");
                Intent intent5 = new Intent(this,goToPainSurvey1.class);
                startActivity(intent5, null);
                //goToPainSurvey1();
                surveyNum--;
                break;
            default:
        }
        return false; */
    }


 /*   protected void onResume()
    {
        super.onResume();
        surveysRotate();
    }*/

