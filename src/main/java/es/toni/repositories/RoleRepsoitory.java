package es.toni.repositories;

import es.toni.domain.security.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepsoitory extends CrudRepository<Role, Integer> {
}
