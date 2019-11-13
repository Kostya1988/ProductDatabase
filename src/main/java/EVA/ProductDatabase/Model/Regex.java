package EVA.ProductDatabase.Model;

import EVA.ProductDatabase.Exception.ProductsNotFoundException;
import EVA.ProductDatabase.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class Regex {
    @Autowired
    ProductService service;

    public List<Products> checkRegex(String nameFilter) {
        List<Products> products = service.getValue();
        if (products.isEmpty()) {
            throw new ProductsNotFoundException("Check not found");
        }
        Pattern pattern = Pattern.compile(nameFilter, Pattern.CASE_INSENSITIVE);
        List<Products> resultContactList = new ArrayList<>();
        for (Products pr : products) {
            Matcher matcher = pattern.matcher(pr.getName());
            if (!matcher.matches()) {
                resultContactList.add(pr);
            }
        }
        return resultContactList;
    }
}
