package com.studentManager.springboot.project.service;

import com.studentManager.springboot.project.model.Student;

import java.util.List;

public interface IStudentService {
    Student addStudent(Student student);
    List<Student> getStudents();
    Student updateStudent(Student student, Long id);
    Student getStudentByID(Long id);
    void  deletedStudent(Long id);
}
