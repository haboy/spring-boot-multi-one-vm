package huawei.poc.micro.hytrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.boot.autoconfigure.web.EmbeddedServletContainerAutoConfiguration;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;

/**
 * Created by albert on 2016/12/20.
 */

// @SpringBootApplication(exclude = {EmbeddedServletContainerAutoConfiguration.class, WebMvcAutoConfiguration.class})
@EnableMBeanExport(defaultDomain = "hystrix")
@SpringBootApplication
public class HytrixApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(HytrixApplication.class).web(false).run(args);

        // SpringApplication.run(HytrixApplication.class, args);
    }
}
