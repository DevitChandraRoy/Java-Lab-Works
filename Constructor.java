
package ConstructorClass;


public class Constructor {
    String name,gender;
    int age;
    Constructor()
    {
        System.out.println("No informatin. ");
    }
    Constructor(String n)
    {
        this.name =  n;
    }
    Constructor(String n,String g)
    {
        this.name =  n;
        this.gender = g;
    }
    Constructor(String n,String g,int age)
    {
        this.name =  n;
        this.gender = g;
        this.age = age;
    }
    
    void display()
    {
        System.out.println("Name "+name+" Gender "+ gender + " age "+ age);
    }
}
