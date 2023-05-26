package com.example.labowebapp.repositories;

import java.util.List;
import java.util.Optional;

public interface BaseRepository<Tkey,TEntity> {

TEntity add(TEntity entity);

Optional<TEntity> getOne(Tkey id);

List<TEntity> getall();

TEntity update (TEntity entity);

TEntity delete(Tkey id);
}
