package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

	@Entity
	@Table(name = "subject")
	public class Subjects {
	   
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	    
		@NotNull
	    @Column(unique = true)
	    private String subject;

	    @NotNull
	    private String stafflink;

	    @NotNull
	    private String studentlink;
	    
	    public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}

		public String getSubject() {
			return subject;
		}

		public void setSubject(String subject) {
			this.subject = subject;
		}

		public String getStafflink() {
			return stafflink;
		}

		public void setStafflink(String stafflink) {
			this.stafflink = stafflink;
		}

		public String getStudentlink() {
			return studentlink;
		}

		public void setStudentlink(String studentlink) {
			this.studentlink = studentlink;
		}
	
}
