
package features.Block;

import java.util.Date;




/**  
 * A class {@code Block} under package {@code Block} has {@code previousHash}, which is hash of the previous
 * block, some {@code data} which can be anything like transactions, ownership etc {@code timeStamp} at which the block was created
 * and the {@code hash} of the current block which is being created.
 * 
 * 
*/

public class Block implements BlockInterface{
    
   private String hash;
   private String previousHash;
   private String data;
   private Long timeStamp;

   public Block (String previousHash, String data ){

    //Intializing values in the constructor
       this.previousHash = previousHash;
       this.data = data;
       this.timeStamp = new Date().getTime();
       this.hash = calculatedHash(previousHash, data);
   }

@Override
public String calculatedHash(String previousHash, String data) {

    //calculates hash by concatenating previousHash, data, timeStamp and uses hashCode() function 
    //and returns hash in integer values
    int calculation = (previousHash + data + Long.toString(timeStamp)).hashCode();

    // Integer.toString(calculation) converts integer values to String and returns it.
    return Integer.toString(calculation);
}

@Override
//getter for returning data 
public String getData() {
    return this.data;
}

@Override
// getter for returning previous hash
public String getPreviousHash() {
        return this.previousHash;
}

@Override
// getter for returning hash
public String getHash() {
    return this.hash;
}




}
