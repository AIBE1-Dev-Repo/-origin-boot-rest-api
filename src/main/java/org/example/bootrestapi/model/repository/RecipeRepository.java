package org.example.bootrestapi.model.repository;

import org.example.bootrestapi.model.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Spring
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
