package es.toni.services;

import es.toni.domain.User;

public interface UserService extends CRUDService<User> {

    User findByUserName(String userName);

}
