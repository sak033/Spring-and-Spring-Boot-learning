package in.sk.config;

import in.sk.beans.Address;
import in.sk.beans.Student;
import in.sk.beans.Subjects;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import  java.util.List;

import java.util.ArrayList;

@Configuration
public class SpringConfigFile {
    @Bean
    public Address createAddressObj1(){
        Address adr=new Address();
        adr.setHouseno(1234);
        adr.setCity("Pune");
        adr.setPincode(12345);
        return adr;
    }

    @Bean
    public Address createAddressObj2(){
        Address adr=new Address();
        adr.setHouseno(23456);
        adr.setCity("Delhi");
        adr.setPincode(78903);
        return adr;
    }

    @Bean
    public Subjects createSbjObj(){
        Subjects sbj=new Subjects();
        List<String>  subjects_list= new ArrayList<>();
        subjects_list.add("Java");
        subjects_list.add("Python");
        subjects_list.add("maths");
        sbj.setSubjects(subjects_list);
        return sbj;
    }

    @Bean
    public Student createStdObj(){
        Student std=new Student();
        std.setName("Sakshi");
        std.setRollno(101);
        //std.setSubjects(createSbjObj());  //Manually DI
        //std.setAddress(createAddressObj());  //manually DI
        return std;
    }
}
