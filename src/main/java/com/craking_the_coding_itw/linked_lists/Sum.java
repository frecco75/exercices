package com.craking_the_coding_itw.linked_lists;

import java.util.ArrayList;
import java.util.List;

import com.craking_the_coding_itw.data.LinkedList;

/**
 * You have two numbers represented by a linked list, where each node contains a single digit.
 * The digits are stored in reverse order, such that the 1's digit is at the head of the list.
 * Write a function that adds the two numbers and returns the sum as a linked list.
 *
 * Example:
 * Input: (3->1->5) + (5->9->2)
 * Output: 8->0->8
 *
 * @author fabienrecco
 *
 */
public class Sum {


    public LinkedList<Integer> sum(final LinkedList<Integer> lstA, final LinkedList<Integer> lstB) {
        LinkedList<Integer> solution = null;
        LinkedList<Integer> cursor = solution;
        LinkedList<Integer> cursorA = lstA;
        LinkedList<Integer> cursorB = lstB;

        int temp = 0;

        while(cursorA != null && cursorB != null) {
            Integer sum = cursorA.getData() + cursorB.getData() + temp;
            temp = sum / 10;
            Integer digit = sum - temp * 10;

            LinkedList<Integer> node = new LinkedList<Integer>(digit);
            if(cursor != null) {
                cursor.setNext(node);
            }
            if(solution == null) {
                // On pointe sur le 1er élément
                solution = node;
            }
            cursor = node;
            cursorA = cursorA.getNext();
            cursorB = cursorB.getNext();
        }

        if(cursorA != null) {
            Integer sum = cursorA.getData() + temp;
            temp = sum / 10;
            Integer digit = sum - temp * 10;

            LinkedList<Integer> node = new LinkedList<Integer>(digit);
            node.setNext(cursorA.getNext());

            if(cursor != null) {
                cursor.setNext(node);
            }
            if(solution == null) {
                // On pointe sur le 1er élément
                solution = node;
            }
        }

        if(cursorB != null) {
            Integer sum = cursorB.getData() + temp;
            temp = sum / 10;
            Integer digit = sum - temp * 10;

            LinkedList<Integer> node = new LinkedList<Integer>(digit);
            node.setNext(cursorB.getNext());

            if(cursor != null) {
                cursor.setNext(node);
            }
            if(solution == null) {
                // On pointe sur le 1er élément
                solution = node;
            }
        }

        if(temp > 0) {
            LinkedList<Integer> node = new LinkedList<Integer>(temp);
            cursor.setNext(node);
        }

        return solution;
    }

    /**
     * Solution en O(n)
     * @param lstA
     * @param lstB
     * @return
     */
    public List<Integer> sum(final List<Integer> lstA, final List<Integer> lstB) {
        List<Integer> solution = new ArrayList<Integer>();
        int temp = 0;
        int size = Math.min(lstA.size(), lstB.size());

        int i=0;
        for(i=0; i<size; ++i) {
            temp = sum(solution, temp, lstA.get(i), lstB.get(i));
        }

        for(;i<lstA.size(); ++i) {
            temp = sum(solution, temp, lstA.get(i));
        }
        for(;i<lstB.size(); ++i) {
            temp = sum(solution, temp, lstB.get(i));
        }

        if(temp > 0) {
            solution.add(temp);
        }

        return solution;
    }

    private int sum(final List<Integer> solution, int temp, final Integer...elements) {
        Integer sum = temp;
        for(Integer elt : elements) {
            sum += elt;
        }
        temp = sum / 10;
        Integer digit = sum - temp * 10;
        solution.add(digit);
        return temp;
    }

}
