package org.bitbucket.shnarevich.laboratory.dao;

import com.atlassian.activeobjects.external.ActiveObjects;
import com.atlassian.sal.api.transaction.TransactionCallback;
import org.bitbucket.shnarevich.laboratory.entity.UserEntity;
import org.bitbucket.shnarevich.laboratory.model.User;

import java.util.Date;

public class UserDAOImpl implements UserDAO {
    private final ActiveObjects ao;

    public UserDAOImpl(ActiveObjects ao) {
        this.ao = ao;
    }

    public UserEntity addUser(final User user) throws Exception {
        return ao.executeInTransaction(new TransactionCallback<UserEntity>() {
            public UserEntity doInTransaction() {
                UserEntity entity = ao.create(UserEntity.class);
                entity.setName(user.getName());
                entity.setCreated(new Date(System.currentTimeMillis()));
                entity.save();

                return entity;
            }
        });
    }

    public UserEntity[] getUsers() throws Exception {
        return ao.executeInTransaction(new TransactionCallback<UserEntity[]>() {
            public UserEntity[] doInTransaction() {
                return ao.find(UserEntity.class);
            }
        });
    }
}
