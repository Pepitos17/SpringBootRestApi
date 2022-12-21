package net.joyboyrest.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public List<Student> getStudentList() {
      /*  return List.of(
                new Student(
                        1L,
                        "Mario",
                        "mario.jb@gmail.com",
                        LocalDate.of(2000, Month.JANUARY, 5),
                        21
                )
        );*/
        return studentRepository.findAll();
    }

}
