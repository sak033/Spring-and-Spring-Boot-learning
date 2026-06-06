package in.sk.main;

import in.sk.bean.Student;
import in.sk.config.SpringConfigFile;
import in.sk.mappers.StudentRowMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigFile.class);

        JdbcTemplate jdbcTemplate= context.getBean(JdbcTemplate.class);

        //------------INSERT---------------------------

//        int std_rollno=103;
//        String std_name="Payal";
//        float std_marks=54.4f;
//
//        String query="INSERT INTO STUDENT VALUES(?, ?, ?)";
//       int rowsAffected= jdbcTemplate.update(query, std_rollno, std_name, std_marks);
//
//       if(rowsAffected>0){
//           System.out.println("Data inserted Successfully!");
//       }
//       else{
//           System.out.println("Not inserted");
//       }


        //---------------------UPDATE-------------------
//        float marks=98.5f;
//        int rollno=101;
//        String query="UPDATE STUDENT SET std_marks=? WHERE std_roll=?";
//        int rowsAffected=jdbcTemplate.update(query, marks, rollno);
//
//        if(rowsAffected>0){
//         System.out.println("Data Updated Successfully!");
//    }
//       else{
//          System.out.println("Not updated");
//   }


        //--------------------DELETE-----------------------
//
//            int rollno=102;
//
//            String query="DELETE FROM STUDENT WHERE std_roll=?";
//            int rowAffected=jdbcTemplate.update(query, rollno);
//            if(rowAffected>0){
//                System.out.println("Deleted");
//            }else {
//                System.out.println("Not deleted");
//            }


        //--------------------SELECT-----------------------------
        String query="SELECT * FROM STUDENT";
        List<Student> std_list= jdbcTemplate.query(query, new StudentRowMapper());

        for(Student std: std_list){
            System.out.println("RollNo :" +std.getRollno());
            System.out.println("Name:"+std.getName());
            System.out.println("Marks :"+std.getMarks());
            System.out.println("---------------------------------------------");
        }

    }
}
