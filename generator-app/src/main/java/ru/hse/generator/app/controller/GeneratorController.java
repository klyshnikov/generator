package ru.hse.generator.app.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.hse.generator.api.GeneratorApi;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/generator")
public class GeneratorController implements GeneratorApi {

    @Override
    @PostMapping("/save-students-to-storage")
    public String saveStudentsToStorage(@RequestBody String fileFormat) {
        return null;
    }
}
