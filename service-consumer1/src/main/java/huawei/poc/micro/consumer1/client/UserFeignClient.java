package huawei.poc.micro.consumer1.client;


import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import huawei.poc.micro.consumer1.domain.User;

/**
 * Created by albert on 2016/10/20.
 */

@FeignClient(name = "provider")
public interface UserFeignClient {
    @RequestMapping("/user/{id}")
    public User findOneFeign(@RequestParam("id") Long id);
}
