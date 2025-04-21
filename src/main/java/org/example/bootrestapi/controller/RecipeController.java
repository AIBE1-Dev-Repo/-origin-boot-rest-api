package org.example.bootrestapi.controller;

import org.example.bootrestapi.model.entity.Recipe;
import org.example.bootrestapi.service.RecipeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // Spring
@RequestMapping("/api/recipe") // Spring MVC
public class RecipeController {
    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping
    public List<Recipe> getAllRecipes() {
        // localhost:8080/api/recipe
        Recipe r = new Recipe();
        r.setName("커리");
        r.setDescription("맛있는 커리");
        recipeService.save(r);
        return recipeService.findAll();
    }
}
