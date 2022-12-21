package net.joyboyrest.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public static List<Student> getStudentList() {
        return List.of(
                new Student(
                        1L,
                        "Mario",
                        "mario.jb@gmail.com",
                        LocalDate.of(2000, Month.JANUARY, 5),
                        21
                )
        );
    }

}
