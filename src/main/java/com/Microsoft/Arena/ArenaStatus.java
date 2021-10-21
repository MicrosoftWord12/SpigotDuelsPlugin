package com.Microsoft.Arena;

public enum ArenaStatus {
    Cleaning("FireFly.Status.Create"),
    Cleaned("FireFly.Status.Created"),
    Loading("FireFly.Status.Loading"),
    Loaded("FireFly.Status.Loaded");


    
    private String status;
    private ArenaStatus(String status){
        this.status = status;
    };

}
