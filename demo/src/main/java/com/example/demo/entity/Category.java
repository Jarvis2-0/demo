package com.example.demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<Product> products;

	public String getCatName() {
		return name;
	}

	public void setCatName(String name) {
		this.name = name;
	}

    // getters and setters
}
