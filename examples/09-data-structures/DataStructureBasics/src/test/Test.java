package test;

import java.util.ArrayList;

import javax.print.attribute.standard.Copies;

public class Test {

	public static void main(String[] args) {
		ArrayList<Company> list = new ArrayList<Company>();
		list.add(new Company("HP", 2000));
		list.add(new Company("Ubisoft", 10000));
		list.add(new Company("BPB", 3000));
		
		Company temp = new Company("", 0);
		int tempIndex = 0;
		
		for (int i = 0; i < list.size(); i++) {
			if(temp.getCount() < list.get(i).getCount()){
				temp = list.get(i);
				tempIndex = i;
			}
		}
		list.remove(tempIndex);
		
		for (int i = 0; i < list.size(); i++) {
			
		System.out.println(list.get(i).getName());
			
		}

 
	}

}
