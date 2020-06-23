package com.ramanujamrs.busorama.bus.dao;

import com.ramanujamrs.busorama.bus.model.Bus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BusRepository extends JpaRepository<Bus, Long>
{
    Page<Bus> findBusesByRouteId(Long routeId, Pageable pageable);
}
