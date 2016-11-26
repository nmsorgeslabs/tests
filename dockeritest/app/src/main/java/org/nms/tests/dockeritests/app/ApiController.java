package org.nms.tests.dockeritests.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by daviz on 24/11/16.
 */
@RestController
public class ApiController {

    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public List<User> users(){
        return userService.users();
    }

    @RequestMapping("/users/{id}")
    public User user(@PathVariable("id") String id){
        return userService.user(id);

    }
}
