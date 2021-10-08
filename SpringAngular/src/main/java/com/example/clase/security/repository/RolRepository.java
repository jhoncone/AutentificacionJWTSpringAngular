package com.example.clase.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.clase.security.entity.Rol;
import com.example.clase.security.enums.RolNombre;
@Repository
public interface RolRepository extends JpaRepository<Rol,Integer>{

	Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
