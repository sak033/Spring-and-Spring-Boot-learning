package in.sk.config;


import in.sk.beans.Address;
import in.sk.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigFile {

    @Bean
    public Address createAddressObj(){
        Address addr=new Address(100, "Nagpur", 12345);

        return addr;
    }

    @Bean
    public Student createStdObj(){
        Student std=new Student(101, "Rahul", createAddressObj());

        return std;
    }
}
