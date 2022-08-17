//package app.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import javax.persistence.EntityManagerFactory;
//import javax.sql.DataSource;
//
//import org.springframework.core.env.Environment;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//
//import javax.annotation.Resource;
//import java.io.IOException;
//import java.io.InputStream;
//import java.util.Properties;
//
//@Configuration
//@EnableTransactionManagement
//@PropertySource("classpath:application.properties")
//@ComponentScan("app")
//public class DbConfig {
//
////    @Resource
//    private final Environment env;
//
//    public DbConfig(Environment env) {
//        this.env = env;
//    }
//
//    @Bean
//    public DataSource getDataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName(env.getRequiredProperty("db.driver"));
//        dataSource.setUrl(env.getRequiredProperty("db.url"));
//        dataSource.setUsername(env.getRequiredProperty("db.username"));
//        dataSource.setPassword(env.getRequiredProperty("db.password"));
//        return dataSource;
//    }
//
//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean() {
//        LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
//        emf.setDataSource(getDataSource());
//        emf.setPackagesToScan(env.getRequiredProperty("db.entity.package"));
//        emf.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
////        emf.setJpaProperties(getHibernateProperties());
//        return emf;
//    }
//
//    @Bean
//    public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
//        JpaTransactionManager manager = new JpaTransactionManager();
////        manager.setEntityManagerFactory(entityManagerFactoryBean().getObject());
//        manager.setEntityManagerFactory(emf);
//        return manager;
//    }
//
//    private Properties getHibernateProperties() {
//        Properties properties = new Properties();
//        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream("application.properties")) {
//            properties.load(inputStream);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return properties;
//    }
//}
