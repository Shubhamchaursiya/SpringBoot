package com.employees.attendancesystems.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AttendanceEntryType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int attendance_entry_type_id;
	@Enumerated(EnumType.STRING)
	private AttendanceEntryTypeName attendance_entry_type_name;
}
