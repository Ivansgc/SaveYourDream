package es.ivan.yourdreamprueba3;

import android.graphics.Typeface;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaPantalla extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dreams_activity);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        Typeface myTypeface = Typeface.createFromAsset(getAssets(),"Enchanted Land.otf");
        TextView myTextView = (TextView)findViewById(R.id.TituloCabeceraDream);
        myTextView.setTypeface(myTypeface);

        Typeface myTypeface1 = Typeface.createFromAsset(getAssets(),"royal-serif.ttf");
        TextView myTextView1 = (TextView)findViewById(R.id.SaveDreams);
        myTextView1.setTypeface(myTypeface1);
    }
}
