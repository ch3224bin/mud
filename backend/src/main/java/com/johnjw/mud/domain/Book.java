package com.johnjw.mud.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter @Getter
public class Book {
	
	@Id
	private Long id;
}
