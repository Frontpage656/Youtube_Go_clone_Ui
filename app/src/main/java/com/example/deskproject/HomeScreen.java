package com.example.deskproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeScreen extends AppCompatActivity {

    FrameLayout frameLayout;

    ArrayList<ModeClass> list = new ArrayList<>();

    BottomNavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        navigationView = findViewById(R.id.nav);
        frameLayout = findViewById(R.id.frame);

        loadFragment(new home_fragment());
        navigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {

            Fragment fragment;
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId())
                {
                    case R.id.home:
                        Toast.makeText(getApplicationContext(),"Home",Toast.LENGTH_LONG).show();
                        fragment = new home_fragment();
                        loadFragment(fragment);
                        break;

                    case R.id.dowload:
                        Toast.makeText(getApplicationContext(),"download",Toast.LENGTH_LONG).show();
                        fragment = new download_fragment();
                        loadFragment(fragment);
                        break;
                }


                return false;
            }
        });

    }

    public void loadFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.frame,fragment)
                .commit();
    }
}