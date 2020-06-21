/*
 * @author Ramanujam Srinivasan
 * @created_on 06-20-2020
 */

package com.ramanujamrs.busorama.bus.controller;

import com.ramanujamrs.busorama.bus.model.Bus;
import com.ramanujamrs.busorama.bus.service.BusService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/bus")
public class BusController
{
    @Resource(name="busService")
    private BusService busService;

    @GetMapping("/all")
    public List<Bus> getBus()
    {
        List<Bus> busList = new ArrayList<>();
        busList = busService.getBus();
        return busList;
    }
}
