package com.java.querysubscriber.Exception;

import java.io.Serial;

public class InternalServerError extends RuntimeException
{
    @Serial
    private static final long serialVersionUID = 1L;

    public InternalServerError(String msg)
    {
        super(msg);
    }
}
