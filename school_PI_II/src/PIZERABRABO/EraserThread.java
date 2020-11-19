/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PIZERABRABO;

/**
 *
 * @author olive
 */
public class EraserThread implements Runnable {
   private boolean stop;
 
   /**
    *@param The prompt displayed to the user
    */
   public EraserThread(String prompt) {
       System.out.print(prompt);
   }

   /**
    * Begin masking...display asterisks (*)
    */
   public void run () {
      stop = true;
      while (stop) {
         System.out.print("\010*");
	 try {
	    Thread.currentThread().sleep(0);
         } catch(InterruptedException ie) {
            ie.printStackTrace();
         }
      }
   }

   /**
    * Instruct the thread to stop masking
    */
   public void stopMasking() {
      this.stop = false;
   }
    
}
