package studentCoursesBackup.util;

   /**
    * This class is responsible for checking whether prime or not
    */
public class IsPrime implements Primer{

	public IsPrime() {
		MyLogger.writeMessage("util.IsPrime constructor called", MyLogger.DebugLevel.CONSTRUCTOR);
	}

    /**
    * boolean return type; It returns odd numbers as prime numbers- placeholder for now
    */
	@Override
	public boolean check(int numberToCheck) {
		
	if(numberToCheck % 2 == 0) {
			return false;
	}
	for(int i =2; i< numberToCheck/2 ; i=i+2){
		if(numberToCheck%i == 0) {
			return false;
		}
	}
		return true;
	}
    

   	/**
    * void String type
    */
  @Override
  public String toString() {
    return "";
  }

}