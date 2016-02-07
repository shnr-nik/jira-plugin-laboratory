package org.bitbucket.shnarevich.laboratory.dao;

import org.bitbucket.shnarevich.laboratory.entity.UserEntity;
import org.bitbucket.shnarevich.laboratory.model.User;

public interface UserDAO {
    public UserEntity addUser(User user) throws Exception;

    public UserEntity[] getUsers() throws Exception;
}
