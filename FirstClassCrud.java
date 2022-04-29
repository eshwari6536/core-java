package best.crud;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class FirstClassCrud {
	@Id   //primary key
	
	private int id;
	
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//for select toString method
	@Override
	public String toString() {
		return "FirstClassCrud [id=" + id + ", name=" + name + "]";
	}

}
