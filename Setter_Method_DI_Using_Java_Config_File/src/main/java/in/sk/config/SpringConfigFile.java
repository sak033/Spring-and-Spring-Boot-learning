package in.sk.config;


import in.sk.beans.Address;
import in.sk.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {

    @Bean
    public Address createAddressObj(){
        Address addr=new Address();
        addr.setHouseno(100);
        addr.setCity("Nagpur");
        addr.setPincode(12345);
        return addr;
    }

    @Bean
    public Student createStdObj(){
        Student std=new Student();
        std.setRollno(101);
        std.setName("sakshi");
        std.setAddress(createAddressObj());
        return std;
    }
}
