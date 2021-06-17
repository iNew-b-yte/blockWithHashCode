package features.Chain;

/**
 * An interface {@link ChainInterface} which has methods like
 * {@code addBlock(String data)} and {@code iterator()}.
 * 
 */
public interface ChainInterface {

    /** Function {@code addBlock(String data)} of void type. This function takes some {@code data} 
     * from the user and add blocks in the {@code blockChain} 
     */
    void addBlock(String data);


    /**
     * Function {@code iterator()} of void type. This iterates through all the blocks and 
     * print it's hash on the Output Screen
     */
    void iterator();

}
