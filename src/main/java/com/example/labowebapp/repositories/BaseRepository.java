package com.example.labowebapp.repositories;

import java.util.List;
import java.util.Optional;

public interface BaseRepository<TKey,TEntity> {

TEntity add(TEntity entity);

Optional<TEntity> getOne(TKey id);

List<TEntity> getall();

TEntity update (TEntity entity);

TEntity delete(TKey id);

}

