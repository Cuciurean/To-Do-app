package net.codejava;
import java.io.File;
import java.io.IOException;

import javax.servlet.MultipartConfigElement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import net.codejava.Controller.TodayAppController;

@SpringBootApplication
public class Application {
    public static void main(String[] args) throws IOException {
        new File(TodayAppController.uploadDir).mkdirs();
        SpringApplication.run(Application.class, args);
    }
}
