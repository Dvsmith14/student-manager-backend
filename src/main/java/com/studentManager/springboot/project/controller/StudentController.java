package com.studentManager.springboot.project.controller;

import com.studentManager.springboot.project.model.Student;
import com.studentManager.springboot.project.service.IStudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {
    private final IStudentService studentService;

    @GetMapping
    public ResponseEntity<List<Student>> getStudents(){
        return new ResponseEntity<>(studentService.getStudents(), HttpStatus.FOUND);
    }
   @PostMapping
   public Student addStudent(@RequestBody Student student){
       return studentService.addStudent(student);
   }
   @PutMapping("/update/{id}")
   public Student updateStudent(@RequestBody Student student,@PathVariable Long id){
       return studentService.updateStudent(student, id);
   }
   @DeleteMapping("/delete/{id}")
   public void deleteStudent(@PathVariable Long id){
       studentService.deletedStudent(id);
   }
   @GetMapping("/student/{id}")
   public Student getStudentById(@PathVariable Long id){
       return studentService.getStudentByID(id);
   }

}
