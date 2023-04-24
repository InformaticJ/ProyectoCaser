package com.caser.servicios;

import com.caser.dto.UsuarioDto;
import com.caser.modelos.Usuario;


import java.util.List;

public interface ServicioUsuarios {
    Usuario postUsuario(UsuarioDto usuarioDto);

}
