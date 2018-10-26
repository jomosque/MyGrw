package com.example.micalisoft.mygrw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    ProductAdapter adapter;

    List<Product> productList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        productList = new ArrayList<>();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //adding some items to our list
        productList.add(
                new Product(
                        1,
                        "Alison",
                        "21 años, Sur de Cali",
                        4.3,
                        60000,
                        R.drawable.girl001));

        productList.add(
                new Product(
                        1,
                        "Jessica",
                        "24 años, Sur de Cali",
                        4.3,
                        60000,
                        R.drawable.girl002));

        productList.add(
                new Product(
                        1,
                        "La Peque, Sur de Cali",
                        "23 años, Norte de Cali",
                        4.3,
                        60000,
                        R.drawable.girl003));


        adapter = new ProductAdapter(this, productList);
        recyclerView.setAdapter(adapter);

    }
}
