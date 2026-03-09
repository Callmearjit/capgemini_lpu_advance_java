package com.example._thMarch_city_library.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example._thMarch_city_library.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
