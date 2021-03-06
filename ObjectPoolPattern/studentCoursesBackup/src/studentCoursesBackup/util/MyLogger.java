
// FIXME: replace XYZ with the package name for the assignment
package studentCoursesBackup.util;

public class MyLogger{

    // FIXME: Add more enum values as needed for the assignment
    public static enum DebugLevel { OUTPUT, RESULTS, ADDTO, THREAD, CONSTRUCTOR
                                   };

    private static DebugLevel debugLevel;


    // FIXME: Add switch cases for all the levels
    public static void setDebugValue (int levelIn) {
	switch (levelIn) {
    case 0: debugLevel = DebugLevel.OUTPUT; break;    
	case 1: debugLevel = DebugLevel.RESULTS; break;
    case 2: debugLevel = DebugLevel.ADDTO; break;    
    case 3: debugLevel = DebugLevel.THREAD; break;	
    case 4: debugLevel = DebugLevel.CONSTRUCTOR; break; 
	}
    }
/*
    public static void setDebugValue (DebugLevel levelIn) {
	debugLevel = levelIn;
    }
*/
    public static void writeMessage (String message  ,
                                     DebugLevel levelIn ) {
	if (levelIn == debugLevel)
	    System.out.println(message);
    }

    public String toString() {
	return "The debug level has been set to the following " + debugLevel;
    }
}
