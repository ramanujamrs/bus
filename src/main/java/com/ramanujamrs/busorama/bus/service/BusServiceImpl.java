package com.ramanujamrs.busorama.bus.service;

import com.ramanujamrs.busorama.bus.dao.BusRepository;
import com.ramanujamrs.busorama.bus.model.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("busService")
public class BusServiceImpl implements BusService
{
    @Autowired
    private BusRepository busRepository;

    @Override
    public List<Bus> getBus() {
        List<Bus> busList = busRepository.findAll();
        return busList;
    }
}
