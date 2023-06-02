package com.example.labowebapp.services.impl;

import com.example.labowebapp.models.entities.Client;
import com.example.labowebapp.models.forms.ClientForm;
import com.example.labowebapp.repositories.ClientRepository;
import com.example.labowebapp.services.ClientService;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class ClientServiceImpl implements ClientService, Serializable {

    @Inject
    private  ClientRepository clientRepository;
    @Override
    public Client add(ClientForm clientForm) {
        return clientRepository.add(clientForm.toEntity());
    }

    @Override
    public Client getOne(Long id) {
        return null;
    }

    @Override
    public List<Client> getAll() {
        return null;
    }

    @Override
    public Client update(Long id, ClientForm a) {
        return null;
    }

    @Override
    public Client delete(Long id) {
        return null;
    }

    @Override
    public Client findByEmail(String email) {
        return null;
    }

}
