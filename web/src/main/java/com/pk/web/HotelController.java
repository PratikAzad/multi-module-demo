package com.pk.web;


import com.pk.domain.Hotel;
import com.pk.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;


@RestController
public class HotelController {

    @Autowired
    private HotelRepository repository;

    //@RequestMapping(value = "/hotels", method = RequestMethod.GET)
    @GetMapping("/hotels")
    public List<Hotel> getHotels(){
        List<Hotel> hotels=repository.findAll();
        return hotels;
    }

    @GetMapping("/hotel/{id}")
    public Hotel getHotel(@PathParam("id") long id){
        Hotel hotel=repository.getOne(id);
        return hotel;
    }


}
