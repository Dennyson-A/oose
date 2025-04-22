package com.example.courseregistration.Controller;

import com.example.courseregistration.model.Course;
import com.example.courseregistration.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/courses")
@CrossOrigin(origins = "*")
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @PostMapping
    public Course saveCourse(@RequestBody Course course) {
        return courseRepository.save(course);
    }
}
