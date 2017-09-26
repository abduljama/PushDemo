package com.example.demo;

import java.util.List;

public class Group {
    private Long id;
    private String name;
   List<Student> studentsList;


    public Group(String name, List<Student> studentsList) {
        this.name = name;
        this.studentsList = studentsList;
    }

    public Group(Long id, String name, List<Student> studentsList) {
        this.id = id;
        this.name = name;
        this.studentsList = studentsList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

    public void setStudentsList(List<Student> studentsList) {
        this.studentsList = studentsList;
    }
}
