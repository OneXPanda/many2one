package com.test.many2one.repo;

import com.test.many2one.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
    Student findByStudentId(Integer studentId);
}
