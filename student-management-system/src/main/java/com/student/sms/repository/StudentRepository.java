package com.student.sms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.student.sms.model.Student;

public interface StudentRepository extends MongoRepository<Student, String> {

}
