package EVA.ProductDatabase.Model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @NotNull
    @Size(max=100)
    @Column(name = "name")
    private String name;
    @NotNull
    @Size(max=1000)
    @Column(name = "description")
    private String description;

}
