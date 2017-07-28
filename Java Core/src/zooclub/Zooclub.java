package zooclub;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import less11.Person;

public class Zooclub implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2528516046622234570L;
	private Map<Person, List<Pet>> map;

	public Zooclub(HashMap<Person, List<Pet>> map) {
		this.map = new HashMap<>();
	}

	public Map<Person, List<Pet>> getMap() {
		return map;
	}

	public void setMap(Map<Person, List<Pet>> map) {
		this.map = map;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((map == null) ? 0 : map.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Zooclub other = (Zooclub) obj;
		if (map == null) {
			if (other.map != null)
				return false;
		} else if (!map.equals(other.map))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Zooclub [map=" + map + "]";
	}

}
