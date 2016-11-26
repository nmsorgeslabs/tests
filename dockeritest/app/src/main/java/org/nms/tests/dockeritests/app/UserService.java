package org.nms.tests.dockeritests.app;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daviz on 24/11/16.
 */
@Service
public class UserService {

    private static List<User> users;

    static{
        users = new ArrayList<>();
        for(int i=0;i<10;i++){
            final boolean add = users.add(buildUser(i));
        }
    }

    private static User buildUser(int i) {
        User u = new User();
        u.setName("user_"+i);

        return u;
    }


    public List<User> users() {

        return users;
    }

    public User user(String uuid){
        return users.stream().filter(u -> uuid.equals(u.getUuid())).findFirst().orElse(null);
    }
}
