package Text;

import java.util.*;

public class Heap {

    private ArrayList<TeamNode> heap;

    public Heap() {
        heap = new ArrayList<>();
    }

    public class TeamNode {

        String isim;
        int puan;
        int average;
        TeamNode left;  // Sol alt düğüm (çocuk)
        TeamNode right; // Sağ alt düğüm (çocuk)

        public String getIsim() {
            return isim;
        }

        public void setIsim(String isim) {
            this.isim = isim;
        }

        public int getPuan() {
            return puan;
        }

        public void setPuan(int puan) {
            this.puan = puan;
        }

        public int getAverage() {
            return average;
        }

        public void setAverage(int average) {
            this.average = average;
        }

        public TeamNode(Team team) {
            this.isim = team.getName();
            this.puan = team.getTotalPoints();
            this.average = team.getGoalDifference();
            this.left = null;
            this.right = null;
        }

        public int compareTo(TeamNode other) {
            if (this.puan != other.puan) {
                return this.puan - other.puan; // Puan farkına göre karşılaştırma
            } else {
                return this.average - other.average; // Puan eşitse gol farkına göre
            }
        }

    }

    private TeamNode root;

    // Eleman ekleme
    public void add(Team team) {
        TeamNode newNode = new TeamNode(team);
        heap.add(newNode); // Yeni düğümü sonuna ekle
        heapifyUp(heap.size() - 1); // Yukarı doğru düzenle
    }

    // Max elemanı çıkarma (Heap'in kökü)
    public TeamNode extractMax() {
        if (heap.isEmpty()) {
            return null; // Heap boşsa null döndür
        }
        TeamNode max = heap.get(0); // Kök düğümü al
        TeamNode last = heap.remove(heap.size() - 1); // Son elemanı çıkar
        if (!heap.isEmpty()) {
            heap.set(0, last); // Son elemanı köke taşı
            heapifyDown(0); // Aşağı doğru düzenle
        }
        return max;
    }

    // Heapify Up: Yeni eklenen düğümü yukarı taşı
    private void heapifyUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (heap.get(index).compareTo(heap.get(parentIndex)) > 0) {
                swap(index, parentIndex);
                index = parentIndex;
            } else {
                break;
            }
        }
    }

    // Heapify Down: Kökten aşağı doğru düzenle
    private void heapifyDown(int index) {
        int size = heap.size();
        while (index < size) {
            int leftChild = 2 * index + 1;
            int rightChild = 2 * index + 2;
            int largest = index;

            if (leftChild < size && heap.get(leftChild).compareTo(heap.get(largest)) > 0) {
                largest = leftChild;
            }
            if (rightChild < size && heap.get(rightChild).compareTo(heap.get(largest)) > 0) {
                largest = rightChild;
            }
            if (largest != index) {
                swap(index, largest);
                index = largest;
            } else {
                break;
            }
        }
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    // Düğüm yer değiştirme
    private void swap(int i, int j) {
        TeamNode temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    // Heap'i yazdır
    public void printHeap() {
        for (TeamNode node : heap) {
            System.out.println(node);
        }
    }
}
