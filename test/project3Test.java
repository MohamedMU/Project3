/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import project3.Project3;

/**
 *
 * @author jit
 */
public class project3Test {
    
    public project3Test() {
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
    ///////////////////////////////////////////////////////////////
    
        @Test
    public void test1cipherATBASH() {
        String text = "JAVA PROGRAMMING";
        String result = "QZEZ KILTIZNNRMT";
        
        assertEquals(result, project3.Project3.cipherAndDecipheriATBASH(text));
    
    }
    
    ///////////////////////////////////////////////////////////////////////////
       @Test
    public void testDecipheriATBASH() {
        String text = "QZEZ KILTIZNNRMT";
        String result = "JAVA PROGRAMMING";
        
        assertEquals(result, project3.Project3.cipherAndDecipheriATBASH(text));
    
    }
    ///////////////////////////////////////////////////////////////////////////
    
   @Test
   public void test1CipherHexadecimal() {
       String text = "JAVA PROGRAMMING";
       String result = "4A 41 56 41 20 50 52 4F 47 52 41 4D 4D 49 4E 47";
       
       assertEquals(result, project3.Project3.cipherHexadecimal(text));
       
   }
   ///////////////////////////////////////////////////////////////////////////
   
   @Test
   public void test1decipherHexadecimal() {
       String text = "4A 41 56 41 20 50 52 4F 47 52 41 4D 4D 49 4E 47";
       String result = "JAVA PROGRAMMING";
       
       assertEquals(result, project3.Project3.decipherHexadecimal(text));
   }
   ///////////////////////////////////////////////////////////////////////////
   
   @Test
   public void test1cipherVigenere() {
       String text = "JAVA PROGRAMMING";
       String result = "BEXR TKGKTRQFARI";
       
       assertEquals(result, project3.Project3.cipherVigenere(text));
       
   }
   ///////////////////////////////////////////////////////////////////////////
   
   @Test
   public void testdecipherVigenere() {
       String text = "BEXR TKGKTRQFARI";
       String result = "JAVA PROGRAMMING";
       
       assertEquals(result, project3.Project3.decipherVigenere(text));
       
   }
   ///////////////////////////////////////////////////////////////////////////
   
   @Test
   public void test2cipherATBASH() {
       String text = "WELCOME";
       String result = "DVOXLNV";
       
       assertEquals(result, project3.Project3.cipherAndDecipheriATBASH(text));
       
   }
   ///////////////////////////////////////////////////////////////////////////
   @Test
   public void test2CipherHexadecimal() {
       String text = "WELCOME";
       //String result = "57 45 4C 43 4F 4D 45";
       
       assertNotNull(project3.Project3.cipherHexadecimal(text));
       
   }
   ///////////////////////////////////////////////////////////////////////////
   
   @Test
   public void test2cipherVigenere() {
       String text = "WELCOME";
       
       assertNotNull(project3.Project3.cipherVigenere(text));
   }
   ///////////////////////////////////////////////////////////////////////////
   
   @Test
   public void test2decipherHexadecimal () {
       String text = "WELCOME";
       
       assertNotNull(project3.Project3.decipherHexadecimal(text));
   }
}
