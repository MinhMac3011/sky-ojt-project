package org.acme;

import org.acme.entity.People;
import org.acme.repository.PeopleRepository;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/hello")
public class GreetingResource {

    private People people = new People(1625, "Minhmd", "Boujour");

    private final PeopleRepository peopleRepository;

    @Inject
    public GreetingResource(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }

    @GET
    @Path("/info")
    @Produces(MediaType.APPLICATION_JSON)
    public String getInfo(){
        return peopleRepository.getGreeting(people) + " " + peopleRepository.getName(people);
    }

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<People> getAll(){
        return peopleRepository.listAll();
    }
}