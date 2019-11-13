package EVA.ProductDatabase.Exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class ProductsNotFoundException extends RuntimeException {
    public ProductsNotFoundException() {
        super();
    }

    public ProductsNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProductsNotFoundException(String message) {
        super(message);
    }

    public ProductsNotFoundException(Throwable cause) {
        super(cause);
    }
}