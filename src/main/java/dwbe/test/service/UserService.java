package dwbe.test.service;

import dwbe.test.model.User;
import dwbe.test.model.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class UserService {
    @Autowired
    private UserDAO userDAO;

    public void gravarServiceUser(User user) {
        userDAO.gravarUserDAO(user);
    }

    public ArrayList<User> listarServiceUsuario() {
        return userDAO.buscarUsuarioDAO();
    }
}
