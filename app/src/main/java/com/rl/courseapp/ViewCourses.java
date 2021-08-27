package com.rl.courseapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ViewCourses extends AppCompatActivity {

    private ArrayList<CourseModel> courseModelArrayList;
    private DBHandler dbHandler;
    private CoursesApdapter coursesApdapter;
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_courses);


        courseModelArrayList = new ArrayList<>();
        dbHandler = new DBHandler(ViewCourses.this);

        courseModelArrayList = dbHandler.readCourses();

        coursesApdapter = new CoursesApdapter(courseModelArrayList, ViewCourses.this);

        recyclerView = findViewById(R.id.rv_courses);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(ViewCourses.this, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setAdapter(coursesApdapter);


    }
}