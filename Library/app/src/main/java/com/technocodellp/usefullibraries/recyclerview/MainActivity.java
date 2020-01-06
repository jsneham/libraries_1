package com.technocodellp.usefullibraries.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.technocodellp.usefullibraries.R;

import java.util.ArrayList;

import static java.security.AccessController.getContext;

public class MainActivity extends AppCompatActivity {

    ArrayList<Employee>  employees= new ArrayList<>();

    RecyclerView rv_list;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();

        init();
    }

    private void getData() {

        employees.add(new Employee("1","Sne", "abc address", "8889997774"));
        employees.add(new Employee("2","Sne", "abc address", "8889997774"));
        employees.add(new Employee("3","Sne", "abc address", "8889997774"));
        employees.add(new Employee("4","Sne", "abc address", "8889997774"));
        employees.add(new Employee("5","Sne", "abc address", "8889997774"));

    }

    private void init() {
        rv_list = ( RecyclerView ) findViewById ( R.id.rv_list );
        final LinearLayoutManager mLayoutManager = new LinearLayoutManager ( context );
        rv_list.setLayoutManager ( mLayoutManager );
        rv_list.setItemAnimator ( new DefaultItemAnimator( ) );
    }
}
