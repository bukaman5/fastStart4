package com.ski.skiresort.domain.entity;

import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@Entity
@Table(name = "coach")
public class Coach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "category")
    private String category;
    @Column(name = "date_of_birth")
    private String dateOfBirth;
    @Column(name = "gender")
    private String gender;
    @Column(name = "photo")
    private String photo;
}
