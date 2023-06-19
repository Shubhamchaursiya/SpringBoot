package com.employees.attendancesystems.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ProfileDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int emp_detail_id;

	@NotNull(message = "Employee number is required")
	private Long emp_no;

	@NotNull(message = "Date of birth is required")
	private Date dob;

	@NotBlank(message = "Employee qualification is required")
	private String emp_qualification;

	@NotBlank(message = "Employee mobile number is required")
	private String emp_mobile;

	@NotBlank(message = "Address is required")
	private String address;

	@NotBlank(message = "State is required")
	private String state;

	@NotBlank(message = "Gender is required")
	private String gender;

	@NotNull(message = "Years of experience is required")
	private int experiance_in_year;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "technology_id")
	private Technology technology;

}
