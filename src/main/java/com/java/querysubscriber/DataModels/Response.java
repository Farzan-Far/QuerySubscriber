package com.java.querysubscriber.DataModels;

public class Response
{
    //Todo: Change the class type to Record
    private String message;

    public Response(String message) {
        this.message = message;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }
}
