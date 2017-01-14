package com.craking_the_coding_itw.data;

/**
 * Basic implementation of a Linked list
 * @author fabienrecco
 *
 * @param <E>
 */
public class LinkedList<E> {

    private LinkedList<E> next;
    private E data;

    public LinkedList(final E data) {
        this.data = data;
    }

    public LinkedList(final E... elements) {
        if(elements != null && elements.length > 0) {
            data = elements[0];
            for(int i=1; i<elements.length; ++i) {
                addElement(elements[i]);
            }
        }
    }

    public void addElement(final E data) {
        LinkedList<E> end = new LinkedList<E>(data);
        LinkedList<E> n = this;

        while(n.next != null) {
            n = n.next;
        }
        n.next = end;
    }


    // Getters and Setters
    //---------------------------------------------------

    public LinkedList<E> getNext() {
        return next;
    }

    public E getData() {
        return data;
    }

    public void setNext(final LinkedList<E> next) {
        this.next = next;
    }

    public void setData(final E data) {
        this.data = data;
    }


    // Object Methods
    //---------------------------------------------------

    @Override
    public String toString() {
        return data + (next!=null ? "->"+next : "");
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((data == null) ? 0 : data.hashCode());
        result = prime * result + ((next == null) ? 0 : next.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        LinkedList other = (LinkedList) obj;
        if (data == null) {
            if (other.data != null) {
                return false;
            }
        }
        else if (!data.equals(other.data)) {
            return false;
        }
        if (next == null) {
            if (other.next != null) {
                return false;
            }
        }
        else if (!next.equals(other.next)) {
            return false;
        }
        return true;
    }

}
