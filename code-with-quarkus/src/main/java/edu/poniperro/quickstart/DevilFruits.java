package edu.poniperro.quickstart;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import edu.poniperro.quickstart.model.DevilFruit;

@Path("/fruits")
public class DevilFruits {

    private Set<DevilFruit> fruits = Collections.newSetFromMap(Collections.synchronizedMap(new LinkedHashMap<>()));

    public DevilFruits() {
        fruits.add(new DevilFruit("Gomu-Gomu", "Paramecia"));
        fruits.add(new DevilFruit("Yami-Yami", "Logia"));
    }

    @GET
    public Set<DevilFruit> list() {
        return fruits;
    }

    @POST
    public Set<DevilFruit> add(DevilFruit fruit) {
        fruits.add(fruit);
        return fruits;
    }

    @DELETE
    public Set<DevilFruit> delete(DevilFruit fruit) {
        fruits.removeIf(f -> f.name.contentEquals(fruit.name));
        return fruits;
    }
}