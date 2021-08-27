package com.rl.courseapp;

public class CourseModel {


    private String courseName;
    private String CourseDuration;
    private String CourseTracks;
    private String CourseDescription;
    private int id;


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDuration() {
        return CourseDuration;
    }

    public void setCourseDuration(String courseDuration) {
        CourseDuration = courseDuration;
    }

    public String getCourseTracks() {
        return CourseTracks;
    }

    public void setCourseTracks(String courseTracks) {
        CourseTracks = courseTracks;
    }

    public String getCourseDescription() {
        return CourseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        CourseDescription = courseDescription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public CourseModel(String courseName, String courseDuration, String courseTracks, String courseDescription) {

        this.courseName = courseName;
        this.CourseDuration = courseDuration;
        this.CourseTracks = courseTracks;
        this.CourseDescription = courseDescription;

    }


}
