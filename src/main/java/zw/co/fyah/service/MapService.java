package zw.co.fyah.service;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import zw.co.fyah.domain.*;
import zw.co.fyah.repository.*;

import java.util.*;
import java.util.stream.*;

@Service
public class MapService {
    private UserRepository userRepository;

    @Autowired
    public MapService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserLocationDTO> getAllUserLocation(){
        return ((List<User>) userRepository
                .findAll())
                .stream()
                .map(this :: convertToUserLocationDTO)
                .collect(Collectors.toList());
    }

    private UserLocationDTO convertToUserLocationDTO(User user){
        UserLocationDTO userLocationDTO = new UserLocationDTO();
        userLocationDTO.setUserId(user.getId());
        userLocationDTO.setLon(user.getLocation().getLon());
        userLocationDTO.setUsername(user.getUsername());
        userLocationDTO.setPlace(user.getLocation().getPlace());
        userLocationDTO.setLat(user.getLocation().getLat());
        return userLocationDTO;
    }
}
