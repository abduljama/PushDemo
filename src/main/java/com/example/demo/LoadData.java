package com.example.demo;


import com.example.demo.model.Group;
import com.example.demo.model.Student;
import com.example.demo.repository.GroupRepository;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Elphas Khajira on 9/6/17.
 */
//@Component
public class LoadData implements CommandLineRunner {

//    @Autowired
    private StudentRepository studentRepository;

//    @Autowired
    GroupRepository groupRepository;

    @Override
    public void run(String... strings) throws Exception {
        Group group = groupRepository.save(new Group("GroupOmega"));
        List<Student> students = studentRepository.save(Arrays.asList(
                new Student("Abdirahman ", "Jama", 123L)
              //  new Student("", "Kamau", 1343L, group),
              //  new Student("Kimokoti", "Chebukati", 938L, group)
        ));
        group.addAllStudent(students);
        groupRepository.save(group);

    }
}
