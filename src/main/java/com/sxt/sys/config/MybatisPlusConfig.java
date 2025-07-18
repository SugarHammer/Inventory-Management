package com.sxt.sys.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;

/**
 * mybatisplus的配置类
 * 
 *
 */
@Configuration
@ConditionalOnClass(value= {PaginationInterceptor.class})
public class MybatisPlusConfig {
	
	@Bean
	public PaginationInterceptor  paginationInterceptor() {
		return new PaginationInterceptor();
	}

}
