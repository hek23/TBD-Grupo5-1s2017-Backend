package tk.ww3app.service;

import java.util.List;
import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;

import tk.ww3app.facade.KeywordResumeFacade;
import tk.ww3app.model.KeywordResume;

@Path("/krs")
@ApplicationPath("/")

public class KeywordResumeService extends Application{
	
	@EJB 
	KeywordResumeFacade FacadeInjection;
	
	Logger logger = Logger.getLogger(KeywordResume.class.getName());
	
	@GET
	@Path("/listwordsresume")
	@Produces("application/jsonaa")
	public List<KeywordResume> findAll(){
		return FacadeInjection.findAll();
	}
	
	@GET
    @Path("/getwordresume")
    @Produces("application/json")
    public KeywordResume find(@QueryParam("id") Integer id) {
        return FacadeInjection.find(id);
    }
	
	

}
