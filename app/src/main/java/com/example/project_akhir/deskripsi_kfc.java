package com.example.project_akhir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class deskripsi_kfc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi_kfc);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Choose Button ");
    }
    public void menu_kfc(View view) {
        Intent menu_kfc = new Intent(deskripsi_kfc.this, isi_deskripsi_kfc.class);
        startActivity(menu_kfc);
    }
    public void isi_menu_kfc(View view) {
        Intent isi_menu_kfc = new Intent(deskripsi_kfc.this, menu_kfc.class);
        startActivity(isi_menu_kfc);
    }
    public void peta_kfc(View view){
        String url = "https://www.google.co.id/maps/dir//KFC+Kedaton+Lampung,+Jl.+ZA.+Pagar+Alam+No.28,+Labuhan+Ratu,+Kec.+Kedaton,+Kota+Bandar+Lampung,+Lampung+35212/@-5.3800355,105.2456746,15z/data=!4m8!4m7!1m0!1m5!1m1!1s0x2e40dac4da1c5997:0x9eaa6079ad1a68f7!2m2!1d105.2538296!2d-5.3802028?hl=id" ;
        Intent bukabrowser = new Intent(Intent. ACTION_VIEW);
        bukabrowser.setData(Uri. parse(url));
        startActivity(bukabrowser);
    }
}
