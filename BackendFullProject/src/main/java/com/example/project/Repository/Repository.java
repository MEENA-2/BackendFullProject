package com.example.project.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.project.Student.Student;

//This Interface extends JpaRepository interface, so that @Repository is not needed to be annotated manually
public interface Repository extends JpaRepository<Student, Integer>{

}
