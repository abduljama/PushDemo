package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

import java.util.ArrayList;
import java.util.List;


@EnableFeignClients
@SpringBootApplication
public class DemoApplication {


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        GroupRepository bookRepository1 = new GroupRepository();
        List<Student> studentsList = new ArrayList<>();

        studentsList.add( new Student("084018","Abdirahman " , "Jama"));
        studentsList.add( new Student("084017","Abdirahman " , "Jama"));
        studentsList.add( new Student("084019","Abdirahman " , "Jama"));


        Group groups = new Group( "GroupAlpa", studentsList);
        Group createdGroup = null;
        try {
            createdGroup = bookRepository1.createGroup(groups);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(createdGroup);
    }
}
