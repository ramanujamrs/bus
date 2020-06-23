package com.ramanujamrs.busorama.bus.service;

import com.ramanujamrs.busorama.bus.controller.BusController;
import com.ramanujamrs.busorama.bus.dao.BusRepository;
import com.ramanujamrs.busorama.bus.model.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service("busService")
public class BusServiceImpl implements BusService
{
    @Autowired
    private BusRepository busRepository;
    private static final Logger LOGGER=LoggerFactory.getLogger(BusServiceImpl.class);

    @Override
    public List<Bus> getBus()
    {
        LOGGER.info("Execution");
        List<Bus> busList = busRepository.findAll();
        return busList;
    }

    @Override
    public Page<Bus> getBusesByRoute(Long routeId, Pageable pageable)
    {
        LOGGER.info("Execution");
        Page<Bus> busList = busRepository.findBusesByRouteId(routeId, pageable);
        return busList;
    }


}
