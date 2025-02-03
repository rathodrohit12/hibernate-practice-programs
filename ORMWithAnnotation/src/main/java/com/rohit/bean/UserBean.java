package com.rohit.bean;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity(name = "emp765")
public class UserBean {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name", length = 100, nullable = false)
	private String  name;
	
	@Column(name = "email", length = 100, unique = true)
	private String email;
	
	private String mobile;
	
	@Column(name = "pass", length = 100, nullable = false)
	private String pass;
	
	@Transient
	private String state;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Basic(optional = false)
	@Column( insertable = false, updatable = false,columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date timeentry;

}

	
	
	
	
	

