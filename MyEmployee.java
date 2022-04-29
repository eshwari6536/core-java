package com.ranen;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class MyEmployee {
@Id
private int eid;
private String ename;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid=eid;
	
}
public String getEname() {
	return ename;
	
}
public void setEname(String ename) {
	this.ename=ename;
}
}
