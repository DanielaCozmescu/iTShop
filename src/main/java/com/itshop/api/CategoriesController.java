package com.itshop.api;
import com.itshop.entities.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "api/categories")
public class CategoriesController {

    @GetMapping()
    public List<Category> GetAll(){
        return new ArrayList<Category>();
    }

    @PostMapping(value = Category category){

    }
}

