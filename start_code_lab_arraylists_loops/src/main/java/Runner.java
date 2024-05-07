import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list
        scottishIslands.add("Coll");
//        2. Add "Tiree" to the start of the list
        scottishIslands.add(0, "Tiree");
//        3. Add "Islay" after "Jura" and before "Mull"
        scottishIslands.add(2, "Islay");
//        4. Print out the index position of "Skye"
        System.out.println("The index position of Skye is " + scottishIslands.indexOf("Skye") + ".");
//        5. Remove "Tresco" from the list by name
        scottishIslands.remove("Tresco");
//        6. Remove "Arran" from the list by index
        scottishIslands.remove(5);
//        7. Print the number of islands in your arraylist
        System.out.println("There are " + scottishIslands.size() + " islands in the ArrayList.");
//        8. Sort the list alphabetically
        Collections.sort(scottishIslands);
//        9. Print out all the islands using a for loop
        System.out.println("-----Enhanced:-----");
        for(String island: scottishIslands){
            System.out.println(island);
        }

        System.out.println("-----Classic:-----");
        for(int i = 0; i < scottishIslands.size(); i++){
            System.out.println(scottishIslands.get(i));
        }

        System.out.println(scottishIslands);

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
        System.out.println("-----Even Integers------");
        for(int number: numbers){
            if( number%2 == 0){
                System.out.println(number);
            }
        }
//        2. Print the difference between the largest and smallest value
        System.out.println("-----Difference between largest and smallest values-----");
        int smallestNumber = Collections.min(numbers);
        int largestNumber = Collections.max(numbers);
        int differenceOfSmallestAndLargestNum = largestNumber - smallestNumber;
        System.out.println("The difference between the smallest and largest values is: "+ differenceOfSmallestAndLargestNum + ".");

//        3. Print True if the list contains a 1 next to a 1 somewhere.
        System.out.println("----- 1 next to a 1? -----");

        for(int i = 0; i < numbers.size()-1; i++){
            if(numbers.get(i) == 1 && numbers.get(i+1) ==1 ){
                System.out.println(true);
            }
        }

//        4. Print the sum of the numbers,
        System.out.println("-----Sum of numbers-----");

        int sum = 0;
        for(int number: numbers){
            sum += number;
        }
        System.out.println("The sum of numbers is "+ sum);
//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [2, 7, 13, 2] would have sum of 9.
        System.out.println("-----Sum of numbers except...-----");

        int sumexcept = 0;
        boolean isThirteen = false;
        for(int i = 0; i < numbers.size(); i++){
            if(numbers.get(i) == 13){
                isThirteen = true;
                continue;
            } else if(isThirteen == true){
                isThirteen = false;
                continue;
            } else{
                sumexcept += numbers.get(i);
            }
        }
        System.out.println("The sum of numbers except 13 and the number following is "+ sumexcept);

    }

}
