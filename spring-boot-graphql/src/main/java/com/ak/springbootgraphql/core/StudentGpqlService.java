package com.ak.springbootgraphql.core;

import com.ak.springbootgraphql.model.Student;
import graphql.ExecutionResult;

import java.util.List;

public interface StudentGpqlService {
    ExecutionResult getAllStudents(String query);

    ExecutionResult findStudentByEmail(String query);
}
