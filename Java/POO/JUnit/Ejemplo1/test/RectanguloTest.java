/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import ejemplo1.Rectangulo;
import ejemplo1.services.RectanguloService;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;

/**
 *
 * @author Krausser
 */
public class RectanguloTest {
    
    RectanguloService r;
    
    public RectanguloTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        r = new RectanguloService();
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void StartColor(){
        assertNotNull(new Rectangulo(10,10).getColor());
    }
    
    @Test
    public void calcularArea(){
        //r = new RectanguloService();
        
        assertEquals(100, r.calcularArea(new Rectangulo(10,10)),0);
        assertEquals(20, r.calcularArea(new Rectangulo(4,5)),0);
        assertEquals(5, r.calcularArea(new Rectangulo(5,1)),0);
    }
}
