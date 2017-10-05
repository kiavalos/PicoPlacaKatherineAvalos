/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import controlador.GestionarPicoPlaca;
import java.text.ParseException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author IRINA
 */
public class TestGesctionarPicoPlaca {
    
    public TestGesctionarPicoPlaca() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testPicoPlacaLunes() throws ParseException{
       GestionarPicoPlaca picoPlaca = new GestionarPicoPlaca();
       boolean resultado= picoPlaca.verificarPlaca("PYE-1401", "02/10/2017","18:00:00");
       boolean esperado = false;
        assertEquals(esperado, resultado);
        
        resultado= picoPlaca.verificarPlaca("PYE-1402", "02/10/2017","16:00:00");
        esperado = true;
        assertEquals(esperado, resultado);
    }
       
    @Test
    public void testPicoPlacaMartes() throws ParseException{
       GestionarPicoPlaca picoPlaca = new GestionarPicoPlaca();
       boolean resultado= picoPlaca.verificarPlaca("PYE-1403", "03/10/2017","18:00:00");
       boolean esperado = false;
        assertEquals(esperado, resultado);
        
        resultado= picoPlaca.verificarPlaca("PYE-1405", "03/10/2017","16:00:00");
        esperado = true;
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testPicoPlacaMiercoles() throws ParseException{
       GestionarPicoPlaca picoPlaca = new GestionarPicoPlaca();
       boolean resultado= picoPlaca.verificarPlaca("PYE-1405", "04/10/2017","19:00:00");
       boolean esperado = false;
        assertEquals(esperado, resultado);
        
        resultado= picoPlaca.verificarPlaca("PYE-1402", "04/10/2017","16:00:00");
        esperado = true;
        assertEquals(esperado, resultado);
    }
    
     @Test
    public void testPicoPlacaJueves() throws ParseException{
       GestionarPicoPlaca picoPlaca = new GestionarPicoPlaca();
       boolean resultado= picoPlaca.verificarPlaca("PYE-1407", "05/10/2017","18:15:00");
       boolean esperado = false;
        assertEquals(esperado, resultado);
        
        resultado= picoPlaca.verificarPlaca("PYE-1402", "05/10/2017","16:00:00");
        esperado = true;
        assertEquals(esperado, resultado);
    }
    
     @Test
    public void testPicoPlacaViernes() throws ParseException{
       GestionarPicoPlaca picoPlaca = new GestionarPicoPlaca();
       boolean resultado= picoPlaca.verificarPlaca("PYE-1409", "06/10/2017","17:15:00");
       boolean esperado = false;
        assertEquals(esperado, resultado);
        
        resultado= picoPlaca.verificarPlaca("PYE-1400", "06/10/2017","12:00:00");
        esperado = true;
        assertEquals(esperado, resultado);
    }
}
