package com.task;

import com.task.controller.TimestampTaskProperties;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Lenovo
 */
@SpringBootApplication
@EnableEurekaClient
@EnableTask
@EnableScheduling
@EnableConfigurationProperties({TimestampTaskProperties.class})
public class TaskApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaskApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return new TestCommandLineRunner();
    }


    public static class TestCommandLineRunner implements CommandLineRunner {
        //        @Override
//        public void run(String... strings) throws Exception {
//            System.out.println("this is a Test about spring cloud task.");
//            try{
//                List<String> list = new ArrayList<>();
////                list.get(1);
////                System.err.println(1);
//            }catch (Exception e){
//                System.out.println("Error");
//                throw e;
//            }
//        }
        private final org.slf4j.Logger logger = LoggerFactory.getLogger(TestCommandLineRunner.class);

        @Autowired
        private TimestampTaskProperties config;

        @Override
        public void run(String... strings) throws Exception {
            DateFormat dateFormat = new SimpleDateFormat(config.getFormat());
            logger.info(dateFormat.format(new Date()));
        }
    }
}
