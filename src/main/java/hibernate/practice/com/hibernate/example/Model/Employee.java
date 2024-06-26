package hibernate.practice.com.hibernate.example.Model;


import jakarta.persistence.*;

// @Entity annotation defines that a
// class can be mapped to a table
@Entity
@Table(name="Employee1")
public class Employee {

    // @ID This annotation specifies
    // the primary key of the entity.
    @Id

    // @GeneratedValue This annotation
    // is used to specify the primary
    // key generation strategy to use
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="name")
    private String name;
    private String city;

    public Employee() {
        super();
    }

    public Employee( String name, String city) {
        super();

        this.name = name;
        this.city = city;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }




}

