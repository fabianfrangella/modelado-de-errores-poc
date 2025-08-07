package org.example.result;

import org.example.business.Character;

// el objeto Result es solamente un wrapper del objeto de dominio
public record CharacterLevelUpSuccessfulResult (Character data) implements CharacterLevelUpResult<Character> { }
