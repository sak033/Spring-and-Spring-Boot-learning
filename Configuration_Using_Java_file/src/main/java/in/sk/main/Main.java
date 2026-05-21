package in.sk.main;

import in.sk.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import in.sk.config.SpringConfigFile;

public class Main {
    public static void main(String[] args){
        //Activate Spring Container
        ApplicationContext context= new  AnnotationConfigApplicationContext(SpringConfigFile.class);

        Student std=(Student) context.getBean("stdId");
        std.display();
    }


}
