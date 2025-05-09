package org.example.rdcmmatricula.feing;

import org.example.rdcmmatricula.dato.Cliente;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="ms-cliente-service",path = "/clientes")
public interface ClienteFeing {
    @GetMapping("/{id}")
    public ResponseEntity<Cliente> listById(@PathVariable (required=true) Integer id);
}
