public class Solution {
    
    
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * 
     * Problem 1: Exam Average
     */

    public double average(double t1, double t2, double t3, double t4) {
        // remove 0.0 and return your answer
        double average = (t1 + t2 + t3 + t4)/4;
        return average;

    }

    public int roundAverage(double average) {
        // remove 0 and return your answer
      
        return (int) (average + 0.5);
    }

    public boolean isPassing(int roundedAverage) {
        // remove false and return your answer
  

            return roundedAverage >= 65;
            

    
    }

    /*
    Problem 2: Stock Price 
    */

    public double totalStock(int shares, double price) {
        // remove 0.0 and return your answer
        return (double) (shares * price) ;
    }


    public int roundValueChange(double totalStock) {
        // remove 0 and return your answer
         
        if (totalStock >= 0){
           return (int) (totalStock + 0.5);
        
        }else { 
            
            return (int)(totalStock - 0.5);
        }
        
    }
    
    

    /*
    Problem 3: Digit Incrementer 
    */
   
    public double adjustDigits(double userDouble) {
        // remove 0.0 and return your answer
       int hundreds = (int) (((int)(userDouble/100)+1)%10);
       int tens = (int)(((int)((userDouble%100)/10)+1)%10);
       int ones = (int)(((int)((userDouble%100)%10)+1)%10);
       int tenth = (int) ((((int)((userDouble*10)%10))+1)%10); 
       int hundreth = (int) (((int) ((userDouble*100)%10))+1)%10;
        return hundreds* 100 + tens * 10 + ones + tenth * 0.1 + hundreth * 0.01;
    
    }



}
