package com.ak.springbootgraphql.core;

import com.ak.springbootgraphql.model.Student;
import com.ak.springbootgraphql.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;

    @Override
    public void addStudent(List<Student> students) {
        studentRepository.saveAll(students);
    }

    @Override
    public List<Student> getAllStudents() {
        return StreamSupport
                .stream(studentRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

}
