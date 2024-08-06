package org.example.mystudentmgmtapp.repository;

import org.example.mystudentmgmtapp.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository  extends JpaRepository<Course, Long> {
}
