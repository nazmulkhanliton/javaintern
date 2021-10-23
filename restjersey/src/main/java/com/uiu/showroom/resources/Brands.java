package com.uiu.showroom.resources;

import jakarta.websocket.server.PathParam;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/showroom")
public class Brands {
	
	@GET
	@Path("/brands")
	@Produces(MediaType.TEXT_PLAIN)
	public String getBrands() {
		
		return "list of Brands";
	}
	
	@POST
	@Path("/brands")
	@Produces(MediaType.TEXT_PLAIN)
	public String postBrands() {
		
		return "Add a new Brand";
	}
	
	@PUT
	@Path("/brands/brandId")
	@Produces(MediaType.TEXT_PLAIN)
	public String putBrands(int brandId) {
		
		return "Update Brand info ";
	}
	
	@DELETE
	@Path("/brands/brandId")
	@Produces(MediaType.TEXT_PLAIN)
	public String deleteBrands(int brandId) {
		
		return "Delete Brand from DB";
	}
}











