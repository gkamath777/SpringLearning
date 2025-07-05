package org.pgk;

import org.springframework.stereotype.Component;

@Component
public class Greeter {
    HelloWorldMessage helloWorldMessage;

    public Greeter(HelloWorldMessage helloWorldMessage) {
        this.helloWorldMessage = helloWorldMessage;
    }

    public void greet() {
        System.out.println(this.helloWorldMessage.getMessage());
    }
}
