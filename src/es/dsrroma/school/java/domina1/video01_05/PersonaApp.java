package es.dsrroma.school.java.domina1.video01_05;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PersonaApp {
    public static void main(String[] args) throws InterruptedException {
        Persona persona = new Persona("Juan", "Pérez", LocalDate.of(1990, 5, 15));
        for (int i = 0; i < 10; i++) {
            System.out.println("HashCode: " + persona.hashCode());
            Thread.sleep(5000); // 5 segundos
        }
    }



}