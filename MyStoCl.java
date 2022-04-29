package canni.cold;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class MyStoCl {
	 //bean or pojo
		@Id   //primary key made
		
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
		//for select toString method which gives obj instead of obj src
		@Override
		public String toString() {
			return "MyStoCl [id=" + id + ", name=" + name + "]";
		}
}
