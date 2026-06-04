package in.sk.main;

import in.sk.beans.Student;
import in.sk.config.JavaConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.xml.StaxUtils;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfigFile.class);

        Student std=(Student) context.getBean(Student.class);
        std.display();
    }
}
