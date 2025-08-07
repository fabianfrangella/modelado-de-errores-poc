package org.example.result;

// Hacemos una interfaz sealed para limitar que clases implementan la misma, esto es solo para agrupar dos tipos en un mismo conjunto
// Con esto podemos hacer pattern matching sobre los resultados posibles (successful y error)
// Hacemos una interfaz Result por cada dominio así no tenemos un god result object
sealed public interface CharacterLevelUpResult<T> permits CharacterLevelUpError, CharacterLevelUpSuccessfulResult { }
