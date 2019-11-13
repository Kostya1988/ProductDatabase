package EVA.ProductDatabase.Service;

import EVA.ProductDatabase.Model.Products;
import EVA.ProductDatabase.Repository.ProductDataBaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductDataBaseRepository repository;

    @Override
    public List<Products> getValue() {
        return repository.getValue();
    }

}
