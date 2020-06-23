package com.ramanujamrs.busorama.bus.service;

import com.ramanujamrs.busorama.bus.model.Bus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface BusService {
    List<Bus> getBus();
    Page<Bus> getBusesByRoute(Long routeId, Pageable pageable);
}
