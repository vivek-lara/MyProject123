package com.example.project1.repository;


import org.springframework.data.repository.CrudRepository;

import com.example.project1.entity.AppUser;

public interface AppUserRepository extends CrudRepository<AppUser, String> {
    public AppUser findByTokenAndEmail(String token,  String email);
}
