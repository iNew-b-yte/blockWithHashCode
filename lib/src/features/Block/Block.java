
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
       this.previousHash = previousHash;
       this.data = data;
       this.timeStamp = new Date().getTime();
       this.hash = calculatedHash(previousHash, data);
   }

@Override
public String calculatedHash(String previousHash, String data) {
    int calculation = (previousHash + data + Long.toString(timeStamp)).hashCode();
    return Integer.toString(calculation);
}

@Override
public String getData() {
    return this.data;
}

@Override
public String getPreviousHash() {
        return this.previousHash;
}

@Override
public String getHash() {
    return this.hash;
}




}
