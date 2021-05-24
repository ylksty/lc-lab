package com.ylkget;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * <p>
 * 启动程序
 * </p>
 *
 * @author joe 2021/5/24 18:02
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class LcApplication {
    public static void main(String[] args) {
        SpringApplication.run(LcApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  lc启动成功   ლ(´ڡ`ლ)ﾞ");
    }
}
