package ru.hse.generator.app.dto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    public Integer id;
    public String name;
    public String surname;
    public String secondName;
    public String course;
    Student(Integer id, String name, String surname, String secondName, String course){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
        this.course = course;
    }
    @Override
    public String toString(){
        try {
            return new ObjectMapper().writeValueAsString(this);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
