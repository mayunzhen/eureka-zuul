package com.study.eurekazuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
//https://www.cnblogs.com/songlu/p/9979777.html

/**
 *zuul过滤器有四种类型分别是：pre 路由前,route 路由时,post 路由完毕,error 发生错误时。
 */
@SpringBootApplication
@EnableZuulProxy
public class EurekaZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaZuulApplication.class, args);
    }

}
