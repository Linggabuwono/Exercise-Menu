package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    Button Signin;
    EditText Username, Password;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Signin = findViewById(R.id.bts);
        Username = findViewById(R.id.tus);
        Password = findViewById(R.id.tps);

        Signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Username.getText().toString().equals("Admin") && Password.getText().toString().equals("123")) {
                    Toast.makeText(getApplicationContext(), "Isi Semua Data!", Toast.LENGTH_LONG).show();
                } else if (Username.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Username Tidak Boleh Kosong.", Toast.LENGTH_LONG).show();
                } else if (Password.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "Password Tidak Boleh Kosong.", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(), "Pendaftaran Berhasil", Toast.LENGTH_LONG).show();
                }
            }
        });

        Signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainMenu.class);
                startActivity(intent);
            }
        });
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

