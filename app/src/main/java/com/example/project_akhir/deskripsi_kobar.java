package com.example.project_akhir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class deskripsi_kobar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi_kobar2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Choose Button ");
    }
    public void menu_kobar(View view) {
        Intent menu_kobar = new Intent(deskripsi_kobar.this, isi_deskripsi_kobar.class);
        startActivity(menu_kobar);
    }
    public void isi_menu_kobar(View view) {
        Intent isi_menu_kobar = new Intent(deskripsi_kobar.this, menu_kobar.class);
        startActivity(isi_menu_kobar);
    }
    public void isi_peta_kobar(View view){
        String url = "https://www.google.co.id/" ;
        Intent bukabrowser = new Intent(Intent. ACTION_VIEW);
        bukabrowser.setData(Uri. parse(url));
        startActivity(bukabrowser);
    }
}
