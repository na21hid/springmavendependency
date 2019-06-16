package com.project.app.repositorycrud;

import com.project.app.model.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface RepositoryTeacher extends CrudRepository<Teacher , Long> {
}
