package huawei.poc.micro.common;

import org.springframework.boot.SpringApplication;

import huawei.poc.micro.common.config.ConfigServer;
import huawei.poc.micro.common.eureka.EurekaServer;
import huawei.poc.micro.common.gateway.ZuulApiGateway;

public class MicroApplication {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "application-eureka");
        SpringApplication.run(EurekaServer.class, args);
        System.setProperty("spring.config.name", "application-configserver");
        SpringApplication.run(ConfigServer.class, args);
        System.setProperty("spring.config.name", "application-zuul");
        SpringApplication.run(ZuulApiGateway.class, args);
    }

}
