
package shutdownhook2;

public class ShutDownHook2 {

    
    public static void main(String[] args) {
           Runtime.getRuntime().addShutdownHook(new Thread() 
    { 
      public void run() 
      { 
        System.out.println("Shutdown Hook is running !"); 
      } 
    }); 
    System.out.println("Application Terminating ..."); 
  } 
    }  
    
    

