package com.example.internshipproject;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.Objects;

public class NavigationActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawer;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private ArrayList<CourseList> courseListArrayList;
    private NavigationView navigationView;

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        courseListArrayList = new ArrayList<>();
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        RecyclerView recyclerView = findViewById(R.id.recylerview);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 2));
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeButtonEnabled(true);
        }
        ActionBar actionbar = getSupportActionBar();
        actionbar.setHomeAsUpIndicator(R.drawable.ic_menu_gallery);
        actionbar.setDisplayHomeAsUpEnabled(true);
        drawer = (DrawerLayout) findViewById(R.id.activity_main);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawer, R.string.Open, R.string.Close);
        navigationView = findViewById(R.id.nv);
        drawer.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        drawer.addDrawerListener(actionBarDrawerToggle);
        navigationView.setItemIconTintList(null);

        ArrayList<String>courselist = new ArrayList<>();
        courselist.add("Introduction");
        courselist.add("Basic Syntask");
        courselist.add("Variable");
        courselist.add("String");
        courselist.add("Python List");
        courselist.add("Phython Touple");
        courselist.add("Phython Dictionary");
        courselist.add("If else Condition");
        courselist.add("While Loop");
        courselist.add("For Loop");

                GridAdapter gridAdapter = new GridAdapter(this, courselist);
        recyclerView.setAdapter(gridAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (actionBarDrawerToggle.onOptionsItemSelected(item))
            return true;

        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        /*switch(id)
        {
            case R.id.account:
                Toast.makeText(NavigationActivity.this, "My Account",Toast.LENGTH_SHORT).show();break;
            case R.id.settings:
                Toast.makeText(NavigationActivity.this, "Settings",Toast.LENGTH_SHORT).show();break;
            case R.id.mycart:
                Toast.makeText(NavigationActivity.this, "My Cart", Toast.LENGTH_SHORT).show();break;
            default:
                return true;
        }*/
        return true;
    }
}
