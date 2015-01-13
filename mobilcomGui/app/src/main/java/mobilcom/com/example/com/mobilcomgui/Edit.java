package mobilcom.com.example.com.mobilcomgui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.io.File;

/**
 * Created by Malte on 28.12.2014.
 */
public class Edit extends Activity {
    ImageView iv;
    boolean offloading;
    Country cFrom;
    Country cTo;
    Bitmap img;


    public enum Country {
        DE, EN
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        Intent intent = getIntent();
        if( intent != null){
            img = (Bitmap) intent.getExtras().get("img");
            iv = (ImageView) findViewById(R.id.imageEdit);
            iv.setImageBitmap(img);
        }
        //getAlbumStorageDir();
        //File dir =new File(context.getFilesDir());




    }

    public boolean onCreateOptionsMenue ( Menu menu){

//		getMenuInflater().inflate(R.menu.edit, menu);
        return true;
    }


    public void translateClick(View v) {
        Intent i = new Intent(this, Result.class);
//		String[] result = translateFunction(img, cFrom, cTo,offloading);
//
//		i.putExtra("fromText", result[0]);
//		i.putExtra("toText", result[1]);
//
        startActivity(i);
    }

    public void toggleClicked(View view){
        offloading = ((ToggleButton) view).isChecked();
    }

    /*
     * Returns a string array with the Tring from the ocr and the result of the translation
     */
    // File tif String countryfrom String country to Type offloading
    public String[] translateFunction(Bitmap img,Country from,Country to,Boolean offloading ){

        //TODO call function off group 2
        return null;

    }
    public void runOCR(View v){
    //TODO this should run the OCR modul and redict to the result screen


        Toast.makeText(Edit.this, "You pressed the button runOCR", Toast.LENGTH_LONG).show();
    }


    public File getAlbumStorageDir(Context context, String albumName) {
        // Get the directory for the app's private pictures directory.
        File file = new File(context.getExternalFilesDir(
                Environment.DIRECTORY_PICTURES), albumName);
        if (!file.mkdirs()) {

        }
        return file;
    }


}

