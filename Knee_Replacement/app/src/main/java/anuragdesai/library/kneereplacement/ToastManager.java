package anuragdesai.library.kneereplacement;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Joshua on 11/9/2015.
 */
public class ToastManager {

    private static Toast mToast = null;

    public static void makeNewToastMessage(Context c, String message) {
        if (mToast != null) {
            mToast.cancel();
        }
        mToast = Toast.makeText(c, "",
                Toast.LENGTH_SHORT);


        mToast.setText(message);
        mToast.show();
    }
}
