package edu.caen.sio.rest.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class Group {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@NonNull
	@Column(length = 30, nullable = false)
	private String name;
	
	@NonNull
	@Column(length = 255, nullable = false)
	private String email;
	
	@NonNull
	@Column(length = 30, nullable = false)
	private String aliases;
	
	@JsonIgnore
	@ManyToMany
	private List<User> users;
	
	@JsonIgnore
	@ManyToOne(optional = false)
	private Organization organization;
	
	public void addUser(User us) {
		
		if(us.getOrganization().equals(this.organization)) {
			users.add(us);
		}
		
	}
	
}
