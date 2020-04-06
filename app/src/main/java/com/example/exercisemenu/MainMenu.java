package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainMenu extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener  {

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
            case R.id.hl:
                Toast.makeText(this, "Item", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.hk:
                Toast.makeText(this, "Item", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return false;
        }
    }

}
