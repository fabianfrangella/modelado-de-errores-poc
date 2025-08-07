package org.example.service;

import org.example.business.Character;
import org.example.result.CharacterLevelUpResult;

import java.util.Optional;

public class CharacterService {

    // Retornamos Result para poder hacer pattern matching desde el consumidor
    public CharacterLevelUpResult<?> levelUp(Boolean shouldFail) {
        var character = new Character("Fabi", 101, "Paladin");
        return character.levelUp(shouldFail);
    }

    // Para representar la existencia/no existencia de algo usamos Optional
    public Optional<Character> find(String name) {
        // buscamos en la db y no existe
        if (name.equals("notFound")) {
            return Optional.empty();
        }
        return Optional.of(new Character("Fabi", 101, "Paladin"));
    }
}
