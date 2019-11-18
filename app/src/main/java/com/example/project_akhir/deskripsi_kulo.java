package com.example.project_akhir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class deskripsi_kulo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi_kulo2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Choose Button ");
    }

    public void menu_kulo(View view) {
        Intent menu_kulo = new Intent(deskripsi_kulo.this, isi_deskripsi_kulo.class);
        startActivity(menu_kulo);
    }

    public void isi_menu_kulo(View view) {
        Intent isi_menu_kulo = new Intent(deskripsi_kulo.this, menu_kulo.class);
        startActivity(isi_menu_kulo);
    }
    public void peta_kulo(View view){
        String url = "https://www.google.co.id/maps/place/McDonald's+Kedaton+Pagar+Alam/@-5.3800623,105.2522407,17z/data=!3m1!4b1!4m5!3m4!1s0x2e40dac527e147ab:0x499aeb94597d10da!8m2!3d-5.3800676!4d105.2544294?hl=id" ;
        Intent bukabrowser = new Intent(Intent. ACTION_VIEW);
        bukabrowser.setData(Uri. parse(url));
        startActivity(bukabrowser);
    }
}
