package in.sk.config;

import in.sk.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {
    @Bean
    public Student stdId(){
     Student std=new Student();

     std.setName("Riya");
     std.setRollno(101);
     std.setEmail("test@gmail.com");

     return std;
    }
}
