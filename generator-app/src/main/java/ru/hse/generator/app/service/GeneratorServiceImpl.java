package ru.hse.generator.app.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.hse.generator.app.dto.Student;
import ru.hse.generator.storage.api.StorageApi;
import ru.hse.generator.student.api.StudentApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class GeneratorServiceImpl implements GeneratorService {

    StudentApi studentApi;
    StorageApi storageApi;

    @Override
    public String saveStudentsToStorage(String fileFormat) throws JsonProcessingException {
        List<Student> students = studentApi.getStudents();
        if (Objects.equals(fileFormat, "json")) {
            return storageApi.writeStudents(new ObjectMapper().writeValueAsString(students));
        } else {
            List<String> listOfStringStudents = new ArrayList<String>();
            for (Student student : students) {
                listOfStringStudents.add(student.toStringCSV());
            }

            StringBuilder result = new StringBuilder();
            for (String stringStudent : listOfStringStudents) {
                result.append(stringStudent);
                result.append("\n");
            }

            return result.toString();
        }
    }
}
