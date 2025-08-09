//Q2
package Assignmnet6_Exception_handling;



//File: OddChecker.java

public class Throw_exception {

 public static void checkOdd(int n) throws OddNumberException {
     if (n % 2 != 0) {
         throw new OddNumberException("Odd number: " + n);
     }
 }

 public static void main(String[] args) {
     int[] testNumbers = {2, 3, 10, 15, 20};

     for (int num : testNumbers) {
         try {
             checkOdd(num);
             System.out.println(num + " is even.");
         } catch (OddNumberException e) {
             System.out.println(e.getMessage());
         }
     }
 }
}



