package studentCoursesBackup.workers;

public interface ThreadPool {
  public void createThreads();
  public Thread borrow();

}