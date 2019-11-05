package Aashish.coventry.chapter5assignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import Aashish.coventry.chapter5assignment.Adapter.DetailAdapter;
import Aashish.coventry.chapter5assignment.Model.Details;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        Details details = new Details();
        // Create a list of contacts to display in RecyclerView
        List<Details> detailList = new ArrayList<>();
        // Adding all the contacts object in list
        detailList.add(new Details);


        DetailAdapter detailAdapter = new DetailAdapter(this,detailList);
        recyclerView.setAdapter(detailAdapter);

        //Display all the contacts in linear layour (vertically)
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }
}
