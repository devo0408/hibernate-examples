package devo.associative.onetoone;


import javax.persistence.*;

@Entity
@Table(name = "OTO_CONTRACT")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    private String email;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "manager_id")
    private Manager manager;

    public Contact() {
    }

    public Contact(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager developer) {
        this.manager = developer;
    }

    @Override
    public String toString() {
        return "email: " + email +
                "manager:\n" + manager;
    }

}
