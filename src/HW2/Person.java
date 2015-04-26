package HW2;

/**
 * Created by pc on 01.04.2015.
 */
public class Person {

    //final String role;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

      //  return !(role != null ? !role.equals(person.role) : person.role != null);
return false;
    }

    @Override
    public int hashCode() {
       // return role != null ? role.hashCode() : 0;
        return 0;
    }
}

