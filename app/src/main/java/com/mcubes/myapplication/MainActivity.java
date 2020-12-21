package com.mcubes.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;
import android.widget.ZoomControls;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String[] countryName;
    private int[] countryImg = {R.drawable.afganisthan,R.drawable.algeria,R.drawable.argentina,
            R.drawable.australia,R.drawable.bangladesh,R.drawable.belgium,R.drawable.bhutan,R.drawable.brazil,
            R.drawable.bulgeria,R.drawable.canada,R.drawable.china,R.drawable.cuba,R.drawable.finland};
    private SearchView searchView;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listViewId);
        searchView = findViewById(R.id.searchViewId);

        countryName = getResources().getStringArray(R.array.countryName);

        CustomAdapter customAdapter = new CustomAdapter(this,countryName,countryImg);
        listView.setAdapter(customAdapter);
        listView.setTextFilterEnabled(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                   String value = countryName[position];
              Toast.makeText(MainActivity.this, value, Toast.LENGTH_SHORT).show();


            }
        });

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                return false;
            }
        });




    }

}