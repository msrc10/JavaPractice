package multithredingPractice.Assignment;

import java.util.*;
import java.util.concurrent.*;

public class MergeSort implements Callable<List<Integer>> {

    List<Integer> list;
    ExecutorService exsev;

    public MergeSort(ExecutorService exsev, List<Integer> list) {
        this.list = list;
        this.exsev = exsev;
    }

    @Override
    public List<Integer> call() throws Exception {

        if (list.size() <= 1)
            return list;

        int mid = list.size() / 2;
        List<Integer> leftArr = new ArrayList<>();
        List<Integer> rightArr = new ArrayList<>();

        //if you use <=mid lead to infinite recursion for 2 sized array
        for (int i = 0; i < mid; i++) { 
            leftArr.add(list.get(i));
        }

        for (int i = mid; i < list.size(); i++) {
            rightArr.add(list.get(i));
        }

        Future<List<Integer>> f1 = exsev.submit(new MergeSort(exsev, leftArr));
        Future<List<Integer>> f2 = exsev.submit(new MergeSort(exsev, rightArr));

        List<Integer> left = f1.get();
        List<Integer> right = f2.get();

        int i = 0, j = 0;
        List<Integer> ans = new ArrayList<>();

        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                ans.add(left.get(i));
                i++;
            } else {
                ans.add(right.get(j));
                j++;
            }
        }
        while (i < left.size()) {
            ans.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            ans.add(right.get(j));
            j++;
        }

        return ans;

    }

}
