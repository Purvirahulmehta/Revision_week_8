package programme_26_encapsulation;


public class Encapsulate {
    //private variables declared these can only be accessed by public method of class
    private String name;
    private int rollNo;
    private int age;
    //set method for name access private variable name
    public void setName(String name){
        this.name= name;
    }
    //get method for name access private variable age
    public String getName(){
        return name;
    }
    //set method for roll to access the private variable rollNum
    public void setRollNo(int rollNo){
        this.rollNo=rollNo;
    }
    //get method for roll to access private variable rooNum
    public int getRollNo(){
        return rollNo;
    }
    //set method for age to access the private variable age
    public void setAge(int age){
        this.age=age;
    }
    //get method to access the private variable age
    public int getAge(){
        return age;
    }
}
