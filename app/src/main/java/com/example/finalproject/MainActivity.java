package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NavController navController=Navigation.findNavController(MainActivity.this,R.id.nav_host_fragment);

        BottomNavigationView bottomNav=findViewById(R.id.bottom_nav);
        NavigationUI.setupWithNavController(bottomNav,navController);
    }
}