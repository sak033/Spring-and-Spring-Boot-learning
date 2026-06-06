package in.sk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfigFile {

    @Bean
    public DriverManagerDataSource myDataSource(){
        DriverManagerDataSource dataSource=new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver"); //loading driver
        dataSource.setUrl("jdbc:mysql://localhost:3306/SpringJDBC");
        dataSource.setUsername("root");
        dataSource.setPassword("root123");
        return dataSource;
    }

    @Bean
    public JdbcTemplate myJdbcTemplate(){
        JdbcTemplate jdbcTemplate=new JdbcTemplate();
        jdbcTemplate.setDataSource(myDataSource());  //Manual DI
        return jdbcTemplate;
    }
}
