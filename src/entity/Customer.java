package entity;
import javax.persistence.Entity;
import javax.persistence.Id;

/*
@Entity(name = "customer_details")
*/

@Entity
public class Customer {
    @Id
    private String id;
  /*@Column(name = "buruwa")*/
    private String name;
    private String addres;

    public Customer() {}

    public Customer(String id, String name, String address, double salary) {
        this.setId(id);
        this.setName(name);
        this.setAddres(address);

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return getAddres();
    }

    public void setAddress(String address) {
        this.setAddres(address);
    }


    @Override
    public String toString() {
        return "Customer{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", address='" + getAddres() + '\'' +
                '}';
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }




}
