package br.com.coletafacil.ColetaFacilApi.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id",
            nullable = false,
            length = 50)
    private Long userId;

    @Email
    @Column(name = "user_email", unique = true,
            nullable = false,
            length = 45)
    private String userEmail;

    @NotBlank
    @Column(name = "user_password",
            nullable = false,
            length = 64)
    private String userPassword;

    @NotBlank
    @Column(name = "username",
            nullable = false,
            length = 20)
    private String username;
}
