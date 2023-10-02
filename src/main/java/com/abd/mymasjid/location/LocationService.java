package com.abd.mymasjid.location;

import org.springframework.modulith.ApplicationModuleListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    @Async
    @ApplicationModuleListener
    public void getLocation(LocationDto dto) {
        String s = "Okhla is at:" + dto.getLatitude() + ", " + dto.getLongitude();
        System.out.println(s);
    }
}
