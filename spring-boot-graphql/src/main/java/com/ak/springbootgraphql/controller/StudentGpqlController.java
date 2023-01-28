package com.ak.springbootgraphql.controller;

import com.ak.springbootgraphql.core.StudentGpqlService;
import com.ak.springbootgraphql.core.StudentService;
import com.ak.springbootgraphql.model.Student;
import graphql.ExecutionResult;
import graphql.execution.Execution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentGpqlController {

    @Autowired
    StudentGpqlService studentGpqlService;

    @PostMapping("/graphql/student")
    public ResponseEntity<Object> getAllStudents(@RequestBody String query) {
        ExecutionResult result = studentGpqlService.getStudents(query);
        return new ResponseEntity<Object>((Object) result, HttpStatus.OK);
    }

}
