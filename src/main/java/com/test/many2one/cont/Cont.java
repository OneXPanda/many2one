package com.test.many2one.cont;

import com.test.many2one.model.Student;
import com.test.many2one.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Cont {

    @Autowired
    private StudentService service;

    @PostMapping(value = "/add")
    public Student addStudent(@RequestBody Student student){
       return service.addStudent(student);
    }

    @GetMapping(value ="/show")
    public List<Student> getAll(){
        return  service.getAllStudents();
    }
    @GetMapping(value ="/show-id/{studentId}")
    public Student getById(@PathVariable Integer studentId){
        return  service.getStudentById(studentId);
    }
}
