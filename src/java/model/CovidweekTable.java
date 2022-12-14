/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import model.Covidweek;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

/**
 *
 * @author Chayodom
 */
public class CovidweekTable {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("SoapwithDBPU");
    
    
    public static List<Covidweek> findALLDB() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SoapwithDBPU");
        EntityManager em = emf.createEntityManager();
        List<Covidweek> coList = (List<Covidweek>)em.createNamedQuery("Covidweek.findAll").getResultList();  //time to change
        return coList;
    }

   

    
    public static Covidweek findEmployeeByseq(Integer seq) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SoapwithDBPU");
        EntityManager em = emf.createEntityManager();
        Covidweek emp = em.find(Covidweek.class, seq);
        em.close();
        return emp;
    }
    
  
  
    
    
    
}
