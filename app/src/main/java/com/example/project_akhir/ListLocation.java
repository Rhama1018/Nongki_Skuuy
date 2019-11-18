package com.example.project_akhir;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ListLocation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_location);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(" Tempat Nongkrong ");
    }
    public void deskripsi_kopi(View view){
        Intent deskripsi_kopi= new Intent(ListLocation.this, DeskripsiLokasi.class);
        startActivity(deskripsi_kopi);
    }
    public void deskripsi_kfc(View view){
        Intent deskripsi_kfc= new Intent(ListLocation.this, deskripsi_kfc.class);
        startActivity(deskripsi_kfc);
    }
    public void deskripsi_mcd(View view){
        Intent deskripsi_mcd= new Intent(ListLocation.this, deskripsi_mcd.class);
        startActivity(deskripsi_mcd);
    }
    public void deskripsi_yoshinoya(View view){
        Intent deskripsi_yoshinoya= new Intent(ListLocation.this, deskripsi_yoshinoya.class);
        startActivity(deskripsi_yoshinoya);
    }
    public void deskripsi_kobar(View view) {
        Intent deskripsi_kobar = new Intent(ListLocation.this, deskripsi_kobar.class);
        startActivity(deskripsi_kobar);
    }
    public void deskripsi_kulo(View view) {
        Intent deskripsi_kulo = new Intent(ListLocation.this, deskripsi_kulo.class);
        startActivity(deskripsi_kulo);
    }
}
