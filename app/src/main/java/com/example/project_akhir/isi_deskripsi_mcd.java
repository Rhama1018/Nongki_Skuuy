package com.example.project_akhir;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class isi_deskripsi_mcd extends AppCompatActivity {
    Button btn_show_info_mcd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_deskripsi_mcd);

        btn_show_info_mcd = (Button)findViewById(R.id.btn_show_info_mcd);
        btn_show_info_mcd.setOnClickListener(new View.OnClickListener(){
            public  void onClick(View view){
                getSupportFragmentManager().beginTransaction().add(R.id.frame_layout2, new Show_fragment_mcd()).commit();
            }
        });
    }
}
