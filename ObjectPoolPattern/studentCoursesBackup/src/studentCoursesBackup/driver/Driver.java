package studentCoursesBackup.driver;
import studentCoursesBackup.util.IsPrime;
import studentCoursesBackup.util.FileProcessor;
import studentCoursesBackup.util.Results;
import studentCoursesBackup.util.StdoutDisplayInterface;
import studentCoursesBackup.util.MyLogger;
import studentCoursesBackup.workers.CreateWorkers;
import java.io.File; 
/**
 * @author Chirag M. Onkarappa
 *
 */
public class Driver {

	/**
    * void return type on the main
    */	
	public static void main(String[] args) {

		/*
		 * As the build.xml specifies the arguments as argX, in case the
		 * argument value is not given java takes the default value specsified in
		 * build.xml. To avoid that, below condition is used
		 */

    MyLogger.setDebugValue(Integer.valueOf(args[2]));

		if (args.length != 3 || args[0].equals("${arg0}") || args[1].equals("${arg1}") || args[2].equals("${arg2}")) {
      MyLogger.writeMessage("Error: Incorrect number of arguments. Program accepts 3 argumnets.", MyLogger.DebugLevel.OUTPUT);
			//System.err.println("Error: Incorrect number of arguments. Program accepts 3 argumnets.");

			System.exit(0);
		}		

    if(!(Integer.valueOf(args[1]) >=1 && Integer.valueOf(args[1]) <=5)) {
       MyLogger.writeMessage("Error: Incorrect number of NUM_THREADS", MyLogger.DebugLevel.OUTPUT);
     // System.err.println("Error: Incorrect number of NUM_THREADS.");
      System.exit(0);
     }
     if(!(Integer.valueOf(args[2]) >=0 && Integer.valueOf(args[2]) <=4)) {
       MyLogger.writeMessage("Error: Incorrect value of DEBUG_VALUE", MyLogger.DebugLevel.OUTPUT);
     // System.err.println("Error: Incorrect number of DEBUG_VALUE");
      System.exit(0);
     }

        FileProcessor file = new FileProcessor(args[0]);
        StdoutDisplayInterface results = new Results();
        IsPrime prime = new IsPrime();

        CreateWorkers obj = new CreateWorkers(prime, file, results);
        obj.startWorkers(Integer.valueOf(args[1]));
        results.writeSumToScreen();
	}
}
