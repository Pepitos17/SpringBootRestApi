package net.joyboyrest.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static net.joyboyrest.student.StudentService.getStudentList;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents() {
        return getStudentList();
    }



}
