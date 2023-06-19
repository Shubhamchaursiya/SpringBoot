package com.employees.attendancesystems.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class LeaveType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int leave_type_id;
	@Enumerated(EnumType.STRING)
	private LeaveTypes leave_types;

}
