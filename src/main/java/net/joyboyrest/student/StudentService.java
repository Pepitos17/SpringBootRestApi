package net.joyboyrest.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

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
