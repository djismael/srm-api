package br.com.srm.reource;

import br.com.srm.event.RecursoCriadoEvent;
import br.com.srm.model.Cliente;
import br.com.srm.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteReource {


    private final ClienteService service;
    private final ApplicationEventPublisher publisher;

    @Autowired
    public ClienteReource(ClienteService service, ApplicationEventPublisher publisher) {
        this.service = service;
        this.publisher = publisher;
    }

    @PostMapping
    public ResponseEntity<Cliente> save(@Valid @RequestBody Cliente cliente, HttpServletResponse response) {
        Cliente newCliente = service.save(cliente);
        publisher.publishEvent(new RecursoCriadoEvent(this, response, newCliente.getCodigo()));
        return ResponseEntity.status(HttpStatus.CREATED).body(newCliente);
    }

    @GetMapping
    public List<Cliente> findAll() {
        return service.findAll();
    }
}
