package com.caser.modelos;

import lombok.*;
import javax.persistence.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "usuarios")
@Entity
@Getter
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Setter
    @Column(name = "nombre_usuario")
    private String nombreUsuario;
    @Setter
    @Column(name = "email")
    private String email;
    @Setter
    @Column(name = "contrasenia")
    private String contrasenia;

}