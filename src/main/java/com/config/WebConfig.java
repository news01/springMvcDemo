//package com.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.ViewResolver;
//import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//
//@Configuration
//@EnableWebMvc
//@ComponentScan("com")
//public class WebConfig extends WebMvcConfigurerAdapter {
//
//	@Bean // 配置视图解析器
//	public ViewResolver viewResolver() {
//		System.out.println("配置视图解析器");
//		InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
//		internalResourceViewResolver.setPrefix("/jsp/");
//		internalResourceViewResolver.setSuffix("");
//		internalResourceViewResolver.setExposeContextBeansAsAttributes(true);
//		return internalResourceViewResolver;
//
//	}
//
//	@Override // 配置静态资源的处理
//	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
//		System.out.println("配置静态资源的处理");
//
//		// 要求DispatcherServlet将对静态资源的请求转发到Servlet容器中默认的Servlet上，而不是使用DispatcherServlet本身来处理此类请求
//		configurer.enable();
//	}
//}
