package basic;

import java.util.Arrays;
import java.util.Comparator;
// s1-s2  ascending order kam se jyada ki taraf jaane ke liye
class custom_comparator implements Comparator<Student>{
	public int compare(Student s1,Student s2) {
		return s1.rollno-s2.rollno;
	}
}
// custom class
class Student{
	int rollno;
	String name;
	Student(int roll,String name){
		rollno=roll;
		this.name=name;
			}
	}
 class CustomOperator {

	public static void main(String[] args) {
		Student arr[]=new Student[5];
		arr[0]=new Student(87,"Gauri");
		arr[1]=new Student(34,"Anu");
		arr[2]=new Student(5,"Krish");
		arr[3]=new Student(6,"Aly");
		arr[4]=new Student(8,"Kavi");
		
		Arrays.sort(arr,new custom_comparator());
		System.out.println();
	    for(int i = 0;i<5;i++){
			System.out.println(arr[i].rollno+" "+ arr[i].name);	
		}
	}
 }
		