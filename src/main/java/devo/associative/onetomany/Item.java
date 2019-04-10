package devo.associative.onetomany;

import javax.persistence.*;

@Entity
@Table(name="OTM_ITEM")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="cart_id", nullable=false)
    private Cart cart;

    public Item() {}

    public Item(Cart cart) {
        this.cart = cart;
    }

    public int getId() {
        return id;
    }

    public Cart getCart() {
        return cart;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
