package com.caser.clientes;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "reservas")
public interface ClienteReservas {

}
