package edu.caen.sio.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.caen.sio.rest.models.Group;

public interface IGroupDAO extends JpaRepository<Group, Integer> {

}
