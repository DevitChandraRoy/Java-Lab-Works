
package ConstructorClass;


public class ConstructorTest {
    public static void main(String[] args) {
        Constructor obj1 = new Constructor();
        Constructor obj2 = new Constructor("Devit");
        
        Constructor obj3 = new Constructor("Devit","Male");
        Constructor obj4 = new Constructor("Devit","Male",50);
        //obj.Constructor();
        obj1.display();
        obj2.display();
        obj3.display();
        obj4.display();
    }
    
}
