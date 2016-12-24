package huawei.poc.micro.provider;

import org.springframework.boot.builder.SpringApplicationBuilder;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.annotation.EnableMBeanExport;

@SpringBootApplication
@EnableDiscoveryClient
@EnableMBeanExport(defaultDomain = "provider")

public class ProviderApplication {

    public static void main(String[] args) {
    	        new SpringApplicationBuilder(ProviderApplication.class).web(false).run(args);

        // SpringApplication.run(ProviderApplication.class, args);
    }
}
