package com.caser.controladores;

import com.caser.servicios.ServicioUsuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/usuarios")
public class ControladorUsuario {
    @Autowired
    ServicioUsuarios servicioUsuarios;

}
