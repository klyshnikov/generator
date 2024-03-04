package ru.hse.generator.app.service;


import com.fasterxml.jackson.core.JsonProcessingException;

public interface GeneratorService {
    public String saveStudentsToStorage(String fileFormat) throws JsonProcessingException;
}
