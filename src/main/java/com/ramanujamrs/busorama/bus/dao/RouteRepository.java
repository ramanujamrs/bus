package com.ramanujamrs.busorama.bus.dao;

import com.ramanujamrs.busorama.bus.model.Bus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RouteRepository extends JpaRepository<Bus, Long>
{

}
