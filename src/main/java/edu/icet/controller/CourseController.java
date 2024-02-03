package edu.icet.controller;

import edu.icet.dto.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CourseController {
    @GetMapping("/courses/list")
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
