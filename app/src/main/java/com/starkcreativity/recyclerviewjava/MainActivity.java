package com.starkcreativity.recyclerviewjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.starkcreativity.recyclerviewjava.Adapters.NatureAdapter;
import com.starkcreativity.recyclerviewjava.Classes.RecyclerItemClickListener;
import com.starkcreativity.recyclerviewjava.Models.NatureModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        // uses of adapter and model class  // step 10
        ArrayList<NatureModel> list = new ArrayList<>();
        list.add(new NatureModel(R.drawable.img1, "Nature 1"));
        list.add(new NatureModel(R.drawable.img2, "Nature 2"));
        list.add(new NatureModel(R.drawable.img3, "Nature 3"));
        list.add(new NatureModel(R.drawable.img4, "Nature 4"));
        list.add(new NatureModel(R.drawable.img5, "Nature 5"));
        list.add(new NatureModel(R.drawable.img6, "Nature 6"));
        list.add(new NatureModel(R.drawable.img7, "Nature 7"));
        list.add(new NatureModel(R.drawable.img8, "Nature 8"));
        list.add(new NatureModel(R.drawable.img9, "Nature 9"));

        // step 11
        NatureAdapter adapter = new NatureAdapter(list, this);
        recyclerView.setAdapter(adapter);


        // layout manager vertical          step 12
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);   // by default vertical. to use horizontal, pass two parameters
//        recyclerView.setLayoutManager(layoutManager);

        // linear layout manager horizontal
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false); // if want to reverse then make it true
//        recyclerView.setLayoutManager(layoutManager);


        // grid layour manager
//        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
//        recyclerView.setLayoutManager(gridLayoutManager);


        // staggered layout manager
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);



        // after adding RecyclerItemClickListener class file adding the functionality
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(this, recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                switch (position){
                    case 0:
                        Intent intent = new Intent(MainActivity.this, ScrollingActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, "Second Item is clicked", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                }
            }

            @Override
            public void onLongItemClick(View view, int position) {

            }
        }));

    }
}