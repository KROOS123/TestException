package testtreemap;

public class Customer {
    private int id;
    private String name;
    private int accountNumber;

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", accountNumber=" + accountNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (!(o instanceof Customer)) {return false;}

        Customer customer = (Customer) o;

        if (getId() != customer.getId()){ return false;}
        if (getAccountNumber() != customer.getAccountNumber()){ return false;}
        return getName().equals(customer.getName());
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getAccountNumber();
        return result;
    }

    public Customer() {
        super();
    }

    public Customer(int id, String name, int accountNumber) {
        this.id = id;
        this.name = name;
        this.accountNumber = accountNumber;
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

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}
