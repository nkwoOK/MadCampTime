package com.example.tabhostgogo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class Tab3PageFragment1 extends Fragment {
    public void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);
    }
    @Nullable
    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View view= inflater.inflate(R.layout.tab3_fragment1, null);
//
        return view;
    }

}