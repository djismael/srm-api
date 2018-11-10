package br.com.srm.service;

import br.com.srm.model.Cliente;

import java.util.List;

public interface ClienteService {

    Cliente save(Cliente entity);

    List<Cliente> findAll();
}
