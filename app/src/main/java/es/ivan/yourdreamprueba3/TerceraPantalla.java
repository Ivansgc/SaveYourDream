package es.ivan.yourdreamprueba3;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Iván on 25/05/2016.
 */
public class TerceraPantalla  extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.night_mares_activity);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        Typeface myTypeface = Typeface.createFromAsset(getAssets(),"Enchanted Land.otf");
        TextView myTextView = (TextView)findViewById(R.id.TituloCabeceraNightmares);
        myTextView.setTypeface(myTypeface);


        Typeface myTypeface1 = Typeface.createFromAsset(getAssets(),"royal-serif.ttf");
        TextView myTextView1 = (TextView)findViewById(R.id.SaveNightmares);
        myTextView1.setTypeface(myTypeface1);


    }


}
