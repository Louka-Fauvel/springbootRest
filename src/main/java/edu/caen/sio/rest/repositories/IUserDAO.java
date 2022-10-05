package edu.caen.sio.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.caen.sio.rest.models.User;

public interface IUserDAO extends JpaRepository<User, Integer> {

}
