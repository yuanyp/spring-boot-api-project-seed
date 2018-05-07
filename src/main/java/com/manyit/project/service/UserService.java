package com.manyit.project.service;
import com.manyit.project.model.User;
import com.manyit.project.core.Service;


/**
 * Created by CodeGenerator on 2018/05/03.
 */
public interface UserService extends Service<User> {

    void updateAbc(User model);//复杂业务逻辑代码

}
