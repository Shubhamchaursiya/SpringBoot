package com.employeemanagement.model;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Data
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long id;

	@NotBlank(message = "Password must not be blank")
	@Size(min = 5, message = "Password must be at least 5 characters long")
	private String password;

	@Column(name = "first_name")
	@NotBlank(message = "First name must not be blank")
	@Size(min = 3, message = "First name must be at least 3 characters long")
	private String firstName;
	
	@Column(name = "last_name")
	@NotBlank(message = "Last name must not be blank")
	@Size(min = 3, message = "Last name must be at least 3 characters long")
	private String lastName;
	
	@Column(name = "email")
	@NotBlank(message="Confirm Email must not be blank")
	@Email(message = "Please provide a valid confirm email address" )
	private String email;
}
