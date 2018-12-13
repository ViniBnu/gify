package com.gify.gify;

import com.gify.gify.model.Gify;
import org.springframework.data.repository.CrudRepository;

public interface GifyRepository extends CrudRepository<Gify, Long> {
}
