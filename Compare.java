package ComparableInt;
//compareto(object obj) can be used to sort elements on the basis of single element only 
//public int compareTo(Object obj): It is used to compare the current object with the 
//specified object. It returns: -
//positive integer, if the current object is greater than the specified object.
//negative integer, if the current object is less than the specified object.
//zero, if the current object is equal to the specified object.

public class Compare implements Comparable<Compare>{  
	int rollno;  
	String name;  
	int age;  
	Compare(int rollno,String name,int age){  
	this.rollno=rollno;  
	this.name=name;  
	this.age=age;  
}  
	  
public int compareTo(Compare st){  
	if(age==st.age)  
	return 0;  
	else if(age>st.age)  
	return 1;  
	else  
	return -1;  
}  
}  