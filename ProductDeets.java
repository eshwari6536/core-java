package yaya.g;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;

class Products implements Comparable<Products>{
	int pid;
	String pname;
	String brand;
	int amt;
	public Products(int pid, String pname, String brand, int amt) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.brand = brand;
		this.amt = amt;
	}
	@Override
	public int compareTo( Products pd) {
		// TODO Auto-generated method stub
		 return this.pid - pd.pid;
	}
	class AmountCompare implements Comparator<Products>
	{
	    public int compare( Products m1, Products m2)
	    {
	        if (m1.amt < m2.amt) return -1;
	        if (m1.amt > m2.amt) return 1;
	        else return 0;
	    }
	}
	 
	// Class to compare Movies by name
	class NameCompare implements Comparator<Products>
	{
	    public int compare(Products m1, Products m2)
	    {
	        return m1.pname.compareTo(m2.pname);
	    }
	}
	class BrandCompare implements Comparator<Products>
	{
	    public int compare(Products m1, Products m2)
	    {
	        return m1.brand.compareTo(m2.brand);
	    }
	}

	
}
public class ProductDeets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Products pd1=new Products(123, "tray", "COSMOS", 230) ;
		Products pd2=new Products(121, "trolley", "LEGO", 2130);
		Products pd3=new Products(124, "toy-car", "MAMAME", 530);
		Products pd4=new Products(125, "dye", "GOODREJ", 130);
		Vector<Products> ps=new Vector<Products>();
		 ps.add(pd1);
		 ps.add(pd2);
		 ps.add(pd3);
		 ps.add(pd4);
		 Collections.sort(ps);
		 System.out.println("PRODUCT_ID\t\tPRODUCT_NAME\t\tBRAND\t\tAMOUNT");
		 Iterator<Products> it =ps.iterator();
		 
		while(it.hasNext()) {
			Products ob2=(Products) it.next();
			
			System.out.println(ob2.pid+"\t\t\t"+ob2.pname+"\t\t\t"+ob2.brand+"\t\t"+ob2.amt);
	}

	}
}
