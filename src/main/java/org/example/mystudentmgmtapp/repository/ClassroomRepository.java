package org.example.mystudentmgmtapp.repository;

import org.example.mystudentmgmtapp.model.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassroomRepository extends JpaRepository<Classroom, Long> {
}
