package com.employees.attendancesystems.entity;

import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Attendance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int attendance_id;

	@NotNull(message = "Attendance date is required")
	private Date attendance_date;

	@NotBlank(message = "Attendance status is required")
	private String attendance_status;

	private Time attendance_in_time;

	private Time attendace_out_time;

	private String attendance_reason;

	@NotNull(message = "Created at is required")
	private Date created_at;

	@NotBlank(message = "Approved by is required")
	private String approvedBy;

	@NotBlank(message = "Attendance source is required")
	private String attendance_source;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "attendance_entry_type_id")
	private AttendanceEntryType attendanceEntryType;
}
