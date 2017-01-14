package com.craking_the_coding_itw.linked_lists;

import java.util.List;

import com.craking_the_coding_itw.data.LinkedList;

/**
 * Implement an algorithm to delete a node in the middle of a single linked list, given only access to that node.
 * Example :
 * Input: the node 'c' from the linked list a->b->c->d->e
 * Result: nothing is returned, but the new linked list looks like a->b->d->e
 *
 * @author fabienrecco
 *
 */
public class DeleteNode {

    /**
     * Solution en O(1)
     * @param lst
     */
    public <E> void process(final List<E> lst) {
        if(lst != null && ! lst.isEmpty()) {
            lst.remove(lst.size()/2);
        }
    }

    /**
     * Solution en O(1)
     * @param middle
     */
    public <E> void process(final LinkedList<E> middle) {
        if(middle != null && middle.getNext() != null) {
            LinkedList<E> next = middle.getNext();
            middle.setData(next.getData());
            middle.setNext(next.getNext());
        }
    }

}
