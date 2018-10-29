package studentCoursesBackup.workers;
import studentCoursesBackup.util.IsPrime;
import studentCoursesBackup.util.FileProcessor;
import studentCoursesBackup.util.Results;
import studentCoursesBackup.workers.WorkerThread;
import studentCoursesBackup.util.StdoutDisplayInterface;
import studentCoursesBackup.util.MyLogger;

import java.util.ArrayList;

   /**
    * This class is responsible for maintaining the threads
    */
public class CreateWorkers implements CreationOfThreads {
	IsPrime prime; FileProcessor file; StdoutDisplayInterface res;

	public CreateWorkers(IsPrime prime, FileProcessor file, StdoutDisplayInterface res) {
		MyLogger.writeMessage("workers.CreateWorkers constructor called", MyLogger.DebugLevel.CONSTRUCTOR);
		this.prime = prime;
		this.file = file;
		this.res = res;
	}

	/**
    * void return type
    */
	public void startWorkers(int numThreads) {
		ArrayList<Thread> arli = new ArrayList<Thread>();
		ObjectPool pool = new ObjectPool(prime,file, res, numThreads);

		//WorkerThread[] arrObj = new WorkerThread[numThreads];
		//System.out.println("numThreads: "+numThreads);
		for(int i = 0; i< numThreads; i++) {
			//arrObj[i] = new WorkerThread(file, res, prime, numThreads);
			//arli.add(arrObj[0].borrow());
			arli.add(pool.borrow());
			arli.get(i).start();
		}
		for(int i = 0; i< numThreads; i++) {
			try {
			arli.get(i).join();
		}
		catch (Exception e) {
			//System.err.println(e);
			MyLogger.writeMessage(e.toString(), MyLogger.DebugLevel.OUTPUT);
			System.exit(0);
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