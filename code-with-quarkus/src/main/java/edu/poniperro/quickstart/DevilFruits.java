package edu.poniperro.quickstart;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import edu.poniperro.quickstart.model.DevilFruit;

@Path("/fruits")
public class DevilFruits {

    private Set<DevilFruit> fruits = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    public DevilFruits() {
        fruits.add(new DevilFruit("Gomu-Gomu", "Paramecia", 1000000000));
        fruits.add(new DevilFruit("Yami-Yami", "Logia", 1000000000));
    }

    @GET
    public Set<DevilFruit> list() {
        return fruits;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Set<DevilFruit> add(@Valid DevilFruit fruit) {
        fruits.add(fruit);
        System.out.println(fruit);
        return fruits;
    }

    @DELETE
    @Consumes(MediaType.APPLICATION_JSON)
    public Set<DevilFruit> delete(DevilFruit fruit) {
        fruits.removeIf(f -> f.name.contentEquals(fruit.name));
        return fruits;
    }
}
