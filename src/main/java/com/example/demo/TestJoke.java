package com.example.demo;


import com.example.demo.model.Group;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Elphas Khajira on 9/20/17.
 */
@Component
public class TestJoke implements CommandLineRunner {
         @Autowired
    private StudentFeignClient studentFeignClient;

    @Override
    public void run(String... strings) throws Exception {
        Group group=new Group("Matiangi Group");
        group.addStudent(
                new Student("Elphas","Khajira",88L)/*,
                new Student("Joseph","Khajira",98L),
                new Student("Ken","Khajira",38L),
                new Student("Wafula","Khajira",18L)*/);
        studentFeignClient.createGroup(group);
    }
}
