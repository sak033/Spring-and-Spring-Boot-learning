package org.example;

import in.sk.config.SpringConfigFile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.HashMap;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);

       NamedParameterJdbcTemplate npJdbcTemplate=(NamedParameterJdbcTemplate) context.getBean("namedParameterJdbcTemplate");

       Map<String , Object> map=new HashMap<String, Object>();
       map.put("key_rollno", 104);
       map.put("key_name", "Radha");
       map.put("key_marks", 88.8f);
       String query="INSERT INTO STUDENT VALUES(:key_rollno, :key_name, :key_marks)";
       int rowsAffected=npJdbcTemplate.update(query, map);
       if(rowsAffected>0){
           System.out.println("Inserted");
       }
       else{
           System.out.println("Not inserted");
       }
    }
}