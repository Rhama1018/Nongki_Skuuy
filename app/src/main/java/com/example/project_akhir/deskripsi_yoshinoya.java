package com.example.project_akhir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class deskripsi_yoshinoya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi_yoshinoya2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Choose Button ");
    }

    public void menu_yoshinoya(View view) {
        Intent menu_mcd = new Intent(deskripsi_yoshinoya.this, isi_deskripsi_yoshinoya.class);
        startActivity(menu_mcd);
    }

    public void isi_menu_yoshinoya(View view) {
        Intent isi_menu_yoshinoya = new Intent(deskripsi_yoshinoya.this, menu_yoshinoya.class);
        startActivity(isi_menu_yoshinoya);
    }
    public void peta_yoshinoya(View view){
        String url = "https://www.google.co.id/maps/place/McDonald's+Kedaton+Pagar+Alam/@-5.3800623,105.2522407,17z/data=!3m1!4b1!4m5!3m4!1s0x2e40dac527e147ab:0x499aeb94597d10da!8m2!3d-5.3800676!4d105.2544294?hl=id" ;
        Intent bukabrowser = new Intent(Intent. ACTION_VIEW);
        bukabrowser.setData(Uri. parse(url));
        startActivity(bukabrowser);
    }
}
