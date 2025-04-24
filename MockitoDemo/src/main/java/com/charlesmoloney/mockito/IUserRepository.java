package com.charlesmoloney.mockito;

import java.util.Optional;

import com.charlesmoloney.lombok.User;

public interface IUserRepository {
    Optional<User> findByEmail(String email);
    void save(User user);
}
