package org.example.mystudentmgmtapp.repository;

import org.example.mystudentmgmtapp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
