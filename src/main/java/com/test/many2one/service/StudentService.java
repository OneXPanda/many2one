package com.test.many2one.service;

import com.test.many2one.model.Course;
import com.test.many2one.model.Student;
import com.test.many2one.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public Student addStudent(Student student){

        Course course = Course.builder().courseId(student.getCourse().getCourseId())
                .courseName(student.getCourse().getCourseName())
                .coursePrice(student.getCourse().getCoursePrice()).build();

        Student student1 = Student.builder().studentId(student.getStudentId())
                .studentName(student.getStudentName())
                .course(course).build();

        Student save = studentRepo.save(student1);

        return save;
    }

    public List<Student> getAllStudents(){
        return  studentRepo.findAll();
    }

    public Student getStudentById(Integer studentId){
        Student student = studentRepo.findByStudentId(studentId);
        return student;
    }

}
