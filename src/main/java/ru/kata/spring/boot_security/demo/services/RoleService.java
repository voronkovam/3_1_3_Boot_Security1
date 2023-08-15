package ru.kata.spring.boot_security.demo.services;

import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> getListRoles();

    Role getRoleById(Long id);

    void addRole(Role role);
}
