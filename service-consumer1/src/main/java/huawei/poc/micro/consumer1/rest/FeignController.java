package huawei.poc.micro.consumer1.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import huawei.poc.micro.consumer1.client.UserFeignClient;
import huawei.poc.micro.consumer1.domain.User;

/**
 * Created by albert on 2016/10/24.
 */
@RestController
@RequestMapping("/feign")
public class FeignController {
    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("{id}")
    public User findByIdFeign(@PathVariable Long id) {
        return userFeignClient.findOneFeign(id);
    }
}
