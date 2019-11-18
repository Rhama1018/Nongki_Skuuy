package com.example.project_akhir;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class Show_fragment_mcd extends Fragment {
    public Show_fragment_mcd(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ilustrasi_mcd, container, false);
        return view;
    }
}