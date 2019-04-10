package devo.associative.manytomany;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "mtm_employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "mtm_project_mtm_project",
            joinColumns = { @JoinColumn(name = "employee_id") },
            inverseJoinColumns = { @JoinColumn(name = "project_id") }
    )
    Set<Project> projects = new HashSet<>();

    public Employee(){}

    public Employee(Set<Project> projects) {
        this.projects = projects;
    }

    public int getId() {
        return id;
    }

    public Set<Project> getProjects() {
        return projects;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }
}
