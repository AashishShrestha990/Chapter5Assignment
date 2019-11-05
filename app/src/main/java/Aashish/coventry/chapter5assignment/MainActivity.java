package Aashish.coventry.chapter5assignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import java.util.ArrayList;
import java.util.List;

import Aashish.coventry.chapter5assignment.Adapter.DetailAdapter;
import Aashish.coventry.chapter5assignment.Model.Details;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    EditText name, gender, age;
    Spinner pic;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        // Create a list of contacts to display in RecyclerView
        List<Details> detailList = new ArrayList<>();
        // Adding all the contacts object in list
        detailList.add(new Details("Aashish","male","21",R.drawable.a));
        detailList.add(new Details("Aashish","male","21",R.drawable.b));


        DetailAdapter detailAdapter = new DetailAdapter(this,detailList);
        recyclerView.setAdapter(detailAdapter);

        //Display all the contacts in linear layour (vertically)
        recyclerView.setLayoutManager(new LinearLayoutManager(this));



    }
}
