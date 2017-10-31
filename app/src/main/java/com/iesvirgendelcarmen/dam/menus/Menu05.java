package com.iesvirgendelcarmen.dam.menus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

/**
 * Created by matinal on 31/10/2017.
 */

public class Menu05 extends AppCompatActivity {
    private TextView etiqueta ;
    private TextView respuesta ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu05);
        etiqueta = (TextView)findViewById(R.id.mensaje);
        respuesta= (TextView)findViewById(R.id.respuesta);
        registerForContextMenu(etiqueta);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu05, menu);
    }
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Opc1:
                respuesta.setText("Etiqueta: OPCIÓN A PULSADA");
                return true;
            case R.id.Opc2:
                respuesta.setText("Etiqueta: OPCIÓN B PULSADA");
                return true;
            case R.id.Opc3:
                respuesta.setText("Etiqueta: OPCIÓN C PULSADA");
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }
}
