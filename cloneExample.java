class cloneExample implements Cloneable{  
int rollno;  
String name;  
  
cloneExample(int rollno,String name){  
this.rollno=rollno;  
this.name=name;  
}  
  
public Object clone()throws CloneNotSupportedException{  
return super.clone();  
}  
  
public static void main(String args[]){  
try{  
	cloneExample s1=new cloneExample(532,"Koushik");  
  
	cloneExample s2=(cloneExample)s1.clone();  
  
System.out.println(s1.rollno+" "+s1.name);  
System.out.println(s2.rollno+" "+s2.name);  
  
}catch(CloneNotSupportedException c){}  
  
}  
}  
