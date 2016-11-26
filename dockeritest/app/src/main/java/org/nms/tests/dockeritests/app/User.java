package org.nms.tests.dockeritests.app;

import java.util.UUID;

/**
 * Created by daviz on 24/11/16.
 */
public class User {


    private String uuid = UUID.randomUUID().toString();

    private String name;

    public String getUuid(){
        return this.uuid;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

}
