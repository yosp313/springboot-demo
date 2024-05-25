package com.youssef_ayman.springboottest.configs;

import com.youssef_ayman.springboottest.models.Student;
import com.youssef_ayman.springboottest.repositories.StudentRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepo studentRepo){
        return args -> {
            Student joe = new Student("joe", "joe.joey@gmail.com", LocalDate.of(1990, Month.JANUARY, 3));
            Student youssef = new Student("youssef", "youssef@gmail.com", LocalDate.of(2003, Month.SEPTEMBER, 9));

            studentRepo.saveAll(List.of(joe, youssef));
        };
    }
}
