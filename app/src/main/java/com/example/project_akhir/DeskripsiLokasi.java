package com.example.project_akhir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class DeskripsiLokasi extends AppCompatActivity {


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi_lokasi);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Choose Button ");
    }

    public void deskripsi_kopi(View view) {
        Intent deskripsi_kopi = new Intent(DeskripsiLokasi.this, kopiaceh_deskripsi.class);
        startActivity(deskripsi_kopi);
    }
    public void menu_kopi(View view) {
        Intent menu_kopi = new Intent(DeskripsiLokasi.this, MenuKopiActivity.class);
        startActivity(menu_kopi);
    }
    public void peta_kopi_aceh(View view){
        String url = "https://www.google.co.id/maps/place/Kopi+aceh/@-5.3740482,105.2405068,17z/data=!3m1!4b1!4m5!3m4!1s0x2e40dbccabd23d1d:0xb853bfd125b817b0!8m2!3d-5.3740535!4d105.2426955?hl=id" ;
        Intent bukabrowser = new Intent(Intent. ACTION_VIEW);
        bukabrowser.setData(Uri. parse(url));
        startActivity(bukabrowser);
    }

}
