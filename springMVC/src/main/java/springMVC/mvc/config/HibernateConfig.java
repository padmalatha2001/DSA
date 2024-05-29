package springMVC.mvc.config;


import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@PropertySource(value = "classpath:db.properties")
public class HibernateConfig {
	
	@Autowired
	Environment environment;
	@Bean
	public DriverManagerDataSource getManager() {
		DriverManagerDataSource driverManager=new DriverManagerDataSource();
		driverManager.setDriverClassName(environment.getRequiredProperty("driver"));
		driverManager.setUrl(environment.getRequiredProperty("url"));
		driverManager.setUsername(environment.getRequiredProperty("user"));
		driverManager.setPassword(environment.getRequiredProperty("password"));
		return driverManager;
	}
	@Bean
	public Properties getProperties() {
		Properties properties=new Properties();
		properties.put("hibernate.dialect",environment.getRequiredProperty("dialect"));
		properties.put("hibernate.show_sql",environment.getRequiredProperty("show_sql"));
		properties.put("hibernate.format_sql",environment.getRequiredProperty("format_sql"));
		properties.put("hibernate.hbm2ddl_auto",environment.getRequiredProperty("hbm2ddl.auto"));
		return properties;
	}
	
	@Bean
	public LocalSessionFactoryBean getSessionFactory()
	{
		LocalSessionFactoryBean sessionFactory=new LocalSessionFactoryBean();
		sessionFactory.setDataSource(getManager());
		sessionFactory.setHibernateProperties(getProperties());
		sessionFactory.setPackagesToScan("springMVC.mvc.entity");
		return sessionFactory;
	}
	
	@Bean
	public HibernateTemplate getTemplate() {
		 HibernateTemplate template=new  HibernateTemplate();
		 template.setSessionFactory(getSessionFactory().getObject());
		 return template;
	}
	
	@Bean
	public HibernateTransactionManager getTransaction() {
		HibernateTransactionManager hibernateTransactionManager=new HibernateTransactionManager();
		hibernateTransactionManager.setSessionFactory(getSessionFactory().getObject());
		return hibernateTransactionManager;
	}
}
