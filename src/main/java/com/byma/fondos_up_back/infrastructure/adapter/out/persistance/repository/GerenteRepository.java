package com.byma.fondos_up_back.infrastructure.adapter.out.persistance.repository;

import com.byma.fondos_up_back.infrastructure.adapter.out.persistance.entity.GerenteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GerenteRepository extends JpaRepository <GerenteEntity, Long> {
}
