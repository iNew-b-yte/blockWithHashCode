package features.Block;
/**
 * An interface {@link BlockInterface} which has certain methods such as {@code calculatedHash(String previousHash, String data)}
 * and some getters such as 
 */

public interface BlockInterface {
    
    public String calculatedHash(String previousHash, String data);
    public String getData();
    public String getPreviousHash();
    public String getHash();
}
