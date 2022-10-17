package com.CRUD_Cliente.CRUD_Cliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRUD_Cliente.CRUD_Cliente.entities.Client;


@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
