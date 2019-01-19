package ru.bodrov.interview.lesson2.task1;

import java.util.Iterator;

public class MyLinkedList<Item> implements Iterable<Item> {

    private Node first;
    private Node last;
    private int N;

    private class Node{
        Item item;
        Node next;
    }

    public boolean isEmpty(){return first==null;}

    public void insert(Item item){
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if(isEmpty()) first=last;
        else oldlast.next = last;
        N++;
    }

    public Item delete(){
        Item item = first.item;
        first = first.next;
        if(isEmpty()) last = null;
        N--;
        return item;
    }

    public void display(){
        Node node = first;
        for(int i = 0; i<N ; i++) {
            System.out.println(node.item);
            node = node.next;
        }
    }

    public Item find(Item itemFind){
        Node node = first;
        for(int i = 0; i<N ; i++) {
            if(node.item.equals(itemFind)) return node.item;
            node = node.next;
        }
        return null;
    }

    public Iterator<Item> iterator(){return new ListIterator();}

    private class ListIterator implements Iterator<Item>{
        private Node current = first;
        public boolean hasNext(){return current != null;}
        public Item next(){
            Item item = current.item;
            current = current.next;
            return item;
        }
        public void remove(){}
    }
}
