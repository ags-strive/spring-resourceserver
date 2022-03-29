package com.pluralsight.resourceserver.controller;

import com.pluralsight.resourceserver.data.TollData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TollController {
    private List<TollData> tollData;

    public TollController() {
        // in lieu of actual rest api call to real db
        tollData = new ArrayList<>();
        tollData.add(new TollData("900", "LJ4324KB4", "2022-01-01T00:00:00"));
        tollData.add(new TollData("901", "KJG65536B", "2022-01-01T00:00:00"));
        tollData.add(new TollData("902", "2135KJ34H", "2022-01-01T00:00:00"));
    }

    @RequestMapping("api/tolldata")
    public List<TollData> getTollData() {
        return tollData;
    }
}
