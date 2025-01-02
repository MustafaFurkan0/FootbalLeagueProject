package Text;

import java.util.ArrayList;

public class Heap {

    public ArrayList<Team> heap;
    public TeamList sortedList = new TeamList();

    public Heap() {
        heap = new ArrayList<>();
    }

    public void add(Team team) {
        heap.add(team);

        int index = heap.size() - 1;
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (compare(heap.get(index), heap.get(parentIndex)) > 0) { // Eğer çocuk daha büyükse
                swap(index, parentIndex);
                index = parentIndex;
            } else {
                break;
            }
        }
    }

    public Team extractMax() {
        if (heap.isEmpty()) {
            throw new IllegalStateException("Heap is empty");
        }

        Team max = heap.get(0);
        Team last = heap.remove(heap.size() - 1);

        if (!heap.isEmpty()) {
            heap.set(0, last);

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

    private int compare(Team t1, Team t2) {
        if (t1.getTotalPoints() != t2.getTotalPoints()) {
            return t1.getTotalPoints() - t2.getTotalPoints();
        } else {
            return t1.getGoalDifference() - t2.getGoalDifference();
        }
    }

    private void swap(int i, int j) {
        Team temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    public TeamList getSortedListHeap() {
        while (!heap.isEmpty()) {
            Team temp = extractMax();
            sortedList.addTeam(temp);
        }
        return sortedList;
    }

    public void clear() {
        heap.clear();
        sortedList = new TeamList();
    }

}
