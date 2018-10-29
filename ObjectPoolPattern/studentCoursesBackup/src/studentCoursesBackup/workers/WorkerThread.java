package studentCoursesBackup.workers;
import studentCoursesBackup.util.IsPrime;
import studentCoursesBackup.util.FileProcessor;
import studentCoursesBackup.util.Results;
import studentCoursesBackup.util.MyLogger;
import studentCoursesBackup.util.StdoutDisplayInterface;
import java.lang.Thread;
import java.util.ArrayList;

   /**
    * This class is responsible working on the threads
    */
public class WorkerThread implements Runnable {
	IsPrime prime; FileProcessor file; StdoutDisplayInterface res;


	WorkerThread(FileProcessor file, StdoutDisplayInterface res, IsPrime prime) {
		 MyLogger.writeMessage("workers.WorkerThread constructor called", MyLogger.DebugLevel.CONSTRUCTOR);
		this.prime = prime;
		this.file = file;
		this.res =  res;
	}

   /**
    * void return type
    */
	public void run() {
	 MyLogger.writeMessage("run() called", MyLogger.DebugLevel.THREAD);
		while(true) {
		int num = file.getLine();
		//System.out.println("num "+Thread.currentThread().getName());
		if(num == -1) {
			continue;
		}
		if(num == -2) {
			return;
		}
		boolean answer = prime.check(num);
		if(answer == true) {
			res.add();
		}
	}

	}

   	/**
    * String return type
    */
   @Override
  public String toString() {
    return "";
  }

}
