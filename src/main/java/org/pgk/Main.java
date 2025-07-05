package org.pgk;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan("org.pgk")
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        String[] beanDefinitionNames =  context.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).forEach(name -> System.out.println(context.getBeanDefinition(name)));
        context.getBean(Greeter.class).greet();
    }
}