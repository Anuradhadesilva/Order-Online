package com.anuradha.Online.Food.Ordering.repository;

import com.anuradha.Online.Food.Ordering.model.IngredientsItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IngredientItemRepository extends JpaRepository<IngredientsItem,Long>{
    List<IngredientsItem> findByRestaurantId(Long id);
}
