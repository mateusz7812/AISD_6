package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestInsertSort {
    @Test
    public void Test1(){
        var insertSort = new InsertSort<>(new IntegerComparator());
        var sorted = insertSort.Sort(List.of(1,2,3));
        Assert.assertArrayEquals(List.of(1,2,3).toArray(), sorted.toArray());
        Assert.assertEquals(0, insertSort.getMoves());
    }

    @Test
    public void Test2(){
        var insertSort = new InsertSort<>(new IntegerComparator());
        var sorted = insertSort.Sort(List.of(3,2,1));
        Assert.assertArrayEquals(List.of(1,2,3).toArray(), sorted.toArray());
        Assert.assertEquals(2, insertSort.getMoves());
    }

    @Test
    public void Test3(){
        var insertSort = new InsertSort<>(new IntegerComparator());
        var sorted = insertSort.Sort(List.of(3,2,5,4,7,8,6,9,1));
        Assert.assertArrayEquals(List.of(1,2,3,4,5,6,7,8,9).toArray(), sorted.toArray());
        Assert.assertEquals(4, insertSort.getMoves());
    }

    @Test
    public void Test4(){
        var insertSort = new InsertSort<>(new IntegerComparator());
        var sorted = insertSort.Sort(List.of(3,3,3,1,5));
        Assert.assertArrayEquals(List.of(1,3,3,3,5).toArray(), sorted.toArray());
        Assert.assertEquals(1, insertSort.getMoves());
    }
}
