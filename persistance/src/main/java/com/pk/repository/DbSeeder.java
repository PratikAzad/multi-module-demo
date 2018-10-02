package com.pk.repository;

import com.pk.domain.Hotel;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class DbSeeder implements CommandLineRunner {

    //If we implement CommandLineRunner this class will automatically executed when
    //Spring-Boot-Application will start.

    HotelRepository repository;

    public DbSeeder(HotelRepository repository){
        this.repository=repository;
    }

    @Override
    public void run(String... args) throws Exception {
        Hotel tajHotel=new Hotel("Taj hotel",5,true);
        Hotel chanakya=new Hotel("Chanakya",5,true);
        Hotel orchid=new Hotel("Orchid",5,true);

        this.repository.save(tajHotel);
        this.repository.save(chanakya);
        this.repository.save(orchid);
    }
}
