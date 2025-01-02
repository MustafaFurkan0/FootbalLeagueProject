package Text;

public class Hash {

    int size;
    PlayerList[] hashTable;

    public Hash(int size) {
        this.size = size;
        hashTable = new PlayerList[size];
        for (int i = 0; i < size; i++) {
            hashTable[i] = null;
        }
    }

    public PlayerList[] getHashTable() {
        return hashTable;
    }

    public void setHashTable(PlayerList[] hashTable) {
        this.hashTable = hashTable;
    }

    private int hash(String key) {
        int hashValue = 0;
        for (int i = 0; i < key.length(); i++) {
            hashValue = (hashValue * 31 + key.charAt(i)) % size;
        }
        return hashValue;
    }

    public void put(String key, PlayerList players) {
        int index = hash(key);
        hashTable[index] = players;
    }

    public PlayerList get(String key) {
        int index = hash(key);
        return hashTable[index];
    }
}
