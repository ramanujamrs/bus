package com.ramanujamrs.busorama.bus.dao;

import com.ramanujamrs.busorama.bus.model.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepository extends JpaRepository<Route, Long>
{

}
