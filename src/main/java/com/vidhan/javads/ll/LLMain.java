package com.vidhan.javads.ll;

public class LLMain {
    public static void main(String[] args) {
   /*
        VidLinkedList list = new VidLinkedList(23);
        System.out.println("Length of list-->"+list.length);
        System.out.println("List head value-->"+list.getHead().value);
        System.out.println("List tail value-->"+list.getTail().value);
        System.out.println("Head Next value-->"+list.getHead().next);
   */

        //created an empty list
      /*  VidLinkedList list = new VidLinkedList();
        System.out.println("Length of list-->"+list.length);
        list.append(22);
        System.out.println("Length of list-->"+list.length);
        System.out.println("List head value-->"+list.getHead().value);
        System.out.println("List tail value-->"+list.getTail().value);

        list.append(2);
        System.out.println("Length of list-->"+list.length);
        System.out.println("List head value-->"+list.getHead().value);
        System.out.println("List tail value-->"+list.getTail().value);

        list.append(98);
        System.out.println("Length of list-->"+list.length);
        System.out.println("List head value-->"+list.getHead().value);
        System.out.println("List tail value-->"+list.getTail().value);

        System.out.println("value at 2nd Node-->"+list.get(2).value);
*/
        /*VidLinkedList list = new VidLinkedList();
        System.out.println("Length of list-->"+list.length);
        list.prepend(10);
        System.out.println("Length of list-->"+list.length);
        System.out.println("List head value-->"+list.getHead().value);
        System.out.println("List tail value-->"+list.getTail().value);

        list.prepend(25);
        System.out.println("Length of list-->"+list.length);
        System.out.println("List head value-->"+list.getHead().value);
        System.out.println("List tail value-->"+list.getTail().value);*/

        VidLinkedList list = new VidLinkedList();
        System.out.println("Length of list-->"+list.length);
        list.append(34);
        list.append(345);
        list.append(3467);
        list.append(34789);
        System.out.println("Length of list-->"+list.length);
        System.out.println("List head value-->"+list.getHead().value);
        System.out.println("List tail value-->"+list.getTail().value);

       /* System.out.println("::::::Removing last item::::::");
        list.removeLast();
        System.out.println("Length of list-->"+list.length);
        System.out.println("List head value-->"+list.getHead().value);
        System.out.println("List tail value-->"+list.getTail().value);


        System.out.println("::::::Removing last item::::::");
        list.removeLast();
        System.out.println("Length of list-->"+list.length);
        System.out.println("List head value-->"+list.getHead().value);
        System.out.println("List tail value-->"+list.getTail().value);

        System.out.println("::::::Removing last item::::::");
        list.removeLast();
        System.out.println("Length of list-->"+list.length);
        System.out.println("List head value-->"+list.getHead().value);
        System.out.println("List tail value-->"+list.getTail().value);

        System.out.println("::::::Removing last item::::::");
        list.removeLast();
        System.out.println("Length of list-->"+list.length);
        System.out.println("List head value-->"+list.getHead().value);
        System.out.println("List tail value-->"+list.getTail().value);*/

        /*System.out.println("::::::Removing first item::::::");
        list.removeFirst();
        System.out.println("Length of list-->"+list.length);
        System.out.println("List head value-->"+list.getHead().value);
        System.out.println("List tail value-->"+list.getTail().value);

        System.out.println("::::::Removing first item::::::");
        list.removeFirst();
        System.out.println("Length of list-->"+list.length);
        System.out.println("List head value-->"+list.getHead().value);
        System.out.println("List tail value-->"+list.getTail().value);

        System.out.println("::::::Removing first item::::::");
        list.removeFirst();
        System.out.println("Length of list-->"+list.length);
        System.out.println("List head value-->"+list.getHead().value);
        System.out.println("List tail value-->"+list.getTail().value);*/


        /*System.out.println("Inserting an element at index 4");
        System.out.println(list.insert(45, 4));
        System.out.println("Length of list-->"+list.length);
        System.out.println("List head value-->"+list.getHead().value);
        System.out.println("List tail value-->"+list.getTail().value);

        System.out.println("Inserting an element at index 3");
        System.out.println(list.insert(45, 3));
        System.out.println("Length of list-->"+list.length);
        System.out.println("List head value-->"+list.getHead().value);
        System.out.println("List tail value-->"+list.getTail().value);

        System.out.println("Inserting an element at index 1");
        System.out.println(list.insert(1045, 1));
        System.out.println("Length of list-->"+list.length);
        System.out.println("List head value-->"+list.getHead().value);
        System.out.println("List tail value-->"+list.getTail().value);

        list.printList();

        System.out.println("Inserting an element at index 1");
        System.out.println(list.insert(10456, 1));
        System.out.println("Length of list-->"+list.length);
        System.out.println("List head value-->"+list.getHead().value);
        System.out.println("List tail value-->"+list.getTail().value);

        list.printList();*/

       /* System.out.println("Removing an element at index 4");
        System.out.println(list.remove(4));
        System.out.println("Length of list-->"+list.length);
        System.out.println("List head value-->"+list.getHead().value);
        System.out.println("List tail value-->"+list.getTail().value);
        list.printList();

        System.out.println("Removing an element at index 2");
        System.out.println(list.remove(2));
        System.out.println("Length of list-->"+list.length);
        System.out.println("List head value-->"+list.getHead().value);
        System.out.println("List tail value-->"+list.getTail().value);
        list.printList();

        System.out.println("Removing an element at index 0");
        System.out.println(list.remove(0));
        System.out.println("Length of list-->"+list.length);
        System.out.println("List head value-->"+list.getHead().value);
        System.out.println("List tail value-->"+list.getTail().value);
        list.printList();*/

        list.printList();

        System.out.println("After reversing::::");
        list.reverse();
        list.printList();

    }
}
