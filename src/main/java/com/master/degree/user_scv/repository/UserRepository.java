package com.master.degree.user_scv.repository;

import com.master.degree.user_scv.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

    void deleteByEmail(String email);

    @Query("SELECT CASE WHEN count(u) > 0 THEN true ELSE false END FROM User u where u.email = :email ")
    boolean existsUserByEmail(@Param("email") String email);

}
