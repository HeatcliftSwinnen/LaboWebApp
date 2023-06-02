package com.example.labowebapp.repositories.impl;

import com.example.labowebapp.repositories.BaseRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;
import java.util.Optional;

public class BaseRepositoryImpl<TKey,TEntity> implements BaseRepository<TKey,TEntity> {

    protected EntityManagerFactory emf;
    protected EntityManager em;

    public BaseRepositoryImpl() {
        this.emf = Persistence.createEntityManagerFactory("webapp");
        this.em = emf.createEntityManager();
    }

    @Override
    public TEntity add(TEntity entity) {
       em.getTransaction().begin();
       em.persist(entity);
       em.getTransaction().commit();
       return entity;
    }

    @Override
    public Optional<TEntity> getOne(TKey id) {
        return Optional.empty();
    }

    @Override
    public List<TEntity> getall() {
        return null;
    }

    @Override
    public TEntity update(TEntity tEntity) {
        return null;
    }

    @Override
    public TEntity delete(TKey id) {
        return null;
    }

}
