package com.rl.courseapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CoursesApdapter extends RecyclerView.Adapter<CoursesApdapter.ViewHolder> {

    private ArrayList<CourseModel> courseModelArrayList;

    private Context context;

    public CoursesApdapter(ArrayList<CourseModel> courseModelArrayList, Context context) {

        this.courseModelArrayList = courseModelArrayList;
        this.context = context;
    }


    @NonNull
    @Override
    public CoursesApdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.course_rv_item,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CoursesApdapter.ViewHolder holder, int position) {

        CourseModel model = courseModelArrayList.get(position);
        holder.courseNameTV.setText(model.getCourseName());
        holder.courseDescTV.setText(model.getCourseDescription());
        holder.courseDurationTV.setText(model.getCourseDuration());
        holder.courseTracksTV.setText(model.getCourseTracks());




    }

    @Override
    public int getItemCount() {

        return courseModelArrayList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView courseNameTV,courseDescTV,courseDurationTV,courseTracksTV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            courseNameTV = itemView.findViewById(R.id.idTVCourseName);
            courseDescTV = itemView.findViewById(R.id.idTVCourseDescription);
            courseDurationTV = itemView.findViewById(R.id.idTVCourseDuration);
            courseTracksTV = itemView.findViewById(R.id.idTVCourseTracks);



        }



    }
}
