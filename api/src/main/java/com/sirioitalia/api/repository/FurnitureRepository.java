package com.sirioitalia.api.repository;

import com.sirioitalia.api.model.Furniture;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FurnitureRepository extends CrudRepository<Furniture, Long> {
}
