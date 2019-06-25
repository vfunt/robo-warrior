package main.java;
import java.util.ArrayList;

public class Galaxy {
    private ArrayList<Planet> planets = new ArrayList<Planet>();

    public Galaxy() {
        this.planets.add(Planet.Moon);
        this.planets.add(Planet.Cybertron);
        this.planets.add(Planet.Jupiter);
    }

    public void abduct(Tobot tobot, Planet planet) {
        tobot.transform(planet);
    }

    public Planet getRandomPlanet(int index) {
        return this.planets.get(index);
    }
}
