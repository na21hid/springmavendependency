package com.project.app.repositorycrud;

import com.project.app.model.Programer;
import org.springframework.data.repository.CrudRepository;

public interface RepositoryProgrammer extends CrudRepository<Programer , Long> {
}
