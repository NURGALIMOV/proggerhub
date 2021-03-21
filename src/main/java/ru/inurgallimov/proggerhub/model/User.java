package ru.inurgallimov.proggerhub.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

@AllArgsConstructor
@Data
public class User {
    private String id;
    private String name;
    private String avatarUrl;
    private String nickname;
    private String password;
    private Set<String> roles;
    private long created;
}
