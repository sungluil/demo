package nhAbstapp01;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class Mybatis {

    @Bean
    public SqlSessionFactory sqlSessionFactory(ApplicationContext applicationContext, DataSource dataSource) throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setConfigLocation(applicationContext.getResource("classpath:/config/mybatis/mybatis-config.xml"));
        factoryBean.setMapperLocations(applicationContext.getResources("classpath:/mapper/*_mapper.xml"));
        return factoryBean.getObject();

    }
}
