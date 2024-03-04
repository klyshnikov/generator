package ru.hse.generator.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.hse.generator.api.GeneratorApi;

@FeignClient(name = "generator", url = "${product.storage.url}")
public interface GeneratorClient extends GeneratorApi {
    @PostMapping("/api/v1/product/save-students-to-storage")
    String saveStudentsToStorage(
            @RequestParam(required = false, name = "file-format", defaultValue = "json") String fileFormat
    );
}
