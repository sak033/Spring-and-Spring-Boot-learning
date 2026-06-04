package in.sk.main;

import in.sk.beans.Student;
import in.sk.config.SpringConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);

        Student std=(Student) context.getBean(Student.class);
        std.display();
    }
}
