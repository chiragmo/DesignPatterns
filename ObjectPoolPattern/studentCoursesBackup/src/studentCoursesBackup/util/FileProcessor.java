package studentCoursesBackup.util;
import java.io.File; 
import java.util.Scanner;

   /**
    * This class is responsible for file reading
    */
public class FileProcessor implements FileProcess {

   File file; Scanner sc;

   public FileProcessor(String absPath) {
    MyLogger.writeMessage("util.FileProcessor constructor called", MyLogger.DebugLevel.CONSTRUCTOR);
   this.file = null;
   this.sc = null;
    try {
     file = new File(absPath);
     sc = new Scanner(file); 
    }
    catch (Exception e) {
    //  System.out.println(e);
      MyLogger.writeMessage(e.toString(), MyLogger.DebugLevel.OUTPUT);
      System.exit(0);
    }
   }

    /**
    * int return type
    */
  @Override
  public synchronized int getLine() {  
   int num = 0;  
    if(sc.hasNextLine()) {
     String s = sc.nextLine().trim();
     if(s.length() == 0){
      return -1;
     }
     try {
     num = Integer.valueOf(s);
   }
   catch(Exception e) {
    //System.err.println(e);
    MyLogger.writeMessage(e.toString(), MyLogger.DebugLevel.OUTPUT);
    System.exit(0);
   }
   //  System.out.println("in getline(): "+num);
     return num;  
  }
  else return -2;
        
}

    /**
    * String return type
    */
  @Override
  public String toString() {
    return "";
  }

}

