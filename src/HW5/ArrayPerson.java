package HW5;

import HW5.Person;

import java.util.Arrays;

/**
 * Created by pc on 09.04.2015.
 */
public class ArrayPerson {
    public Person[] leftJoin(Person[] leftArray, Person[] rightArray) {

        Person[] leftJoin = Arrays.copyOf(leftArray, leftArray.length + rightArray.length);

//        for (int i = 0; i < leftArray.length; i++) {
//            for (int j = 0; j < rightArray.length; j++) {
//                if (leftJoin[i] == rightArray[j]) {
//                    leftJoin[leftArray.length + i] = rightArray[j];
//                }
//            }
//        }
        return leftJoin;
    }


    public static void main(String args[]) {
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

        Person person3 = new Person.Builder()
                .name("Jack")
                .phone("111-111")
                .email("test@test.com")
                .build();

        Person person4 = new Person.Builder()
                .name("Den")
                .phone("333-222")
                .email("test5@test.com")
                .build();


        Person[] leftArray = new Person[]{person1, person2};
        Person[] rightArray = new Person[]{person3, person4};



        ArrayPerson array = new ArrayPerson();
        Person[] a = array.leftJoin(leftArray, rightArray);

        System.out.println(Arrays.toString(a));
       // System.out.println(Arrays.toString(res));


    }

}