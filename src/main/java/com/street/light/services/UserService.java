package com.street.light.services;

import com.street.light.model.User;

public interface UserService {
    User create(User user);

    User getById(int id);

    User update(int id, User user);

    void delete(int id);
}
