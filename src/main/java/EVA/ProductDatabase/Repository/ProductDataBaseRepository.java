package EVA.ProductDatabase.Repository;


import EVA.ProductDatabase.Model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface ProductDataBaseRepository extends JpaRepository<Products, Integer> {
    @Query(value = "SELECT * FROM products", nativeQuery = true)
    List<Products> getValue();

}


