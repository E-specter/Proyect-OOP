package dev.Lovelace.EventPro.repository;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SQLiteConfiguracion {
  @Bean
    public DataSource dataSource() {
      DriverManagerDataSource dataSource = new DriverManagerDataSource();
      dataSource.setDriverClassName("org.sqlite.JDBC");
      dataSource.setUrl("jdbc:sqlite:src/main/resources/repositorio/mydatabase.db");
    return dataSource;
    }
}
