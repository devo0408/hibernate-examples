package devo.associative.onetomany;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="OTM_CART")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(mappedBy="cart")
    private Set<Item> items;

    public Cart(){}

    public Cart(Set<Item> items) {
        this.items = items;
    }

    public int getId() {
        return id;
    }

    public Set<Item> getItems() {
        return items;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }
}
