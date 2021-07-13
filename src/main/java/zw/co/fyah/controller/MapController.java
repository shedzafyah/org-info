package zw.co.fyah.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;
import zw.co.fyah.domain.*;
import zw.co.fyah.service.*;

import java.util.*;

@RestController
public class MapController {
    private MapService mapService;

    @Autowired
    public MapController(MapService mapService) {
        this.mapService = mapService;
    }

    @GetMapping("/map")
    @ResponseBody
    public List<UserLocationDTO> getAllUserLocation(){
        List<UserLocationDTO> usersLocation = mapService.getAllUserLocation();
        return usersLocation;
    }
}
