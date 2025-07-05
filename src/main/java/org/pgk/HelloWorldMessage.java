package org.pgk;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldMessage {

    public String getMessage() {
        return "Hello and welcome!";
    }
}
