package com.ylkget.framework.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * ApplicationConfig
 * 程序注解配置
 * </p>
 *
 * @author joe 2021/5/31 15:56
 */

@Configuration
// 指定要扫描的Mapper类的包的路径
@MapperScan("com.ylkget.**.mapper")
public class ApplicationConfig {

}
