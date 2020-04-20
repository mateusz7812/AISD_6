package com.company;

import java.util.List;

public class MovesSimulation<T>{
    private ComparatorInterface<T> comparator;
    public MovesSimulation(ComparatorInterface<T> comparator){
        this.comparator = comparator;
    }

    public int Simulate(List<T> list){
        int moves = 0;
        var max = list.get(0);
        for (int i=1; i<list.size(); i++ ){
            if(comparator.Compare(max, list.get(i)) == 1) moves++;
            else max = list.get(i);
        }
        return moves;
    }
}
