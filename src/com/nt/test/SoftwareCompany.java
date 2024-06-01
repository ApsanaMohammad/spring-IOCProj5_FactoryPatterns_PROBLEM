package com.nt.test;
import com.nt.comp.Food;
import com.nt.comp.Employee;
public class SoftwareCompany {

	public static void main(String[] args) {
		//software company need employee
				Food food=new Food();
			    Employee st=new Employee(food);
				st.work();

	}

}

/*
 * USING THIS CODE
 * BUDEN ON CLIENT
 * AND MAKE CODE TIGHT COUPLING
 * TO OVERCOME THIS
 * WE USE FACTORY METHODS 
 * */
