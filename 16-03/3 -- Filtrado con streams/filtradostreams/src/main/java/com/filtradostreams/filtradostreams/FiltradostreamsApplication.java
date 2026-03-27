package com.filtradostreams.filtradostreams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication (exclude = {DataSourceAutoConfiguration.class}) 
public class FiltradostreamsApplication {

    public static void main(String[] args) {
        SpringApplication.run(FiltradostreamsApplication.class, args);

        List<Integer> numeros = Arrays.asList(
            1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20
        );

        System.out.println("Lista original: " + numeros);

        List<Integer> resultado = numeros.stream()
                                         .filter(n -> n % 2 == 0)
                                         .filter(n -> n > 10)
                                         .collect(Collectors.toList());

        System.out.println("Pares mayores a 10: " + resultado);

        List<Integer> resultado2 = numeros.stream()
                                         .filter(n -> n % 2 == 0 && n > 10)
                                         .collect(Collectors.toList());
        System.out.println("Resultado alternativo: " + resultado2);
    }
}