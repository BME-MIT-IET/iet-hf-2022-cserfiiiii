import Modell.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class TestClassAsteroid {
        Asteroid asteroid;
        Space space;
    @BeforeEach
    void setUp() {
        asteroid = new Asteroid();
        space = new Space();
        asteroid.SetSpace(space);
    }

    @Test
    void AsteroidDecreaseLayer()  {
        int layer = asteroid.GetLayer();
        asteroid.DecreaseLayer();
        assertTrue(layer-1<= asteroid.GetLayer());
    }
    @Test
    void AsteroidAddCreature(){
        asteroid.AddCreature(new Settler());
        assertEquals(1, asteroid.GetCreatures().size());
    }
    @Test
    void AsteroidRemoveCreature(){
        Settler s = new Settler();
        asteroid.AddCreature(s);
        asteroid.RemoveCreature(s);
        assertEquals(0,asteroid.GetCreatures().size());
    }
    @Test
    void AsteroidSetCloseToSunTrue(){
        asteroid.SetCloseToSun(true);
        assertTrue(asteroid.GetCloseToSun());
    }
    @Test
    void AsteroidSetCloseToSunFalse(){
        asteroid.SetCloseToSun(false);
        assertFalse(asteroid.GetCloseToSun());
    }

    @Test
    void AsteroidSolarStorm(){
        Settler s = new Settler();
        s.SetAsteroid(asteroid);
        asteroid.AddCreature(s);
        asteroid.SetLayer(0);
        asteroid.SetMaterial(null);
        asteroid.SolarStorm(0);
        assertEquals(1, asteroid.GetCreatures().size());
    }

    @Test
    void AsteroidTransport(){
        Settler s = new Settler();
        asteroid.Transport(s);
        assertEquals(1, asteroid.GetCreatures().size());
        assertEquals(asteroid, s.GetAsteroid());
    }

    @Test
    void AddNeighbour(){
        Asteroid a = new Asteroid();
        asteroid.AddNeighbour(a);
        assertEquals(1, asteroid.GetNeighbours().size());
    }

}