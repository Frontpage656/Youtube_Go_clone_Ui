package com.example.deskproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;

public class home_fragment extends Fragment {

    RecyclerView recycle_video;
    RecyclerView.LayoutManager linerLayout;
    RecyclerViewAdapter adapter;


    ArrayList<ModeClass> list = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_home_fragment, container, false);

        recycle_video = view.findViewById(R.id.recycle_videos);
        recycle_video.setHasFixedSize(true);

        linerLayout = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recycle_video.setLayoutManager(linerLayout);


        adapter = new RecyclerViewAdapter(getContext(), list);
        recycle_video.setAdapter(adapter);

        addAll();


        return view;
    }
    private void addAll() {
        ModeClass post1 = new ModeClass(R.drawable.thum_one,R.drawable.me,"Xunch tv","This is the best way to get more views.",
                "10k views.3 weeks ago");

        ModeClass post2 = new ModeClass(R.drawable.thum_two,R.drawable.me,"Xunch tv","This is the best way to get more views.",
                "10k views.3 weeks ago");

        ModeClass post3 = new ModeClass(R.drawable.thum_one,R.drawable.me,"Xunch tv","This is the best way to get more views.",
                "10k views.3 weeks ago");

        ModeClass post4 = new ModeClass(R.drawable.thum_two,R.drawable.me,"Xunch tv","This is the best way to get more views.",
                "10k views.3 weeks ago");

        ModeClass post5 = new ModeClass(R.drawable.thum_one,R.drawable.me,"Xunch tv","This is the best way to get more views.",
                "10k views.3 weeks ago");

        ModeClass post6 = new ModeClass(R.drawable.thum_two,R.drawable.me,"Xunch tv","This is the best way to get more views.",
                "10k views.3 weeks ago");


        list.addAll(Arrays.asList(new ModeClass[]{post1,post2,post3,post5,post6}));
    }
}