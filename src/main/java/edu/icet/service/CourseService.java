package edu.icet.service;

import edu.icet.entity.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseService {
    public List<Course> getCourses(){
        ArrayList<Course> courseList = new ArrayList<>();
        courseList.add(new Course(
                "Introduction to Computer Science",
                "IT101",
                400.0,
                10)
        );

        courseList.add(new Course(
                "Web Development Foundations",
                "IT202",
                300.0,
                8)
        );

        courseList.add(new Course(
                "Networking Essentials",
                "IT101",
                250.0,
                6)
        );

        return courseList;
    }
}
