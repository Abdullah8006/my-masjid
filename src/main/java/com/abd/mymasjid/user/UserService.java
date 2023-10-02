package com.abd.mymasjid.user;

import com.abd.mymasjid.location.LocationDto;
import com.abd.mymasjid.user.internal.User;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class UserService {

//    private final LocationService locationService;
    private final ApplicationEventPublisher events;

    public UserService(ApplicationEventPublisher applicationEventPublisher) {
//        this.locationService = locationService;
        this.events = applicationEventPublisher;
    }

    public void addUser() {
        LocationDto l = new LocationDto();
        l.setLatitude("22.09");
        l.setLongitude("33.99");

        events.publishEvent(l);
    }
}
