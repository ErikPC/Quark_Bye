package edu.poniperro.quickstart.model;

import javax.validation.constraints.Min;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class DevilFruit {

    @NotNull
    private String name;

    @NotNull
    private String type;

    @Min(5000)
    @NotNull
    private int berris;

}