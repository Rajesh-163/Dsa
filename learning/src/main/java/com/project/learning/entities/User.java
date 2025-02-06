package com.project.learning.entities;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "user")
@Data
public class User {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "mobile")
    private String mobile;
}
