package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestMovesSimulation {
    @Test
    public void Test1(){
        var movesSimulation = new MovesSimulation<>(new IntegerComparator());
        var moves = movesSimulation.Simulate(List.of(1,2,3));
        Assert.assertEquals(0, moves);
    }

    @Test
    public void Test2(){
        var movesSimulation = new MovesSimulation<>(new IntegerComparator());
        var moves = movesSimulation.Simulate(List.of(3,2,1));
        Assert.assertEquals(2, moves);
    }

    @Test
    public void Test3(){
        var movesSimulation = new MovesSimulation<>(new IntegerComparator());
        var moves = movesSimulation.Simulate(List.of(3,2,5,4,7,8,6,9,1));
        Assert.assertEquals(4, moves);
    }

    @Test
    public void Test4(){
        var movesSimulation = new MovesSimulation<>(new IntegerComparator());
        var moves = movesSimulation.Simulate(List.of(3,3,3,1,5));
        Assert.assertEquals(1, moves);
    }

}
