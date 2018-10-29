-----------------------------------------------------------------------
-----------------------------------------------------------------------


Following are the commands and the instructions to run ANT on your project.
#### Note: build.xml is present in studentCoursesBackup/src folder.

-----------------------------------------------------------------------
## Instruction to clean:

####Command: ant -buildfile studentCoursesBackup/src/build.xml clean

Description: It cleans up all the .class files that were generated when you
compiled your code.

-----------------------------------------------------------------------
## Instruction to compile:

####Command: ant -buildfile studentCoursesBackup/src/build.xml all

Description: Compiles your code and generates .class files inside the BUILD folder.

-----------------------------------------------------------------------
## Instruction to run:

####Command: ant -buildfile studentCoursesBackup/src/build.xml run -Darg0=<input_file.txt> -Darg1=<NUM_THREADS> -Darg2=<DEBUG_VALUE>

* Run with only 1 to 5 threads
* DEBUG_VALUE set 0 for output display

Note: Arguments accept the absolute path of the files.

-----------------------------------------------------------------------
Choice of Data Structure in Results class
ArrayList
n: total number of numbers in file
Time Complexity: O(1) for addition and retrival
Space Complexity: O(n) for storage (incase all lines are prime)

-----------------------------------------------------------------------
 



