package edu.poniperro.quickstart.model;

import javax.validation.constraints.Min;

import io.smallrye.common.constraint.NotNull;

public class DevilFruit {

    @NotNull
    public String name;

    @NotNull
    public String type;

    @Min(5000)
    @NotNull
    public Integer berris;

    public DevilFruit() {
    }

    public DevilFruit(String name, String type, Integer berris) {
        this.name = name;
        this.type = type;
        this.berris = berris;
    }
}