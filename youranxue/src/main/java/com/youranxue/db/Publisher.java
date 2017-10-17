package com.youranxue.db;

import lombok.Data;
import org.springframework.security.crypto.password.PasswordEncoder;

@Data
public class Publisher {

	private String publisher_id;

	private String publisher_name;

	private String book_id;



}
