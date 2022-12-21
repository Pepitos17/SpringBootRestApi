package net.joyboyrest.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return  args -> {
            Student mario = new Student(
                    "Mario",
                    "mario.jb@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5),
                    21
            );

            Student mariam = new Student(
                    "Mariam",
                    "mariam.jb@gmail.com",
                    LocalDate.of(1990, Month.OCTOBER, 5),
                    31
            );
            repository.saveAll(
                    List.of(mariam, mario)
            );

        };
    }

}
