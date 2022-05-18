package edu.poniperro.quickstart;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.microprofile.config.spi.ConfigSource;

public class InMemoryConfigSource implements ConfigSource {

    private Map<String, String> properties = new HashMap<>();

    public InMemoryConfigSource() {
        this.properties.put("greetings.inicio",
                "<img src='https://c.tenor.com/fk77xC7Ds8IAAAAd/yamato-yamato-one-piece.gif'><h1>Bienvenido</h1><h2>En este momento estas cargando un fichero en memoria de configuracion.</h2>");
    }

    @Override
    public int getOrdinal() {
        return 999;
    }

    @Override
    public String getName() {
        return "Configuracion en memoria";
    }

    @Override
    public Set<String> getPropertyNames() {
        return this.properties.keySet();
    }

    @Override
    public String getValue(String arg0) {
        return this.properties.get(arg0);
    }

}
