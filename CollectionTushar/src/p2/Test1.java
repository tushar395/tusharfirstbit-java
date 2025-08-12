package p2;

import java.util.*;

import p1.Student;

class RollComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		return s1.getRollno()-s2.getRollno();
	}
}


class NameComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		
	    String t1=s1.getName();
	    String t2=s2.getName();
		return t1.compareTo(t2);
	}
	
}

class MarkComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		return s1.getMarks()-s2.getMarks();
	}
	
}


class Test1{
	public static void main(String[] args)
	{
		 Scanner sc=new Scanner(System.in);
		 int choice = 0;
		 ArrayList<Student> a1=new ArrayList<Student>();
//	     Student s1=new Student(2,"Akki",50);
//	     Student s2=new Student(3,"Aboli",60);
//	     Student s3=new Student(4,"Mrunmayee",70);
//	     Student s4=new Student(1,"Mansi",55);
//	     
//	     a1.add(s1);
//	     a1.add(s2);
//	     a1.add(s3);
//	     a1.add(s4);
		 
	do {
		System.out.println("1.add student");
		System.out.println("2.sortby rollno");
		System.out.println("3.sort by name");
		System.out.println("4 sort by marks");
		System.out.println("5.remove student");
		System.out.println("6.update Student");
		System.out.println("7.exit");
		System.out.println("enter your choice");
		choice=sc.nextInt();
     switch (choice) 
      {
     case 1:
		 System.out.print("Enter roll number: ");
         int roll = sc.nextInt();
         sc.nextLine(); // consume newline
         System.out.print("Enter name: ");
         String name = sc.nextLine();
         System.out.print("Enter marks: ");
         int marks = sc.nextInt();
         a1.add(new Student(roll, name, marks));
         System.out.println(a1);
         break;
     case 2:
    	 RollComparator rc=new RollComparator(); 
    	 Collections.sort(a1, rc);
         System.out.println("Sorted by name:");
         for (Student s : a1) System.out.println(s);
     case 3:
//   	 NameComparator nc=new NameComparator();    
//	     Collections.sort(a1,nc);
//	     System.out.println("sorted by name"+a1);
//    	 break;
    	 NameComparator nc=new NameComparator(); 
    	 Collections.sort(a1, nc);
         System.out.println("Sorted by name:");
         for (Student s : a1) System.out.println(s);//for each studdent object in arraylist 
         break;
     case 4:
    	 MarkComparator mc=new MarkComparator(); 
    	 Collections.sort(a1, mc);
         System.out.println("Sorted by name:");
         for (Student s : a1) System.out.println(s);
         
     case 5:
    
    	    System.out.print("Enter roll number to remove: ");
    	    int rno = sc.nextInt();
    	    boolean found = false;

    	    for (int i = 0; i < a1.size(); i++) {
    	        if (a1.get(i).getRollno() == rno) {  //  student index rollno
    	            a1.remove(i); // directly remove from ArrayList
    	            found = true;
    	            System.out.println("Student removed.");
    	            break;
    	        }
    	    }

    	    if (!found) {
    	        System.out.println("Student not found.");
    	    }
    	    break;
   
     case 6:
    	    System.out.println("Enter roll number to update:");
    	    int rollToUpdate = sc.nextInt();
    	    sc.nextLine(); // clear the newline
    	    boolean studentFound = false;

    	   
    	    for (Student s : a1) {
    	        if (s.getRollno() == rollToUpdate) {
    	         
    	            System.out.println("Enter new name:");
    	            String newName = sc.nextLine();

    	            System.out.println("Enter new marks:");
    	            int newMarks = sc.nextInt();

    	            s.setName(newName);
    	            s.setMarks(newMarks);

    	            System.out.println("Student updated successfully.");
    	            studentFound = true;
    	            break;
    	        }
    	    }

    	   
    	    if (!studentFound) {
    	        System.out.println("No student found with that roll number.");
    	    }
    	    break;

     case 7:
    	 System.out.println("exit");
      default:
    	  System.out.println("invalid choice");
      }}while(choice!=4);
	sc.close();
	
	}
}
       
	
       
	
	


//      RollComparator r1=new RollComparator();
//       Collections.sort(a1,r1);
//       System.out.println("sorted by rollno"+a1);
//	     NameComparator nc=new NameComparator();
//	     Collections.sort(a1,nc);
//	     System.out.println("sorted by name"+a1);
//        MarkComparator m1=new MarkComparator();
//        Collections.sort(a1,m1);
//        System.out.println("sorted by marks"+a1);