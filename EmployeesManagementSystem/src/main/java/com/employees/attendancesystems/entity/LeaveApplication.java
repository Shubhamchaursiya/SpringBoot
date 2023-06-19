package com.employees.attendancesystems.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
@Getter
@Setter
public class LeaveApplication {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int leave_id;

	@NotNull(message = "Leave start date is required")
	private Date leave_start_date;

	@NotNull(message = "Leave end date is required")
	private Date leave_end_date;

	@NotBlank(message = "Leave reason is required")
	private String leave_reason;

	@NotBlank(message = "Approved by is required")
	private String approvedBy;

	@NotNull(message = "Leave created date is required")
	private Date leave_created_at;

	@Enumerated(EnumType.STRING)
	private LeaveStartPeriod leave_start_period;

	@Enumerated(EnumType.STRING)
	private LeaveEndPeriod leave_end_period;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "leave_type_id")
	private LeaveType leaveType;

}
