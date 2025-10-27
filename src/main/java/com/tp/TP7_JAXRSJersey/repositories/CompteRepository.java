package com.tp.TP7_JAXRSJersey.repositories;

import com.tp.TP7_JAXRSJersey.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {
}
