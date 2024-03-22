package org.springdb.repos;

import org.springdb.entities.UserEntities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserEntities, Integer> {
}
