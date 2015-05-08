package juegotomatodo.tomatodo;

import android.content.DialogInterface;
import android.media.Image;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.util.Random;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    Button btnCambiar;
    ImageView juego;
    ImageView pondos;
    ImageView ponuno;
    ImageView todosponen;
    ImageView tomados;
    ImageView tomatodo;
    ImageView tomauno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnCambiar=(Button)findViewById(R.id.btnCambiar);
        juego=(ImageView)findViewById(R.id.juego);
        pondos=(ImageView)findViewById(R.id.juego);
        ponuno=(ImageView)findViewById(R.id.juego);
        todosponen=(ImageView)findViewById(R.id.juego);
        tomados=(ImageView)findViewById(R.id.juego);
        tomatodo=(ImageView)findViewById(R.id.juego);
        tomauno=(ImageView)findViewById(R.id.juego);

        btnCambiar.setOnClickListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
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


    @Override
    public void onClick(View v) {

        int [] imagenes={R.drawable.pondos,R.drawable.ponuno,R.drawable.todosponen,R.drawable.tomados,R.drawable.tomatodo,R.drawable.tomauno};

        Random r = new Random();

        int image=r.nextInt(6);

        juego.setImageResource(imagenes[image]);
    }



}
