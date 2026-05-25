package in.sk.main;

import in.sk.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[]  args){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

        Student std1= (Student) context.getBean("std");
        std1.display();
    }
}
