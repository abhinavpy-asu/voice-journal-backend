package com.example.voicejournal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class VoiceJournalApplication {

    public static void main(String[] args) {
        SpringApplication.run(VoiceJournalApplication.class, args);
    }

}

@RestController
class HelloController {
    @GetMapping("/api/hello")
    public String sayHello() {
        return "Hello from Voice Journal Backend!";
    }
}