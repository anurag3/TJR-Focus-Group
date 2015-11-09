package anuragdesai.library.kneereplacement;

import android.content.Context;
import android.graphics.Color;
import android.widget.Button;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Joshua on 11/9/2015.
 */
public class Utils {

    public static int getColorForLevel(int level){
        switch(level){
            default:
            case 0:
                return Color.GRAY;
            case 1:
                return Color.parseColor("#FF669900");
            case 2:
                return Color.parseColor("#FF99CC00");
            case 3:
                return Color.YELLOW;
            case 4:
                return Color.parseColor("#FFFFBB33");
            case 5:
                return Color.parseColor("#FFFF8800");
            case 6:
                return Color.RED;

        }
    }

    public static class buttonCounter{
        List<Button> buttons;
        public buttonCounter(){
            buttons = new ArrayList<>();
        }

        public void recordValueStored(Button button){
            if(!buttons.contains(button)){
                buttons.add(button);
            }
        }

        public boolean areButtonsStored(int count){
            return buttons.size() >= count;
        }
    }
}
