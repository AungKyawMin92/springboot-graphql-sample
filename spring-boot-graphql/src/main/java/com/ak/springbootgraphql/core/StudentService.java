package com.ak.springbootgraphql.core;

import com.ak.springbootgraphql.model.Student;

import java.util.List;

public interface StudentService {
    void addStudent(List<Student> students);

    List<Student> getAllStudents();
}
