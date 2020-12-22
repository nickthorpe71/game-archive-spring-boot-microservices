package com.los.gamecatalogservice.resources;

import com.los.gamecatalogservice.models.CatalogueItem;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class GameCatalogueResource {

    public List<CatalogueItem> getCatalogue(String userId){

        return Collections.singletonList(
                new CatalogueItem("The Forest", "Test", 4)
        );
    }
}
