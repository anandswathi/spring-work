package com.ran.sample.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScans(value = { @ComponentScan("com.boraji.tutorial.spring.dao"),
		@ComponentScan("com.boraji.tutorial.spring.service") })
public class AppConfiguration {

	@Bean
	public LocalEntityManagerFactoryBean geEntityManagerFactoryBean() {
		LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
		factoryBean.setPersistenceUnitName("LOCAL_PERSISTENCE");
		return factoryBean;
	}

	@Bean
	public JpaTransactionManager geJpaTransactionManager() {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(geEntityManagerFactoryBean().getObject());
		return transactionManager;
	}
}
