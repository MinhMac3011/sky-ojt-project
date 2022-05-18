package org.acme.repository;


import io.quarkus.mongodb.panache.PanacheMongoRepository;
import org.acme.entity.People;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PeopleRepository implements PanacheMongoRepository<People> {


    public String getName(People people) {
        return people.getName();
    }

    public String getGreeting(People people) {
        return people.getGreeting();
    }
}

//public class PeopleRepository{}

