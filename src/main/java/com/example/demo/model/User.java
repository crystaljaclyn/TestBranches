package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "account")
public class User {
	    
	    @Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
	    private long id;

	    private String username;

	    private String password;

	    private String email;

	    private String school;

}