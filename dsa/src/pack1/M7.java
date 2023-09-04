import java.util.Iterator;
import java.util.ConcurrentModificationException;
class Node<E>{
	E data;
	Node<E> next;
	Node (E data){
		this.data = data;
	}
}
class LinkedList<E>{
	Node<E> first;
	Node<E> last;
	private int size = 0;
	public String toString(){
		Node<E> current = first;
		String s = "[";
		while(current != null){
			s+= current.data + (current.next == null ? "" : ", ");
			current = current.next;
		}
		s+="]";
		return s;
	}
	public void addFirst(E data){
		if (first == null){
			add(data);
		}
		Node<E> node = new Node<E>(data);
		Node<E> temp = node;
		temp.next = first;
		first = node;
	}
	public void add(E data){
		Node<E> node = new Node<E>(data);
		if (first == null){
			first = node;
			last = node;
			size++;
			return;
		}
		last.next = node;
		last = node;
		size++;
	}
	public E get(int index){
		int i = 0;
		if (index == 0){
			return first.data;
		}
		if (index == size-1){
			return last.data;
		}
		if (index >= size){
			
			throw new IndexOutOfBoundsException(index + " out of bounds for list of size " + size);
		}
		Node<E> current = first;
		while (current != null){
			if (index == i){
				break;
			}
			current = current.next;
			i++;
		}
		return current.data;
	}
	public boolean contains(E data){
		Node<E> temp = first;
		while (temp != null){
			if (data.equals(temp.data)){
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	public int size(){
		return this.size;
	}
	//Fail-fast iterator
	private class Itera implements Iterator<E>{
		private final int iSize = size;
		private Node<E> temp = first;
		public void check(){
			if (this.iSize < size){
				throw new ConcurrentModificationException("Cannot modify list while iterating");
			}
		}
		public boolean hasNext(){
			check();
			if (temp==null){
				return false;
			}
			return true;
		}
		public E next(){
			check();
			E var = temp.data;
			temp = temp.next;
			return var;
		}
	}
	public Iterator<E> iterator(){
		return new Itera();
	}
}
class M7{
	public static void main(String[] args){
		LinkedList<String> list = new LinkedList<>();
		list.add("abc");
		list.add("efg");
		list.add("ijk");
		list.add("mno");
		list.add("qrs");
//		list.add(10);
//		list.add(23);
//		list.add(40);
//		list.add(50);
//		list.add(60);
		System.out.println(list);
		System.out.println(list.get(5));
		System.out.println("Size of the Linkedlist : " + list.size());
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		list.add("tuv");
//		list.addFirst(70);
		System.out.println(list);
		System.out.println(list.contains("abc"));
		System.out.println(list.contains("xyz"));
//		System.out.println(list.contains(70));
//		System.out.println(list.contains(80));
	}
}
