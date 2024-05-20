package com.jay.app.rest.Repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.jay.app.rest.Models.User;

public interface UserRepo extends JpaRepository <User, Long>{

}
