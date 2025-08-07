package org.example.business;

import org.example.business.error.BusinessError;
import org.example.result.CharacterLevelUpError;
import org.example.result.CharacterLevelUpSuccessfulResult;
import org.example.result.CharacterLevelUpResult;

public class Character {
    public String name;
    public Integer level;
    public String type;

    public Character(String name, Integer level, String type) {
        this.name = name;
        this.level = level;
        this.type = type;
    }

    public CharacterLevelUpResult<?> levelUp(Boolean shouldFail) {
        // representamos un error de negocio en la transacción
        if (shouldFail) {
            var error = new BusinessError("Soy un error");
            // en vez de hacer un throw tiramos un early return con el errorResult
            return new CharacterLevelUpError<>(error);
        }
        level++;
        return new CharacterLevelUpSuccessfulResult(this);
    }

    @Override
    public String toString() {
        return "BusinessObject{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", type='" + type + '\'' +
                '}';
    }
}
