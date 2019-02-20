package com.lanou.annonation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.lanou.annonation")
@EnableAspectJAutoProxy
public class Config {

}
