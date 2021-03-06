package devo.associative.manytoone;

import javax.persistence.*;

@Entity
@Table(name = "MTO_DEVELOPERS")
public class Developer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    private String name;

    @ManyToOne
    @JoinColumn(name ="fk_сompany_id", nullable = false)
    private Company company;


    public Developer() {
    }

    public Developer(String name, Company company) {
        this.name = name;
        this.company = company;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Developer:\n" +
                "id: " + id +
                "\nFirst Name: " + name + "\n" +
                "Company: " + company;
    }


}
