package org.pgk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Greeter {

    HelloWorldMessage helloWorldMessage;

    /**
     *
    public HelloWorldMessage getHelloWorldMessage() {
        return helloWorldMessage;
    }

    @Autowired
    public void setHelloWorldMessage(HelloWorldMessage helloWorldMessage) {
        this.helloWorldMessage = helloWorldMessage;
    }
     */

    public Greeter() {}

    @Autowired
    public Greeter(HelloWorldMessage helloWorldMessage) {
        this.helloWorldMessage = helloWorldMessage;
    }

    public void greet() {
        System.out.println(this.helloWorldMessage.getMessage());
    }
}
