package Text;

import java.util.ArrayList;

public class Heap {

    public ArrayList<Team> heap;
    public ArrayList<Team> sortedList = new ArrayList<>();

    public Heap() {
        heap = new ArrayList<>();
    }

    // Eleman ekleme
    public void add(Team team) {
        heap.add(team); // Yeni takımı sonuna ekle

        // Yukarı doğru manuel düzenleme
        int index = heap.size() - 1;
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (compare(heap.get(index), heap.get(parentIndex)) > 0) { // Eğer çocuk daha büyükse
                swap(index, parentIndex); // Yer değiştir
                index = parentIndex; // Yeni indeks ebeveyn
            } else {
                break;
            }
        }
    }

    // Max elemanı çıkarma (Heap'in kökü)
    public Team extractMax() {
        if (heap.isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }

        Team max = heap.get(0); // Kök eleman
        Team last = heap.remove(heap.size() - 1); // Son elemanı çıkar

        if (!heap.isEmpty()) {
            heap.set(0, last); // Son elemanı köke taşı

            // Aşağı doğru manuel düzenleme
            int index = 0;
            while (true) {
                int leftChild = 2 * index + 1;
                int rightChild = 2 * index + 2;
                int largest = index;

                if (leftChild < heap.size() && compare(heap.get(leftChild), heap.get(largest)) > 0) {
                    largest = leftChild;
                }
                if (rightChild < heap.size() && compare(heap.get(rightChild), heap.get(largest)) > 0) {
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

        return max;
    }

    // Takımların karşılaştırmasını yapan yardımcı metot
    private int compare(Team t1, Team t2) {
        if (t1.getTotalPoints() != t2.getTotalPoints()) {
            return t1.getTotalPoints() - t2.getTotalPoints(); // Puan farkına göre karşılaştırma
        } else {
            return t1.getGoalDifference() - t2.getGoalDifference(); // Puan eşitse gol farkına göre
        }
    }

    // İki takımın yerini değiştir
    private void swap(int i, int j) {
        Team temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    // Heap'ten sıralı bir liste döndür (Heap boşalır)
    public ArrayList<Team> getSortedListHeap() {
        while (!heap.isEmpty()) {
            Team temp = extractMax();
            sortedList.add(temp);
        }
        return sortedList;
    }

    // Heap'i yazdır
    public void printHeap() {
        for (Team team : heap) {
            System.out.println(team.getName() + " - Puan: " + team.getTotalPoints() + ", Average: " + team.getGoalDifference());
        }
    }
}
