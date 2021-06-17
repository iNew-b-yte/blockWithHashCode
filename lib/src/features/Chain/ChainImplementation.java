package features.Chain;


import java.util.ArrayList;
import java.util.Iterator;

import features.Block.Block;
/**
 * The class {@code ChainImplementation} implements {@link ChainInterface}. This class defines an {@link ArrayList}
 *  {@code blockChain} of {@link Block} type and add blocks in the {@code ArrayList}.   
 * 
 */

public class ChainImplementation implements ChainInterface{


  //  Defining an array list blockChain of Block type 
 ArrayList<Block> blockChain = new ArrayList<>();


    

    @Override
    public void addBlock(String data) {
      //if the size of the blockChain is 0 then the below code will be executed
       if ( blockChain.size() == 0){

         //assigning prevH 0 because this is the first block and it has no previous hash
        String prevH = " 0 ";

        //first block in the blockChain is called genesisBlock
           Block genesisBlock = new Block(prevH, data);

           // adding block "genesisBlock" to the blockChain
           blockChain.add(genesisBlock);
       }

       //if the size of blockChain is not 0, then the below code will be executed
       else{

         //variable previousHash which stores the hash of the previous Block and passes it the 
         //Block constructor
           String previousHash = blockChain.get(blockChain.size()-1).getHash();
        Block newBlock = new Block(previousHash, data);

        //adding block "newBlock" to the blockChain 
        blockChain.add(newBlock);
       }
        
    }




    @Override
    public void iterator() {

      //Defining an iterator of "Block" type which is going to print Block and its hash
       Iterator<Block> it = blockChain.iterator();
       while ( it.hasNext()){
           for ( int i = 0; i < blockChain.size(); i++){

           System.out.println(it.next()+" : "+blockChain.get(i).getHash());
          
       }
    }
    }
    
}
