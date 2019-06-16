package com.project.app.repositorycrud;

import com.project.app.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface RepositoryStudent extends CrudRepository<Student , Long> {
}
