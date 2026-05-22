package in.sk.main;

import in.sk.config.SpringCnfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import  in.sk.beans.Student;

public class Main {
    public static void main(String[] args){

        ApplicationContext context=new AnnotationConfigApplicationContext(SpringCnfigFile.class);

        Student std=(Student)context.getBean("stdId");
        std.display();

    }
}
