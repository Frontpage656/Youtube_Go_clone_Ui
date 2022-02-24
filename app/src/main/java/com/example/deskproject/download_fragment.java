package com.example.deskproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.sql.Struct;
import java.util.ArrayList;
import java.util.Arrays;

public class download_fragment extends Fragment {

    RecyclerView all_downloads;
    RecyclerView.LayoutManager linearLayout;
    RecyclerAdapter2 recyclerAdapter2;

    ArrayList<ModeClass2> list2 = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_download_fragment, container, false);


        all_downloads = view.findViewById(R.id.all_downloads);
        all_downloads.setHasFixedSize(true);

        linearLayout = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL,false);
        all_downloads.setLayoutManager(linearLayout);

        recyclerAdapter2 = new RecyclerAdapter2(list2, getContext());
        all_downloads.setAdapter(recyclerAdapter2);

        addAll();

        return view;


    }

    private void addAll() {
        ModeClass2 downl1 = new ModeClass2(R.drawable.img,"How i make many views","Get cool");
        ModeClass2 downl2 = new ModeClass2(R.drawable.img_1,"How i make many views","Deal");
        ModeClass2 downl3 = new ModeClass2(R.drawable.img_2,"How i meke many views","Sava vibes");
        ModeClass2 downl4 = new ModeClass2(R.drawable.img_3,"Play minecraft","Get cool");
        ModeClass2 downl5 = new ModeClass2(R.drawable.img_2,"How i make many views","xunch");

        list2.addAll(Arrays.asList(new ModeClass2[]{downl1,downl2,downl3,downl4,downl5}));
    }
}