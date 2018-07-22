package mr.mbconsulting.Sygep.services;

import mr.mbconsulting.Sygep.entities.User;

public interface UserService {
    boolean signup(User user);
    public String signin(String username, String password);

}
