package com.company;

class IntegerComparator implements ComparatorInterface<Integer>{
    @Override
    public int Compare(Integer first, Integer second) {
        int v = first - second;
        return Integer.compare(v, 0);
    }
}