package org.bitbucket.shnarevich.laboratory.webwork;

import com.atlassian.activeobjects.external.ActiveObjects;
import com.atlassian.jira.project.Project;
import org.bitbucket.shnarevich.laboratory.dao.UserDAO;
import org.bitbucket.shnarevich.laboratory.dao.UserDAOImpl;
import org.bitbucket.shnarevich.laboratory.entity.UserEntity;
import org.bitbucket.shnarevich.laboratory.model.User;
import org.bitbucket.shnarevich.laboratory.model.UserImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.atlassian.jira.web.action.JiraWebActionSupport;
import webwork.action.ServletActionContext;


public class LaboratoryWebworkAction extends JiraWebActionSupport
{
    private static final Logger log = LoggerFactory.getLogger(LaboratoryWebworkAction.class);
    private UserDAO userDAO;
    private UserEntity[] users;


    public LaboratoryWebworkAction(ActiveObjects ao) {
        userDAO = new UserDAOImpl(ao);
    }

    @Override
    public String execute() throws Exception {

        users = userDAO.getUsers();

        return super.execute();
    }

    public String doAdd() throws Exception {
        String name = getHttpRequest().getParameterValues("name")[0];
        User user = new UserImpl(name);
        userDAO.addUser(user);
        ServletActionContext.getResponse().sendRedirect("laboratory.jspa");
        return NONE;
    }
}
