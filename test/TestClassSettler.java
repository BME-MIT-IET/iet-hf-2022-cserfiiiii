import Modell.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClassSettler {
    Settler settler;
    Asteroid asteroid;
    Space space;
    @BeforeEach
    void setUp() {
        space = new Space();
        settler = new Settler();
        asteroid = new Asteroid();
        space.AddAsteroid(asteroid);
        space.AddCreature(settler);
        settler.SetAsteroid(asteroid);
        asteroid.AddCreature(settler);
        asteroid.SetSpace(space);
        asteroid.SetLayer(2);
        asteroid.SetMaterial(null);
    }

    @Test
    void SettlerDrill(){
        settler.Drill();
        assertEquals(1, asteroid.GetLayer());
    }

    @Test
    void SettlerMine(){
        asteroid.SetMaterial(new Iron());
        settler.Mine();
        assertEquals(0, settler.GetMaterials().size());
        asteroid.SetLayer(0);
        settler.Mine();
        assertEquals(1, settler.GetMaterials().size());
    }

    @Test
    void SettlerCreateRobot(){
        settler.AddMaterial(new Iron());
        settler.AddMaterial(new Carbon());
        settler.AddMaterial(new Uranium());
        settler.CreateRobot();
        assertEquals(2, asteroid.GetCreatures().size());
    }

    @Test
    void SettlerCreateGate(){
        settler.AddMaterial(new Iron());
        settler.AddMaterial(new Iron());
        settler.AddMaterial(new Ice());
        settler.AddMaterial(new Uranium());
        settler.CreateGate();
        assertEquals(2, settler.GetGateList().size());
    }

    @Test
    void  SettlerPlaceGate(){
        Gate g1 = new Gate();
        Gate g2 = new Gate();
        g1.SetPair(g2);
        g2.SetPair(g1);
        settler.AddGate(g1);
        settler.AddGate(g2);
        settler.PlaceGate(g1);
        Asteroid a = new Asteroid();

        settler.SetAsteroid(a);
        settler.PlaceGate(g2);
        assertEquals(1, asteroid.GetNeighbours().size());
    }

    @Test
    void SettlerMove(){
        Asteroid a = new Asteroid();
        asteroid.AddNeighbour(a);
        a.AddNeighbour(asteroid);
        settler.Move(a);
        assertEquals(a, settler.GetAsteroid());
    }

    @Test
    void SettlerRestoreMaterial(){
        Iron iron = new Iron();
        settler.AddMaterial(iron);
        asteroid.SetLayer(0);
        settler.RestoreMaterial(iron);
        assertEquals(iron, asteroid.GetMaterial());
    }



}
