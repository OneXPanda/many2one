package com.test.many2one.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Course {

    @Id
   // @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer courseId;

    private  String courseName;

    private String coursePrice;

}
