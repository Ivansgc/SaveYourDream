package es.ivan.yourdreamprueba3;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Iván on 25/05/2016.
 */
public class CuartaPantalla  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dreams_guide_activity);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        Typeface myTypeface = Typeface.createFromAsset(getAssets(),"Enchanted Land.otf");
        TextView myTextView = (TextView)findViewById(R.id.TituloCabeceraDreamGuide);
        myTextView.setTypeface(myTypeface);




    }
}
