/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import model.Covidweek;
import model.CovidweekTable;

/**
 *
 * @author Chayodom
 */
@WebService(serviceName = "SoapDBService")
public class SoapDBService {


    /**
     * Web service operation
     */
    @WebMethod(operationName = "findCovidDatabyseq")
    public Covidweek findCovidDatabyseq(@WebParam(name = "seq") int seq) {
        CovidweekTable covtable = new CovidweekTable();
       Covidweek cov = covtable.findEmployeeByseq(seq);
        return cov;
    }

  

  



    
 

  
    

  
    
}
