package com.fengwenyi.multimodule.repository;

import com.fengwenyi.multimodule.domail.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Wenyi Feng
 */
@Component
public class UserRepository {

    public List<User> findAll() {
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(i);
            user.setName(Math.random() + "-" + i);
            user.setAge(14 + i);
            userList.add(user);
        }
        return userList;
    }

}
