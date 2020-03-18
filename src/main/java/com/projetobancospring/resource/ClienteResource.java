package com.projetobancospring.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.projetobancospring.repository.ClienteRepository;

@RestController
public class ClienteResource {

	@Autowired
	private ClienteRepository clienteRepository;

}
