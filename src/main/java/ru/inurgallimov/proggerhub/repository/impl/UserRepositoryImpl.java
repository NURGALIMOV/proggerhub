package ru.inurgallimov.proggerhub.repository.impl;

import ru.inurgallimov.proggerhub.model.User;
import ru.inurgallimov.proggerhub.repository.UserRepository;

import java.util.HashMap;
import java.util.Map;

public class UserRepositoryImpl implements UserRepository {

    private final Map<String, User> users = new HashMap<>();

}
