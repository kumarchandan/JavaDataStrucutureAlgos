package com.book.java.maps;

public interface IMap<K, V> {

	public int size();
	public boolean isEmpty();
	public V get(K k);
	public V put(K k, V v);
	public V remove(K k);
	public void keySet();
	
	
}
