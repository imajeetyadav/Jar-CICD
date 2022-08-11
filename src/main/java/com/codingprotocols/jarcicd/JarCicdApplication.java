package com.codingprotocols.jarcicd;

import java.util.Date;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JarCicdApplication {

    private static final Logger LOG = LogManager.getLogger(JarCicdApplication.class);

    @GetMapping(value = "/")
    public String helloWorld() {
        String response = "<H1> Hello World   </H1>" + new Date();
        LOG.log(Level.DEBUG, response);

        return response;
    }

    @GetMapping(value = "/exception")
    public String exception() {
        String response;
        try {
            throw new Exception("Exception has occurred....");
        } catch (Exception e) {
            e.printStackTrace();
            LOG.log(Level.ERROR, e);
            response = e.toString();
        }

        return response;
    }

    public static void main(String[] args) {
        SpringApplication.run(JarCicdApplication.class, args);
    }
}
