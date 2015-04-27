package HW2;

public class Main {

    public static void main(String[] args){
        Person person1 = new Person();
        Person person2 = new Person();


        System.out.println ("person1=" + person1);
        System.out.println ("person2=" + person2);
        System.out.println ("is obj equals by == " + (person1==person2));
        System.out.println ("is obj equals by .equals " + (person1==person2));
    }
}