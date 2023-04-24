package com.caser.servicios.Impl;

import com.caser.dto.UsuarioDto;
import com.caser.modelos.Usuario;
import com.caser.repositorios.RepositorioUsuario;
import com.caser.servicios.ServicioUsuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioUsuariosImpl implements ServicioUsuarios {
    @Autowired
    RepositorioUsuario repositorioUsuario;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public Usuario postUsuario(UsuarioDto usuarioDto) {
        return null;
    }
}
