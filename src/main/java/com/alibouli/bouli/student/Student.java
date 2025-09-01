package com.alibouli.bouli.student;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public final class Student {
	private String fnameString;
	private String lnameString;
	private String email;
	private LocalDate dob;
	private int age;
}
