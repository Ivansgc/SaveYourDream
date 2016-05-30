package es.ivan.yourdreamprueba3;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);

        Typeface myTypeface = Typeface.createFromAsset(getAssets(),"Enchanted Land.otf");
        TextView myTextView = (TextView)findViewById(R.id.DefinicionText);
        myTextView.setTypeface(myTypeface);

        Typeface myTypeface1 = Typeface.createFromAsset(getAssets(),"royal-serif.ttf");
        TextView myTextView1 = (TextView)findViewById(R.id.BtnDreamFirstScreen1);
        myTextView1.setTypeface(myTypeface1);

        TextView myTextView2 = (TextView)findViewById(R.id.BtnNightMaresFirstScreen2);
        myTextView2.setTypeface(myTypeface1);
        TextView myTextView3 = (TextView)findViewById(R.id.BtnDreamGuideFirstScreen3);
        myTextView3.setTypeface(myTypeface1);
        TextView myTextView4 = (TextView)findViewById(R.id.BtnOracleFirstScreen4);
        myTextView4.setTypeface(myTypeface1);

        findViewById(R.id.BtnDreamFirstScreen1).setOnClickListener(new View.OnClickListener() {
            public void onClick(View S){
                MainActivity.this.startActivity(new Intent(MainActivity.this, SegundaPantalla.class));
            }
        });
        findViewById(R.id.BtnNightMaresFirstScreen2).setOnClickListener(new View.OnClickListener() {
            public void onClick(View T){
                MainActivity.this.startActivity(new Intent(MainActivity.this, TerceraPantalla.class));
            }
        });
        findViewById(R.id.BtnDreamGuideFirstScreen3).setOnClickListener(new View.OnClickListener() {
            public void onClick(View C){
                MainActivity.this.startActivity(new Intent(MainActivity.this, CuartaPantalla.class));
            }
        });
        findViewById(R.id.BtnOracleFirstScreen4).setOnClickListener(new View.OnClickListener() {
            public void onClick(View Q){
                MainActivity.this.startActivity(new Intent(MainActivity.this, QuintaPantalla.class));
            }
        });
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

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
