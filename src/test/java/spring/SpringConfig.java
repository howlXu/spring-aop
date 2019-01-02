package spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan("aop,base,demo,spring")
@Configuration
@EnableAspectJAutoProxy
public class SpringConfig {

}
