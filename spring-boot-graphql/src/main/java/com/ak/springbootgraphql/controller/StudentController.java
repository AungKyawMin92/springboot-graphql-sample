package com.ak.springbootgraphql.controller;

import com.ak.springbootgraphql.core.StudentService;
import com.ak.springbootgraphql.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/student/add")
    public String addStudent(@RequestBody List<Student> students) {
        studentService.addStudent(students);
        return "record inserted " + students.size();
    }

    @GetMapping("/student/all")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }



}
