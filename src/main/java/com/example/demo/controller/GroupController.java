package com.example.demo.controller;


import com.example.demo.NotFoundException;
import com.example.demo.model.Group;
import com.example.demo.model.Joke;
import com.example.demo.model.Student;
import com.example.demo.repository.GroupRepository;
import com.example.demo.repository.JokeRepository;
import com.example.demo.repository.StudentRepository;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


/**
 * Created by Elphas Khajira on 9/20/17.
 */

@RestController
@RequestMapping(value = "groups", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
public class GroupController {

    private final GroupRepository groupRepository;
    private final StudentRepository studentRepository;
    private final JokeRepository jokeRepository;

    public GroupController(GroupRepository groupRepository,
                           StudentRepository studentRepository,
                           JokeRepository jokeRepository) {
        this.groupRepository = groupRepository;
        this.studentRepository = studentRepository;
        this.jokeRepository = jokeRepository;
    }

    @PostMapping
    public Group createGroup(@RequestBody @Validated(Group.Create.class) Group group) {

       List<Student> students= studentRepository.save(group.getStudents());
        Group savedGroup = groupRepository.save(group);
        group.getStudents().forEach(student -> {
            student.setGroup(savedGroup);
            studentRepository.save(student);
        });

        return group;
    }






}
