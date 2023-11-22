package Week4._03_Wednesday;

import java.util.ArrayList;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
//        method1
//        2D Array
//        int[][] array = new int[6][4];
//        System.out.println(array[0][0]);
//        array[0][0] = 15;
//        System.out.println(array[0][0]);


//        Method2
//        int[][] array = {{4521,7232,2376},{6253,2365,3276}, {2732, 256737,763}};
//        System.out.println(array[2][0]);

//        Method3
//        int[][] array = {
//                {4521,7232,2376,7645},
//                {6253,2365,3276},
//                {2732, 256737,763,78465,8478}
//        };
//        System.out.println(array[2][4]);

//        Method4
//        int[][] array = new int[3][];
//        array[0] = new int[]{736547, 2837};
//        array[1] = new int[]{354,7263,465};
//        array[2] = new int[]{7634};

//        ArrayList vs Array
//        size - Arrays are fixed size, whereas ArrayList is flexible size
//        data type - Array can have primitive and Class type objects, ArrayList can only have Class type objects
//        Functionality - ArrayList is more flexible in function

//        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(6534,37463));
//        arrayList.add(654);
//        System.out.println(arrayList);
        ArrayList<ArrayList<Integer>> anotherArrayList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(425,326,7643,384));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(634,846,12,43));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(45,7346));
        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(76,23,12));
        anotherArrayList.add(list1);
        anotherArrayList.add(list2);
        anotherArrayList.add(list3);
        anotherArrayList.add(list4);
//        System.out.println(anotherArrayList);
//        System.out.println(anotherArrayList.get(0).get(1));
//        anotherArrayList.get(1).add(56);
////        System.out.println(anotherArrayList.get(1));
//        anotherArrayList.get(2).add(1,46);
////        System.out.println(anotherArrayList.get(2));
//        anotherArrayList.get(1).set(0,456);
//        System.out.println(anotherArrayList.get(1));
int counter = 0;
        for (int i = 0; i < anotherArrayList.size(); i++) {
            for (int j = 0; j < anotherArrayList.get(i).size(); j++) {
                if (anotherArrayList.get(i).get(j)%2==1){
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
