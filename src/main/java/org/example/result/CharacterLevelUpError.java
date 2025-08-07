package org.example.result;

// el objeto errorResult es solamente un wrapper del error de dominio,
// lo dejamos con generic porque le podemos pasar cualquier error pero bien podriamos hacer T extends ErrorEspecifico1, ErrorEspecifico2...
public record CharacterLevelUpError<T> (T error) implements CharacterLevelUpResult<T> { }
