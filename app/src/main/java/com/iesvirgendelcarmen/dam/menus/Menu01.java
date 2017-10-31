package com.iesvirgendelcarmen.dam.menus;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


/**
 * Created by matinal on 31/10/2017.
 */

public class Menu01 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu01);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu01,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String mensaje="";
        switch (item.getItemId()){
            case R.id.MnuOpc1:
                mensaje="¡¡¡ OPCION A PULSADA !!!";
                Toast.makeText(this,mensaje,Toast.LENGTH_SHORT).show();
                return true;
            case R.id.MnuOpc2:
                mensaje="¡¡¡ OPCION B PULSADA !!!";
                Toast.makeText(this,mensaje,Toast.LENGTH_SHORT).show();
                return true;
            case R.id.MnuOpc3:
                mensaje="¡¡¡ OPCION C PULSADA !!!";
                Toast.makeText(this,mensaje,Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
