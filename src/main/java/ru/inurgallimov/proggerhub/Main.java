package ru.inurgallimov.proggerhub;

import ru.inurgalimov.di.Container;
import ru.inurgallimov.proggerhub.repository.impl.UserRepositoryImpl;
import ru.inurgallimov.proggerhub.service.UserService;
import ru.inurgallimov.proggerhub.service.impl.UserServiceImpl;

public class Main {

    public static void main(String[] args) {
        Container container = new Container();
        container.register(UserRepositoryImpl.class, UserServiceImpl.class);
        container.wire();
        UserService service = container.getObject(UserServiceImpl.class);
        System.out.println(service);
    }

}
