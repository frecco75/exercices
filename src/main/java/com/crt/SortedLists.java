package com.crt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* Ecrivez une fonction qui en entrée prend deux listes triées de tailles m et n
 * et qui en sortie renvoie une liste contenant les valeurs des deux listes triées?
 * Optimisez la fonction pour avoir une complexité de O(m+n) !
 */
public class SortedLists {

    public <E extends Comparable<E>> List<E> merge(final List<E> l1, final List<E> l2) {
        final List<E> list = new ArrayList<E>();
        list.addAll(l1);
        list.addAll(l2);

        Collections.sort(list);
        return list;
    }

    public <E extends Comparable<E>> List<E> linearMerge(final List<E> l1, final List<E> l2) {
        final List<E> list = new ArrayList<E>();

        Iterator<E> ite1 = l1.iterator();
        Iterator<E> ite2 = l2.iterator();

        E e1 = ite1.next();
        E e2 = ite2.next();

        // While l1 not finished and l2 not finished
        do {
            if(e2.compareTo(e1) > 0) {
                list.add(e1);
                e1 = ite1.hasNext() ? ite1.next() : null;
            }
            else {
                list.add(e2);
                e2 = ite2.hasNext() ? ite2.next() : null;
            }
        } while(e1 != null && e2 != null);

        // By now, either l1 or l2 is empty. It remains to empty the other input list.
        while(e1 != null) {
            list.add(e1);
            e1 = ite1.hasNext() ? ite1.next() : null;
        }
        while(e2 != null) {
            list.add(e2);
            e2 = ite2.hasNext() ? ite2.next() : null;
        }

        return list;
    }


    public int[] linearMerge(final int[] arr1, final int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        int[] array = new int[n + m];

        // While arr1 not finished and arr2 not finished
        int i=0, j=0;
        while(i<n && j<m) {
            if(arr1[i] < arr2[j]) {
                array[i+j] = arr1[i++];
            }
            else {
                array[i+j] = arr2[j++];
            }
        }

        // By now, either arr1 or arr2 is empty. It remains to empty the other input list.
        while(i<n) {
            array[i+j] = arr1[i++];
        }
        while(j<m) {
            array[i+j] = arr2[j++];
        }

        return array;
    }

}
