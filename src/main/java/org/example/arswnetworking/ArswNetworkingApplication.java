package org.example.arswnetworking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

@SpringBootApplication
public class ArswNetworkingApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ArswNetworkingApplication.class, args);

        // Por ejemplo: src/main/resources/data_col1.txt
        System.out.println("Ingresa ruta al archivo de datos:");
        Scanner sc = new Scanner(System.in);
        String filename = sc.nextLine();

        MyLinkedList<Double> numbers = new MyLinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    numbers.add(Double.parseDouble(line.trim()));
                }
            }
        }

        double mean = StatsUtil.mean(numbers);
        double std = StatsUtil.stddev(numbers);

        System.out.printf("Mean: %.2f%n", mean);
        System.out.printf("Standard deviation: %.2f%n", std);
    }
}
