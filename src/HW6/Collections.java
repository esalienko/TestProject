package HW6;

import java.util.HashSet;
import java.util.Set;


/**
 * Created by pc on 21.04.2015.
 */
public class Collections {

    public Set setArray () {
        Set<Integer> leftArray = new HashSet<>();
        leftArray.add(3);
        leftArray.add(5);
        leftArray.add(7);


        Set<Integer> rightArray = new HashSet<>();
        rightArray.add(4);
        rightArray.add(5);
        rightArray.add(8);


        Set<Integer> leftUnion = merge(leftArray, rightArray);

            return leftUnion;
        }

public Set <Integer> merge(Set <Integer> list1, Set <Integer> list2){
    Set<Integer> resultList = new HashSet<>();
    resultList.addAll(list1);
    resultList.addAll(list2);

    return resultList;
}


    public static void main(String args[]) {
        Collections col = new Collections();


            System.out.println(col.setArray());


        }

    }

