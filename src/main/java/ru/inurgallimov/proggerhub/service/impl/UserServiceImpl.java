package ru.inurgallimov.proggerhub.service.impl;

import lombok.RequiredArgsConstructor;
import ru.inurgallimov.proggerhub.repository.UserRepository;
import ru.inurgallimov.proggerhub.service.UserService;

@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

}
