package edu.poniperro.quickstart.model;

import javax.validation.constraints.Min;

import io.smallrye.common.constraint.NotNull;

public class DevilFruit {

    @NotNull
    public String name;

    @NotNull
    public String type;

    @Min(1500000)
    @NotNull
    public int berris;

    public DevilFruit() {
    }

    public DevilFruit(String name, String type, int berris) {
        this.name = name;
        this.type = type;
        this.berris = berris;
    }
}