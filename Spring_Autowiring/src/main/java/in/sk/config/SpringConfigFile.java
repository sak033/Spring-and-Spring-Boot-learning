package in.sk.config;

import in.sk.beans.Address;
import in.sk.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {
    @Bean
    public Address createAddressObj(){
       Address adr=new Address();
       adr.setHouseno(1234);
       adr.setCity("Pune");
       adr.setPincode(12345);
       return adr;
    }

    @Bean
    public Student createStdObj(){
        Student std=new Student();
        std.setName("Sakshi");
        std.setRollno(101);
        //std.setAddress(createAddressObj());  //manually DI
        return std;
    }
}
