package com.example.project_akhir;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class BantuanActivity extends AppCompatActivity {
    Button btn_show_info11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_deskripsi_kfc);

        btn_show_info11 = (Button)findViewById(R.id.btn_show_info11);
        btn_show_info11.setOnClickListener(new View.OnClickListener(){
            public  void onClick(View view){
                getSupportFragmentManager().beginTransaction().add(R.id.frame_layout1, new ShowFragment()).commit();
            }
        });
    }
}