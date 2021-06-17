

import features.Chain.ChainImplementation;
import features.Chain.ChainInterface;

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
