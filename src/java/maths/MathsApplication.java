/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maths;

import javax.json.JsonObject;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import net.sf.json.JSONObject;

/**
 * REST Web Service
 *
 * @author 1895268
 */
@Path("mobile")
public class MathsApplication {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of MathsApplication
     */
    public MathsApplication() {
    }

    /**
     * Retrieves representation of an instance of maths.MathsApplication
     * @return an instance of java.lang.String
     */
    @GET
    @Path("pro&{value1}&{value2}&{value3}&{value4}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getText(@PathParam("value1") String v1,
            @PathParam("value2") int v2,
            @PathParam("value3") int v3,
            @PathParam("value4") int v4) {
        String result = String.valueOf(v2);
        if(v1.equalsIgnoreCase("ap")){
            for(int i=0;i<v4;i++){
                 result += " " + (v2+=v3);
                 
            }
            
            
        }
        else if(v1.equalsIgnoreCase("gp")){
            int curr_term; 
            for (int i = 0; i <v4; i++) { 
                curr_term = v2 * (int)Math.pow(v3, i); 
                result += " " + curr_term; 
            }
        }
        else
            return "";
        
        
         
        //TODO return proper representation object
        
       
     return "The resut is :" + result;
    }

    @GET
    @Path("student&{value1}&{value2}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getText3(@PathParam("value1") String fname,
            @PathParam("value2") String lname) {
        //TODO return proper representation object
        JSONObject mainObject= new JSONObject();
        
        mainObject.accumulate("id", 1234);
        mainObject.accumulate("fname",fname );
        mainObject.accumulate("lname", lname);
        mainObject.accumulate("GPA", 50.6);
                
                
        return mainObject.toString();
    }
}
