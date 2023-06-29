package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.entity.Course;
import com.luv2code.cruddemo.entity.Instructor;
import com.luv2code.cruddemo.entity.InstructorDetail;

import java.util.List;

public interface AppDAO {
    void save(Instructor theInstructor);
    Instructor findInstructorById(int theId);
    void deleteInstructorById(int theId);
    InstructorDetail findInstructorDetailById(int theId);
    void deleteInstructorDetailById(int theId);
    public Instructor findCoursesByInstructorIdJoinFetch(int theId);
    public List<Course> findCoursesByInstructorId(int theId);
    void update(Instructor tempInstructor);
    void deleteCourseById(int theId);
}
