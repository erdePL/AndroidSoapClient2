package com.example.kamil.androidsoapclient2.requestBuilding.markups;

import com.example.kamil.androidsoapclient2.model.Message;

public class ServiceMethod {
    private Message message;
    private Integer id;
    public ServiceMethod() {
        this.message = null;
        this.message = null;
    }

    public void setMessage(Message message) {
        this.id = null;
        this.message = message;
    }
    public Message getMessage() {
        return message;
    }

    public void setId(int id) {
        this.message = null;
        this.id = id;
    }
    public int getId() {
        return id;
    }
}
