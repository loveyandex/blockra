package com.blockra.blockra;

import java.util.Arrays;
import java.util.HashSet;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.cassandra.core.CassandraTemplate;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class AccessingDataCassandraApplication {

  private final static Logger log = LoggerFactory.getLogger(AccessingDataCassandraApplication.class);
  
  public static void main(String[] args) {
    SpringApplication.run(AccessingDataCassandraApplication.class, args);
  }
  
  @Bean
  public CommandLineRunner clr(VetRepository vetRepository) {
    return args -> {
//      vetRepository.deleteAll();
      



      new Thread(() -> {



        while (true){
          Vet jane = new Vet(UUID.randomUUID(), "Jane"+Math.random(), "Doe", new HashSet<>(Arrays.asList("radiology, surgery")));
          Vet john = new Vet(UUID.randomUUID(), "John", "Doe", new HashSet<>(Arrays.asList("surgery")));

          Vet savedJohn = vetRepository.save(john);
          Vet savedJane = vetRepository.save(jane);

        }

      }).start();

      new Thread(() -> {



        while (true){
          Vet jane = new Vet(UUID.randomUUID(), "Jane"+Math.random(), "Doe", new HashSet<>(Arrays.asList("radiology, surgery")));
          Vet john = new Vet(UUID.randomUUID(), "John", "Doe", new HashSet<>(Arrays.asList("surgery")));

          Vet savedJohn = vetRepository.save(john);
          Vet savedJane = vetRepository.save(jane);

        }

      }).start();

      new Thread(() -> {



        while (true){
          Vet jane = new Vet(UUID.randomUUID(), "Jane"+Math.random(), "Doe", new HashSet<>(Arrays.asList("radiology, surgery")));
          Vet john = new Vet(UUID.randomUUID(), "John", "Doe", new HashSet<>(Arrays.asList("surgery")));

          Vet savedJohn = vetRepository.save(john);
          Vet savedJane = vetRepository.save(jane);

        }

      }).start();

      new Thread(() -> {



        while (true){
          Vet jane = new Vet(UUID.randomUUID(), "Jane"+Math.random(), "Doe", new HashSet<>(Arrays.asList("radiology, surgery")));
          Vet john = new Vet(UUID.randomUUID(), "John", "Doe", new HashSet<>(Arrays.asList("surgery")));

          Vet savedJohn = vetRepository.save(john);
          Vet savedJane = vetRepository.save(jane);

        }

      }).start();

//      vetRepository.findAll()
//        .forEach(v -> log.info("Vet: {}", v.getFirstName()));
//
//      vetRepository.findById(savedJohn.getId())
//        .ifPresent(v -> log.info("Vet by id: {}", v.getFirstName()));
    };
  }
}