package com.employees.attendancesystems.entity;

import java.time.Year;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
public class LeaveStatement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int leave_statement_id;

	@PositiveOrZero(message = "CL opening balance must be a positive or zero value")
	private int cl_opening_balance;

	@PositiveOrZero(message = "CL closing balance must be a positive or zero value")
	private int cl_closing_balance;

	@PositiveOrZero(message = "ML opening balance must be a positive or zero value")
	private int ml_opening_balance;

	@PositiveOrZero(message = "ML closing balance must be a positive or zero value")
	private int ml_closing_balance;

	@PositiveOrZero(message = "CL used must be a positive or zero value")
	private int cl_used;

	@PositiveOrZero(message = "ML used must be a positive or zero value")
	private int ml_used;

	@Enumerated(EnumType.STRING)
	private Months month;

	@NotNull(message = "Year is required")
	private Year year;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

}
