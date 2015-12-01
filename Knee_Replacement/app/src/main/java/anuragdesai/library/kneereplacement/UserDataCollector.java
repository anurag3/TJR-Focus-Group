package anuragdesai.library.kneereplacement;

import android.os.Environment;
import android.util.Log;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.DateFormat;
import java.util.Date;


import android.os.Environment;
import android.util.Log;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.DateFormat;
import java.util.Date;

/**
 * Created by ChandlerWu on 9/22/15.
 */
public class UserDataCollector {

    private static final String TAG = "MEDIA";

    public UserDataCollector() {
    }

    public void checkExternalMedia(){
        boolean mExternalStorageAvailable = false;
        boolean mExternalStorageWriteable = false;
        String state = Environment.getExternalStorageState();

        if (Environment.MEDIA_MOUNTED.equals(state)) {
            // Can read and write the media
            mExternalStorageAvailable = mExternalStorageWriteable = true;
        } else if (Environment.MEDIA_MOUNTED_READ_ONLY.equals(state)) {
            // Can only read the media
            mExternalStorageAvailable = true;
            mExternalStorageWriteable = false;
        } else {
            // Can't read or write
            mExternalStorageAvailable = mExternalStorageWriteable = false;
        }
        Log.i("!!!!!!dataCollector", "\n\nExternal Media: readable="
                + mExternalStorageAvailable + " writable=" + mExternalStorageWriteable);
    }

    /** Method to write ascii text characters to file on SD card. Note that you must add a
     WRITE_EXTERNAL_STORAGE permission to the manifest file or this method will throw
     a FileNotFound Exception because you won't have write permission. */

    private void writeToSDFile(String string){

        // Find the root of the external storage.
        // See http://developer.android.com/guide/topics/data/data-  storage.html#filesExternal

        File root = android.os.Environment.getExternalStorageDirectory();
        Log.i("!!!!!!!!!!!tester", "\nExternal file system root: " + root);

        // See http://stackoverflow.com/questions/3551821/android-write-to-sd-card-folder

        File dir = new File (root.getAbsolutePath() + "/download");
        //dir.mkdirs();

        try {
            File file = new File(dir, "TJRData.csv");
            boolean fileExists = file.exists();
            FileOutputStream f = new FileOutputStream(file, true);
            OutputStreamWriter pw = new OutputStreamWriter(f);
            if(!fileExists){
                //PrintWriter pw = new PrintWriter(f);
                pw.append(DataEntry.getHeaders() + "\n");
            }
            //PrintWriter pw = new PrintWriter(f);
            //pw.append("\n" + string + " " + DateFormat.getDateTimeInstance().format(new Date())+ " " + System.currentTimeMillis());
            //pw.flush();
            pw.append(string + "\n");
            pw.close();
            f.close();
            Log.i("!!!!!!dataCollector", "\n\nFile written to " + file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            Log.i(TAG, "******* File not found. Did you" +
                    " add a WRITE_EXTERNAL_STORAGE permission to the manifest?");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void writeEntry(DataEntry entry){
        writeToSDFile(entry.getCSV());
    }
}
