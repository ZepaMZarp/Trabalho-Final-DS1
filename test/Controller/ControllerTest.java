package Controller;

import Model.Administrador;
import Model.Usuario;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ControllerTest {
    
    public ControllerTest() {
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

    @Test
    public void testGetIndiceArray() throws SQLException {
        System.out.println("getIndiceArray");
        Object[] array = new String[]{"123", "991", "012", "001"};
        Object registro = "001";
        Controller instance = new Controller();
        int expResult = 3;
        int result = instance.getIndiceArray(array, registro);
        assertEquals(expResult, result);
    }
    
}
