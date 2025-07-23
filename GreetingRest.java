/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.rest.app1;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.Path;
/**
 *
 *  @author Mark Kpodo
 */
@Path("app/version")
public class GreetingRest {

    @Path("{username}")
    @GET
    @Produces("text/html")
    public String sayHello(@PathParam("username") String username) {

        return "Greeting " + username + ",is nice meeting...";
    }
}
