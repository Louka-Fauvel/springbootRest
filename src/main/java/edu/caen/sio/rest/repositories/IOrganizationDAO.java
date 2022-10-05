package edu.caen.sio.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.caen.sio.rest.models.Organization;

public interface IOrganizationDAO extends JpaRepository<Organization, Integer> {

}
