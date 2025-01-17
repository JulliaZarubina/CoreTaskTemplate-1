package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserService userServiceJDBC = new UserServiceImpl();
        userServiceJDBC.createUsersTable();
        userServiceJDBC.saveUser("Stephen", "King", (byte) 54);
        userServiceJDBC.saveUser("Friedrich", "Nietzsche", (byte) 27);
        userServiceJDBC.saveUser("Fyodor", "Dostoevcky", (byte) 45);
        System.out.println(userServiceJDBC.getAllUsers());
        userServiceJDBC.removeUserById(2);
        userServiceJDBC.cleanUsersTable();
        userServiceJDBC.dropUsersTable();
    }
}
