package com.company;

import java.util.ArrayList;
import java.util.List;

public class InsertSort<T> {
    private ComparatorInterface<T> comparator;
    private int moves;
    public InsertSort(ComparatorInterface<T> comparator){
        this.comparator = comparator;
    }

    public List<T> Sort(List<T> originalList){
        moves = 0;
        var list = new ArrayList<>(originalList);
        int notSortedIndex = 1;
        int indexToMove;
        while(notSortedIndex != list.size()){
            indexToMove = notSortedIndex;
            while (indexToMove!=0 && comparator.Compare(list.get(indexToMove-1), list.get(notSortedIndex)) == 1) indexToMove--;
            if(notSortedIndex != indexToMove) _move(list, notSortedIndex, indexToMove);
            notSortedIndex ++;
        }
        return list;
    }

    private void _move(List<T> list, int from, int to) {
        list.add(to, list.remove(from));
        moves++;
    }

    public int getMoves() {
        return moves;
    }
}
