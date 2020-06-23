/*
 * @author Ramanujam Srinivasan
 * @created_on 06-20-2020
 */

package com.ramanujamrs.busorama.bus.controller;

import com.ramanujamrs.busorama.bus.model.Bus;
import com.ramanujamrs.busorama.bus.service.BusService;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping(value = "/api/v1")
public class BusController
{
    @Resource(name="busService")
    private BusService busService;

    private static final Logger LOGGER=LoggerFactory.getLogger(BusController.class);

    @GetMapping("bus/all")
    public List<Bus> getBus()
    {
        LOGGER.info("Execution of Simple log statement with inputs");
        List<Bus> busList = new ArrayList<>();
        busList = busService.getBus();
        return busList;
    }

    @GetMapping("/routes/{routeId}/bus")
    public Page<Bus> getBusesByRoute(@PathVariable Long routeId, Pageable pageable)
    {
        LOGGER.info("GetBusesByRoute");
        Page<Bus> busList = busService.getBusesByRoute(routeId, pageable);
        return busList;
    }
}
