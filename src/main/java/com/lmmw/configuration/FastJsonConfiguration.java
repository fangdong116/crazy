package com.lmmw.configuration;


import java.nio.charset.Charset;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

@Configuration
public class FastJsonConfiguration {

	@Bean
	public FastJsonHttpMessageConverter getBean(){
		
		FastJsonHttpMessageConverter converter =  new FastJsonHttpMessageConverter();
		FastJsonConfig config = converter.getFastJsonConfig();
		config.setCharset(Charset.forName("UTF-8"));
		config.setSerializerFeatures(
				SerializerFeature.QuoteFieldNames,
				SerializerFeature.WriteMapNullValue,
				SerializerFeature.WriteNullNumberAsZero);
		converter.setFastJsonConfig(config);
		return converter;
	}
	
}
