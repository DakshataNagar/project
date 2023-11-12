package project.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.taskmanager.model.Role;

@Repository
public interface RoleRepository extends JpaRepository< Role, Integer> {

    Role findByRole(String user);
}
