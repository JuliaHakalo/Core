package myEntry;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MyMap<K, V> {
	private Set<MyEntry<K, V>> set;

	public MyMap() {
		set = new HashSet<>();
	}

	public MyMap(Set<MyEntry<K, V>> set) {
		this.set = set;
	}

	public void put(K key, V value) {
		set.add(new MyEntry<K, V>(key, value));
	}

	public void removeByKey(K key) {
		Iterator<MyEntry<K, V>> iter = set.iterator();
		while (iter.hasNext()) {
			if (iter.next().getKey().equals(key)) {
				iter.remove();
				break;
			}
		}
	}

	public void removeByValue(V value) {
		Iterator<MyEntry<K, V>> iter = set.iterator();
		while (iter.hasNext()) {
			if (iter.next().getValue().equals(value)) {
				iter.remove();
				break;
			}
		}
	}

	public Set<K> keySet() {
		Set<K> keySet = new HashSet<>();
		Iterator<MyEntry<K, V>> iter = set.iterator();
		while (iter.hasNext()) {
			keySet.add(iter.next().getKey());

		}

		return keySet;

	}

	public List<V> valueList() {
		List<V> valueList = new ArrayList<>();
		Iterator<MyEntry<K, V>> iter = set.iterator();
		while (iter.hasNext()) {
			valueList.add(iter.next().getValue());
		}
		return valueList;

	}

	public void syso() {
		System.out.println(set);
	}


}
