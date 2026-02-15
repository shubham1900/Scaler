package com.lcwd.test.ScalerQuestions.Thirteenfeb.Q2;

import java.util.concurrent.Callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer> {

    Node root;
    ExecutorService ex;

    public TreeSizeCalculator(Node root, ExecutorService ex) {
        this.root = root;
        this.ex = ex;
    }

    @Override
    public Integer call() throws Exception {
        if (root == null) {
            return 0;
        }

        // Create two TreeSizeCalculator tasks for left and right subtrees
        TreeSizeCalculator leftTask= new TreeSizeCalculator(root.left, ex);
        TreeSizeCalculator rightTask= new TreeSizeCalculator(root.right,ex);

        // Submit the tasks to the executor service and get the futures
        Future<Integer> leftfuture = ex.submit(leftTask);
        Future<Integer> rightfuture = ex.submit(rightTask);

        // Wait for the results and calculate the size of the current subtree
        return 1+ leftfuture.get() +rightfuture.get();

    }
}
