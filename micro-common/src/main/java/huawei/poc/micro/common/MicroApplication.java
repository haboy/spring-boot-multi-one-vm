package huawei.poc.micro.common;

import org.springframework.boot.SpringApplication;

import huawei.poc.micro.common.config.ConfigServer;
import huawei.poc.micro.common.eureka.EurekaServer;
import huawei.poc.micro.common.gateway.ZuulApiGateway;
import org.springframework.boot.builder.SpringApplicationBuilder;


public class MicroApplication {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "application-eureka");
        SpringApplication.run(EurekaServer.class, args);
        System.setProperty("spring.config.name", "application-configserver");
      new SpringApplicationBuilder(ConfigServer.class).web(false).run(args);

        // SpringApplication.run(ConfigServer.class, args);
        System.setProperty("spring.config.name", "application-zuul");
    //new SpringApplicationBuilder(ZuulApiGateway.class).web(false).run(args);

        SpringApplication.run(ZuulApiGateway.class, args);
    }

    

}
