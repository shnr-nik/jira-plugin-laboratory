package org.bitbucket.shnarevich.laboratory.entity;

import net.java.ao.Entity;
import org.bitbucket.shnarevich.laboratory.model.User;

import java.util.Date;

import net.java.ao.Preload;

@Preload
public interface UserEntity extends Entity, User{
    public Date getCreated();

    public void setCreated(Date created);

}
