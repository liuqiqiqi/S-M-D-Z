package com.guojiayikao.App;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @Author: FA
 * @Date: 2020/9/7 10:56
 * @Email: 214177702@qq.com
 * @Description:  启动类
 */
@EnableDubbo
@ImportResource({"classpath:dubbo/dubbo-provider.xml"})
@SpringBootApplication
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class,args);
    }
}
