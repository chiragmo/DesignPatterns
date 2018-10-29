package studentCoursesBackup.util;
import java.util.ArrayList;

   /**
    * This class is responsible for storing the prime numbers in arraylist
    */
public class Results implements StdoutDisplayInterface {
  ArrayList<Integer> store;

  public Results() {
   MyLogger.writeMessage("util.Results constructor called", MyLogger.DebugLevel.CONSTRUCTOR);
    this.store = new ArrayList<Integer>();
  }

    /**
    * void return type
    */
  public void addNumber(int num){
    MyLogger.writeMessage("Added a number to the datasctructure: "+num, MyLogger.DebugLevel.ADDTO);
    store.add(num);
  }

    /**
    * void return type
    */
 @Override
  public void writeSumToScreen() {
    MyLogger.writeMessage(store.toString(), MyLogger.DebugLevel.RESULTS);
    int sum = 0;
     // System.out.println("sum: "+store);
    for(int i =0; i<store.size(); i++) {
      sum = sum + store.get(i);
    }
    //MyLogger.DebugLevel = 0;
    MyLogger.writeMessage("sum of all the prime numbers is: "+sum, MyLogger.DebugLevel.OUTPUT);
    //System.out.println("The sum of all the prime numbers is: "+sum);
  }

    /**
    * String return type
    */
    @Override
  public String toString() {
    String show = "";
    for(int i =0; i<store.size();i++) {
      show = show + store.get(i)+ " ";
    }
    return show;
  }

}
