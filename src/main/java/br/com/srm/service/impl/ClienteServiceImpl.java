package br.com.srm.service.impl;

import br.com.srm.model.Cliente;
import br.com.srm.repository.ClienteRespository;
import br.com.srm.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ClienteService")
public class ClienteServiceImpl implements ClienteService {


    private final ClienteRespository repository;

    @Autowired
    public ClienteServiceImpl(ClienteRespository repository) {
        this.repository = repository;
    }

    @Override
    public Cliente save(Cliente entity) {
        return repository.save(entity);
    }

    @Override
    public List<Cliente> findAll() {

        List<Cliente> clientes = repository.findAll();
        putTaxa(clientes);

        return clientes;
    }

    private void putTaxa(List<Cliente> clientes) {
        for (Cliente cliente : clientes) {
            cliente.setTaxa();
        }
    }
}