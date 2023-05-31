package com.example.labowebapp.services;

import com.example.labowebapp.models.entities.Client;
import com.example.labowebapp.models.forms.ClientForm;

import java.util.List;

public interface ClientService {
    Client add(ClientForm clientForm);

    Client getOne(Long id);

    List<Client> getAll();

    Client update(Long id, ClientForm a);

    Client delete(Long id);
}
