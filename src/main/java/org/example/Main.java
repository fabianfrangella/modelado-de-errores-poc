package org.example;

import org.example.result.CharacterLevelUpError;
import org.example.result.CharacterLevelUpSuccessfulResult;
import org.example.service.CharacterService;

public class Main {
    public static void main(String[] args) {
        var service = new CharacterService();

        var result = service.levelUp(true);

        // hacemos pattern matching desde el consumidor para saber que mostrar al cliente
        // En una api mapeamos al ResponseEntity correspondiente
        switch (result) {
            case CharacterLevelUpSuccessfulResult(var data) -> {
                System.out.println("successful result!, this is the data: ");
                System.out.println(data);
            }
            case CharacterLevelUpError(var error) -> {
                System.out.println("error result :(, this is the error data: ");
                System.out.println(error);
            }
            default -> throw new IllegalStateException("Unexpected value: " + result);
        }

        var maybeResult = service.find("notFound");

        // Mapeamos Nothing y Just
        maybeResult.ifPresentOrElse(
                res -> System.out.println("Object found! " + res),
                () -> System.out.println("Object not found :(")
        );
    }
}