package com.spring.boot.cntrl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@PropertySource(value="classpath:application.properties")
public class ConfigCntrl {

	/*
	 * @Bean public DataSource getDataSource() { return
	 * DataSourceBuilder.create().type(DataSource.class).build(); }
	 */
	 @Value("${spring.datasource.driver-class-name}")
	  private String dbDriverClassName;

	  @Value("${spring.datasource.url}")
	  private String dbUrl;

	  @Value("${spring.datasource.data-username}")
	  private String dbUsername;

	  @Value("${spring.datasource.password}")
	  private String dbPassword;

	
	 @Bean
	  public DataSource getDataSource() {
	    return DataSourceBuilder
	        .create()
	        .url(dbUrl)
	        .driverClassName(dbDriverClassName)
	        .username(dbUsername)
	        .password(dbPassword)
	        .build();
	  }
	 
	 
	@Bean
	public JdbcTemplate getJdbcTemplate(DataSource ds) {
		return new JdbcTemplate(ds);
	}
}
