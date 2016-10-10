package com.book.oops.generics;

public class Pair<K, V> {
	
	K key;
	V value;
	
	public void set(K k , V v){
		key = k;
		value = v;
	}
	
	public K getKey(){
		return key;
	}

	public V getValue(){
		return value;
	}
	
	public String toString(){
		return "["+getKey()+","+getValue()+"]";
	}
	
	public static void main(String[] args){
		
		Pair<String, Integer> pair1 = new Pair<String, Integer>();
		pair1.set(new String("height"), new Integer(36));
		System.out.println(pair1);
		
		Pair<Student, Double> pair2 = new Pair<Student, Double>();
		pair2.set(new Student("I077564", "Chandan Kumar", 22), new Double(9.5));
		System.out.println(pair2);
		
		Trio<String, Integer, Person> trio = new Trio<String, Integer, Person>();
		trio.set("String", 10, new Person() {
			
			@Override
			public String getName() {
				// TODO Auto-generated method stub
				return "SomeName";
			}
			
			@Override
			public int getAge() {
				// TODO Auto-generated method stub
				return 20;
			}
			
			@Override
			public boolean equalTo(Person other) {
				// TODO Auto-generated method stub
				return false;
			}
		});
		
		trio.toString();
		
	}
}


class Trio<A, B, C> {
	
	A first;
	B second;
	C third;
	
	public void set(A f, B s, C t) {
		first = f;
		second = s;
		third = t;
	}
	
	public A getFirst() {
		return first;
	}
	
	public B getSecond() {
		return second;
	}
	
	public C getThird() {
		return third;
	}
	
	public String toString() {
		return "["+first+second+third+"]";
	}
}



