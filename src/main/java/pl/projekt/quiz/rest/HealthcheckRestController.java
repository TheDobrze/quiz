package pl.projekt.quiz.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.projekt.quiz.dto.HealthcheckDto;

@RestController
@RequestMapping("/api/health")
public class HealthcheckRestController {

    @GetMapping
    public HealthcheckDto healtcheck(){
        HealthcheckDto dto = new HealthcheckDto(true, "It's working!");
        return dto;
    }
}
