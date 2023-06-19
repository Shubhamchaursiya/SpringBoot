package com.employees.attendancesystems.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;
	@NotNull
	private String name;
	@Email
	private String email;
	@NotNull
	private String user_activity_status;
	@ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

	@ManyToOne
	@JoinColumn(name = "manager_id")
	private User manager;

	@OneToMany(mappedBy = "manager")
	private List<User> subordinates;

}
