package Services;

public class person {
    private String name;
    private String LastName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", LastName='" + LastName + '\'' +
                '}';
    }
}
