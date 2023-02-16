package com.example.Sql_Rocks;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    //Here in Jpa Repository we are writing The entity first and the datatype of primary key.

    //Jpa repository is itself a interface. it has some functions which we can use directly in userRepository


}
