package com.los.ratingsdataservice.resources;

import com.los.ratingsdataservice.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class RatingsResource {

    @RequestMapping("/{gameId}")
    public Rating getRating(@PathVariable("gameId") String gameId){
        return new Rating(gameId, 4);
    }
}
