package features.Chain;


import java.util.ArrayList;
import java.util.Iterator;

import features.Block.Block;


public class ChainImplementation implements ChainInterface{

 ArrayList<Block> blockChain = new ArrayList<>();




    @Override
    public void addBlock(String data) {
      
       if ( blockChain.size() == 0){
        String prevH = " 0";
           Block genesisBlock = new Block(prevH, data);
           blockChain.add(genesisBlock);
       }

       else{

           String previousHash = blockChain.get(blockChain.size()-1).getHash();
        Block newBlock = new Block(previousHash, data);
        blockChain.add(newBlock);
       }
        
    }




    @Override
    public void iterator() {
       Iterator<Block> it = blockChain.iterator();
       while ( it.hasNext()){
           for ( int i = 0; i < blockChain.size(); i++){

           System.out.println(it.next()+" : "+blockChain.get(i).getHash());
          
       }
    }
    }
    
}
