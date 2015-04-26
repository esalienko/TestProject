package HW5;

public class Main {

    public static void main(String[] args){
        Person person1 = new Person.Builder()
                .name("Jack")
                .phone("111-111")
                .email("test@test.com")
                .build();

        Person person2 = new Person.Builder()
                .name("John")
                .phone("222-222")
                .email("test2@test.com")
                .build();


        System.out.println ("person1=" + person1);
        System.out.println ("person2=" + person2);
        System.out.println ("is obj equals by == " + (person1==person2));
        System.out.println ("is obj equals by .equals " + (person1==person2));
    }
}