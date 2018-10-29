package studentCoursesBackup.workers;
import java.lang.Thread;
import java.util.ArrayList;
import studentCoursesBackup.util.IsPrime;
import studentCoursesBackup.util.FileProcessor;
import studentCoursesBackup.util.Results;
import studentCoursesBackup.util.MyLogger;
import studentCoursesBackup.util.StdoutDisplayInterface;

class ObjectPool implements ThreadPool {
IsPrime prime; FileProcessor file; StdoutDisplayInterface res; int numThreads;
ArrayList<Thread> arli;

	public ObjectPool(IsPrime prime, FileProcessor file, StdoutDisplayInterface res, int numThreads) {
		MyLogger.writeMessage("workers.ObjectPool constructor called", MyLogger.DebugLevel.CONSTRUCTOR);
		this.prime = prime;
		this.file = file;
		this.res = res;	
		this.numThreads = numThreads;	
		arli = new ArrayList<Thread>();
		createThreads();
	}

	/**
    * void return type
    */
	public void createThreads() {		
		for(int i=0;i< numThreads; i++) {
			WorkerThread obj = new WorkerThread(file,res,prime);
			 arli.add(new Thread(obj));
		}
	}

   	/**
    * void return type
    */
	public Thread borrow() {
		Thread t = arli.get(0);
		arli.remove(0);
		return t;
	}

}