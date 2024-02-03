package edu.icet.controller;

import edu.icet.dto.Course;
import edu.icet.service.CourseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CourseController {
    @GetMapping("/courses/list")
    public List<Course> getCourses(){
        CourseService courseService = new CourseService();
        List<Course> courses = courseService.getCourses();
        return courses;
    }
}
