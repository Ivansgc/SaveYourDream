package es.ivan.yourdreamprueba3;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Iván on 25/05/2016.
 */
public class QuintaPantalla  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oracle_activity);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


        Typeface myTypeface = Typeface.createFromAsset(getAssets(),"Enchanted Land.otf");
        TextView myTextView = (TextView)findViewById(R.id.TituloCabeceraOracle);
        myTextView.setTypeface(myTypeface);

        Typeface myTypeface1 = Typeface.createFromAsset(getAssets(),"royal-serif.ttf");
        TextView myTextView1 = (TextView)findViewById(R.id.button);
        myTextView1.setTypeface(myTypeface1);

        TextView myTextView2 = (TextView)findViewById(R.id.TextOracle);
        myTextView2.setTypeface(myTypeface1);


    }

    public void onAlert(View view){
        android.app.AlertDialog.Builder alertDialog = new android.app.AlertDialog.Builder(this);
        alertDialog.setTitle("Información: ");
        alertDialog.setMessage("Preguntame lo que quieras, puedo responder preguntas cuya contestación sea SI O NO.");
        alertDialog.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        alertDialog.show();
    }

}
