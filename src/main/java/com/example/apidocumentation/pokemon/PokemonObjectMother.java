package com.example.apidocumentation.pokemon;

import java.util.List;

public abstract class PokemonObjectMother {

    public static Pokemon createBulbasaur() {
        return Pokemon.builder()
                .nationalNo(1)
                .name("Bulbasaur")
                .species("Seed Pokémon")
                .type(List.of(PokemonType.GRASS, PokemonType.POISON))
                .weight(6.9d)
                .height(0.7d)
                .build();
    }
}
