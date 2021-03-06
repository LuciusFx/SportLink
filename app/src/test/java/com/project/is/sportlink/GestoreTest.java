package com.project.is.sportlink;

import com.project.is.sportlink.dataModel.Gestore;
import org.junit.Test;
import junit.framework.TestCase;

import org.junit.Before;

import static junit.framework.Assert.assertEquals;

/**
 * Created by bitol on 13/01/2017.
 */

public class GestoreTest {
    protected Gestore gestore;
    @Before
    public void setUp(){
        gestore = new Gestore();
    }
    public void tearDown(){
        gestore = null;
    }
    public Test suite(TestCase obj){
        return (Test) obj;
    }

    @Test
    public void nome() throws Exception{
        gestore.setmNome("Luca");
        assertEquals("Luca",gestore.getmNome());
    }
    @Test
    public void cognome() throws Exception{
        gestore.setmCognome("Napoli");
        assertEquals("Napoli",gestore.getmCognome());
    }
    @Test
    public void email() throws Exception{
        gestore.setmEmail("luca@hotmail.it");
        assertEquals("luca@hotmail.it",gestore.getmEmail());
    }
    @Test
    public void pass() throws Exception{
        gestore.setmPass("password");
        assertEquals("password",gestore.getmPass());
    }
}
