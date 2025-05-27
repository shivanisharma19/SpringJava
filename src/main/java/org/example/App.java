package org.example;

import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AbstractXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Employee e1 = context.getBean("emp1", Employee.class);
        System.out.println(e1.getEmpName());
        System.out.println(e1.getEmpId());
        System.out.println(e1.department.getDeptName());
        context.close();
    }
}
