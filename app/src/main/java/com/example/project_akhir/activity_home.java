package com.example.project_akhir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class activity_home extends AppCompatActivity {
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tv = (TextView) this.findViewById(R.id.mywidget);
        tv.setSelected(true);
    }

    public void buka(View view){
        String url = "https://www.google.co.id/maps" ;
        Intent bukabrowser = new Intent(Intent. ACTION_VIEW);
        bukabrowser.setData(Uri. parse(url));
        startActivity(bukabrowser);
    }
    public void tentang(View view) {
        Intent tentang= new Intent(activity_home.this, ShowAboutActivity.class);
        startActivity(tentang);
    }
    public void help(View view){
        Toast.makeText(getApplicationContext(), "kamu mengklik Bantuan ya...? klik pilihan di pojok kanan atas ya..",
                Toast.LENGTH_LONG) .show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.about){
            startActivity(new Intent(this, ShowAboutActivity.class));
        } else if (item.getItemId() == R.id.setting) {
            startActivity(new Intent(this, settingActivity.class));
        } else if (item.getItemId() == R.id.help) {
            startActivity(new Intent(this, HelpActivity.class));
        }

        return true;
    }
    public void List(View view){
        Intent List= new Intent(activity_home.this, ListLocation.class);
        startActivity(List);
    }



  }
