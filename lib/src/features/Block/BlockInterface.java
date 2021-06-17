package features.Block;

/**
 * An interface {@link BlockInterface} which has certain methods such as
 * {@code calculatedHash(String previousHash, String data)} and some getters
 * such as {@code getData()}, {@code getPreviousHash()} and {@code getHash()}.
 */

public interface BlockInterface {

    /**
     * The function {@code calculatedHash()} calculates the hash of the Block 
     * which takes parameters as follows
     * @param previousHash
     * @param data
     *  
     * @return calculated hash
     */    
    public String calculatedHash(String previousHash, String data);
    public String getData();
    public String getPreviousHash();
    public String getHash();
}
