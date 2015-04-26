package HW5;

/**
 * Created by pc on 09.04.2015.
 */
public class Person {

    private final String name;
    private final String phone;
    private final String email;

    private Person(Builder builder) {
        this.name = builder.name;
        this.phone = builder.phone;
        this.email = builder.email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        if (phone != null ? !phone.equals(person.phone) : person.phone != null) return false;
        return !(email != null ? !email.equals(person.email) : person.email != null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class Builder {

        private String name;
        private String phone;
        private String email;

        public Builder() {
        }

        public Builder(Person original) {
            this.name = original.name;
            this.phone = original.phone;
            this.email = original.email;

        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
