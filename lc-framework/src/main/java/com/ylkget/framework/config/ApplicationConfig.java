package com.ylkget.framework.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * <p>
 * ApplicationConfig
 * 程序注解配置
 * </p>
 *
 * @author joe 2021/5/31 15:56
 */

@Configuration
// 表示通过aop框架暴露该代理对象,AopContext能够访问
@EnableAspectJAutoProxy(exposeProxy = true)
// 指定要扫描的Mapper类的包的路径
@MapperScan("com.ylkget.**.mapper")
public class ApplicationConfig {

}
