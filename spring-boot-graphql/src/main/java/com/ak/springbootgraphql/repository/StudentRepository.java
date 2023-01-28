package com.ak.springbootgraphql.repository;

import com.ak.springbootgraphql.model.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Integer> {
    Student findByEmail(String email);

    List<Student> findByNameContaining(String name);
}
