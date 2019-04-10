package devo.associative.manytomany;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "mtm_project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToMany(mappedBy = "projects")
    private Set<Employee> employees = new HashSet<>();

    public Project(){}

    public Project(Set<Employee> employees) {
        this.employees = employees;
    }

    public int getId() {
        return id;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }
}
