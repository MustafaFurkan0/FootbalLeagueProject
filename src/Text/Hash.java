package Text;

import java.lang.reflect.Array;
import java.util.*;

public class Hash {

    TeamList teamList;
    int size;
    Node[] hashTable;

    public Hash(int size) {
        this.size = size;
        hashTable = new Node[size];
        for (int i = 0; i < size; i++) {
            hashTable[i] = null;
        }

    }

    private int hashFunction(int key) {
        return key % 10;
    }

    public Node[] ekle(int key, TeamList teamList) {
        int index = hashFunction(key);
        Node newNode = new Node(teamList);
        // Bağlı listeye ekleme
        if (hashTable[index] == null) {
            hashTable[index] = newNode; // Liste boşsa doğrudan ekle
        } else {
            Node current = hashTable[index];
            while (current.next != null) { // Listenin sonuna kadar ilerle
                current = current.next;
            }
            current.next = newNode; // Yeni düğümü sona ekle
        }
        return hashTable;

    }

    public TeamList hashMethod(TeamList teamList, int weekNumber) {
        TeamList result = new TeamList();

        int totalTeams = teamList.size();
        for (int i = weekNumber; i < totalTeams; i++) {
            result.addTeam(teamList.get(i)); // Belirli indeksi kullanarak takımı al ve ekle
        }
        return result;
    }

}
