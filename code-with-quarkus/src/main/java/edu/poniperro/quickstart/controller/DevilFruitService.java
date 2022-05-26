package edu.poniperro.quickstart.controller;

import java.util.Set;

import javax.validation.Valid;

import edu.poniperro.quickstart.model.DevilFruit;

public interface DevilFruitService {
    public Set<DevilFruit> list();

    public Set<DevilFruit> add(@Valid DevilFruit fruit);

    public Set<DevilFruit> delete(DevilFruit fruit);
}
