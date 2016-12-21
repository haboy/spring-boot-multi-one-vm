package huawei.poc.micro.provider.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import huawei.poc.micro.provider.domain.User;

/**
 * Created by albert on 2016/10/20.
 */

@RestController
@RefreshScope
public class UserController {

    @Value("${zk}")
    private String zkNode;
    @Value("${server.port}")
    private String port;
    private int times = 0;

    @GetMapping("/test")
    public String test() {
        return zkNode;
    }

    @GetMapping("/user/{id}")
    public User query(@PathVariable long id) {
        System.out.println("server-port::" + port + ", times::" + ++times);
        if (id == 1L) {
            return new User(1l);
        } else {
            return new User(2L);
        }
    }

}
