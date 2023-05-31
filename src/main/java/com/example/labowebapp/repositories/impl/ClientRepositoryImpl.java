package com.example.labowebapp.repositories.impl;

import com.example.labowebapp.models.entities.Client;
import com.example.labowebapp.repositories.ClientRepository;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class ClientRepositoryImpl extends BaseRepositoryImpl<Long,Client> implements ClientRepository,Serializable {
}
