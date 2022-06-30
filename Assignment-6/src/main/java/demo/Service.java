package demo;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Component;

//@Component
@Configuration
@PropertySource("classpath:config/db.properties")
public class Service {
	  @Value("${db.driverClassName}")
	  private String dbdriverClassName;
	  @Value("${db.url}")
	  private String dbUrl;
	  @Value("${db.username}")
	  private String dbUser;
	  @Value("${db.password}")
	  private String dbPwd;
	  
	   


	@Bean
	  public BasicDataSource dataSource() {
	    BasicDataSource ds = new BasicDataSource();
	    ds.setDriverClassName(dbdriverClassName);
	    ds.setUrl(dbUrl);
	    ds.setUsername(dbUser);
	    ds.setPassword(dbPwd);
	    return ds;
	  }
	  
 
	  @Bean
	  public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
	    return new PropertySourcesPlaceholderConfigurer();
	  } 
	  

@Override
public String toString() {
	return "Service [dbDriverClass=" + dbdriverClassName + ", dbUrl=" + dbUrl + ", dbUser=" + dbUser + ", dbPwd=" + dbPwd
			+ "]";
}
}
