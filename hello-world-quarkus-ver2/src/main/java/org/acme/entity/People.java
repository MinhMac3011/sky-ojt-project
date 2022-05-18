package org.acme.entity;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;
import org.bson.codecs.pojo.annotations.BsonProperty;

@MongoEntity(collection="helloworld")
public class People extends PanacheMongoEntity{

    @BsonProperty("id")
    private Integer id;
    @BsonProperty("name")
    private String name;
    @BsonProperty("greeting")
    private String greeting;


    public People() {
    }

    public People(Integer id, String name, String greeting) {
        this.id = id;
        this.name = name;
        this.greeting = greeting;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }
}

