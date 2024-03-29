package Aashish.coventry.chapter5assignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import Aashish.coventry.chapter5assignment.Adapter.DetailAdapter;
import Aashish.coventry.chapter5assignment.Model.Details;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Spinner spinPic;
    EditText name, age;
    RadioGroup gender;
    RadioButton btngen;
    Button submit;
    int picvalue;
    // Create mickey list of contacts to display in RecyclerView
    List<Details> detailList = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinPic = findViewById(R.id.spinpic);
        name = findViewById(R.id.name);
        gender = findViewById(R.id.gender);
        age = findViewById(R.id.age);
        submit = findViewById(R.id.submit);

        String pic[] = {"mickey", "smiley", "minion"};

        recyclerView = findViewById(R.id.recyclerView);


        ArrayAdapter adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                pic
        );
        spinPic.setAdapter(adapter);

//        spinPic.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//
////                if (spinPic.getSelectedItem().toString().equals("mickey")) {
////                    int picvalue = R.drawable.mickey;
////                } else {
////                    int picvalue = R.drawable.smiley;
////                }
//
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });
//        final int picvalue = R.drawable.mickey;


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String pic=spinPic.getSelectedItem().toString();
                if(pic=="mickey"){
                    picvalue=  R.drawable.mickey;
                }

                if(pic=="smiley"){
                    picvalue=  R.drawable.smiley;
                }

                if(pic=="minion"){
                    picvalue=  R.drawable.minion;
                }
                int selectedId = gender.getCheckedRadioButtonId();

                // find the radiobutton by returned id
                btngen = findViewById(selectedId);

                String namevalue = name.getText().toString();
                String agevalue = age.getText().toString();
                String gendervalue = btngen.getText().toString();


                // Adding all the contacts object in list
                detailList.add(new Details(namevalue, agevalue, gendervalue, picvalue));
//                detailList.add(new Details("vgjj", "3"));

                DetailAdapter detailAdapter = new DetailAdapter(this, detailList);
                recyclerView.setAdapter(detailAdapter);
                recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));


            }
        });


        //Display all the contacts in linear layour (vertically)



    }
}
