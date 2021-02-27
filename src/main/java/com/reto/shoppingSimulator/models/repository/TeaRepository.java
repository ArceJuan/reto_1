package com.reto.shoppingSimulator.models.repository;

import com.reto.shoppingSimulator.models.entity.Tea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeaRepository extends JpaRepository<Tea, Long> {
}
