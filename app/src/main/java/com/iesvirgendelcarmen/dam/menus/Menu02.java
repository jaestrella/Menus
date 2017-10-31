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

public class Menu02 extends AppCompatActivity {
    public static final int MNU_OPC1=1;
    public static final int MNU_OPC2=2;
    public static final int MNU_OPC3=3;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu02);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(Menu.NONE,MNU_OPC1,Menu.NONE,"Opcion A desde java").setIcon(android.R.drawable.ic_menu_preferences);
        menu.add(Menu.NONE,MNU_OPC2,Menu.NONE,"Opcion B desde java").setIcon(android.R.drawable.ic_menu_compass);
        menu.add(Menu.NONE,MNU_OPC3,Menu.NONE,"Opcion C desde java").setIcon(android.R.drawable.ic_menu_agenda);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String mensaje="";
        switch (item.getItemId()){
            case 1:
                mensaje="¡¡¡ OPCION A PULSADA !!!";
                Toast.makeText(this,mensaje,Toast.LENGTH_SHORT).show();
                return true;
            case 2:
                mensaje="¡¡¡ OPCION B PULSADA !!!";
                Toast.makeText(this,mensaje,Toast.LENGTH_SHORT).show();
                return true;
            case 3:
                mensaje="¡¡¡ OPCION C PULSADA !!!";
                Toast.makeText(this,mensaje,Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
