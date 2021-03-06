package Cushi.pack;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MyAliasCl {
	//bean or pojo
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
			return "MyAliasCl [id=" + id + ", name=" + name + "]";
		}

}
