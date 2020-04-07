package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainMenu extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void showPopup (View v) {
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.persegi);
        popup.show();
    }
    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.hlp:
                startActivity(new Intent(this, hlpersegi.class));
                return true;
            case R.id.hkp:
                startActivity(new Intent(this, hkpersegi.class));
                return true;
            case R.id.hlpp:
                startActivity(new Intent(this, hlpersegipanjang.class));
                return true;
            case R.id.hkpp:
                startActivity(new Intent(this, hkpersegipanjang.class));
                return true;
            case R.id.hls:
                startActivity(new Intent(this, hlsegitiga.class));
                return true;
            case R.id.hks:
                startActivity(new Intent(this, hksegitiga.class));
                return true;
            case R.id.hll:
                startActivity(new Intent(this, hllingkaran.class));
                return true;
            case R.id.hkl:
                startActivity(new Intent(this, hklingkaran.class));
                return true;
            case R.id.hlt:
                startActivity(new Intent(this, hltrapesium.class));
                return true;
            case R.id.hkt:
                startActivity(new Intent(this, hktrapesium.class));
            default:
                return true;
        }
    }
}
