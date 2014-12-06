package DAO;

import java.sql.ResultSet;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class DAOTest {
    
    public DAOTest() {
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
    public void testGetCamposBD() {
        System.out.println("getCamposBD");
        String tableName = "PROCESSADOR";
        boolean incluirAtributosAI = true;
        DAO instance = new DAO();
        String[] expResult = new String[]{"ID", "VALOR_FREQUENCIA", "UNIDADE_FREQUENCIA", "NUMERO_NUCLEOS", "FABRICANTE"};
        String[] result = instance.getCamposBD(tableName, incluirAtributosAI);
        assertArrayEquals(expResult, result);
    }

}
