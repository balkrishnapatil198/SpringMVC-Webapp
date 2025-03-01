package com.telusko.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annoation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
@EnablewebMvc
@ComponentScan("com.telusko")
public class MvcConfig extends WebMvcConfigurerAdapter
{

}