package com.example.demo;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext
                ("applicationContext.xml");
        Person person=context.getBean("myPerson",Person.class);

        System.out.println(person.getAge()+" "+person.getAnimal()+" "+person.getName());
    }

}
