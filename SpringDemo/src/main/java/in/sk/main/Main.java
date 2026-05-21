package in.sk.main;

import in.sk.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args){
        //start spring container--->starts performing instructions provided in applicationContext.xml files
        ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");

       // Student std=new Student();---> we will not create object---Spring container create object

       Student std=context.getBean("stdId", Student.class);
       std.display();

       Student std1=context.getBean("stdId1", Student.class );
       std1.display();

    }
}
