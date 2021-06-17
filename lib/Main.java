

import features.Chain.ChainImplementation;
import features.Chain.ChainInterface;

/**
 * Class {@code Main} where {@code data} is provided to the {@code addBlock()} function 
 * and {@code iterator()} function is called to display hash on the output 
 */

public class Main {
    



    public static void main(String[] args) {

            ChainInterface chainObject = new ChainImplementation();

        chainObject.addBlock("Transaction");
        chainObject.addBlock("Bitcoin_Cash");
        chainObject.addBlock("Transaction");
        chainObject.addBlock("Bitcoin_Gold");
        chainObject.addBlock("Smart_Contract");
        chainObject.addBlock("Miner mined");

       
        chainObject.iterator();




    }
}
