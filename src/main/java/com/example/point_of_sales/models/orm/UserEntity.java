package com.example.point_of_sales.models.orm;

import com.example.point_of_sales.core.enums.Role;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Set;

@Entity
@Data
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @ElementCollection(fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    private Set<Role> roles;
}
