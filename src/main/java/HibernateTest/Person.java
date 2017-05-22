package HibernateTest;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Person")
public class Person {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;

    public Person(int id, String name, String surname){
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public Person(){
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString(){
        return id + " " + name + " " + surname;
    }
}
