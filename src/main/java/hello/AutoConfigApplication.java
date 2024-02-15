package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutoConfigApplication {

    public static void main(String[] args) {
        for (String arg : args) {
            System.out.println("arg = " + arg);
        }
        SpringApplication.run(AutoConfigApplication.class, args);
    }

}
