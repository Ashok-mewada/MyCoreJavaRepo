// classes and objects


// public class Oops {
//     public static void main(String[] args) {
//         Person p1=new Person();
//         p1.age=21;
//         p1.name="Ashok";
//         System.out.println(p1.age+" "+p1.name);
//         p1.eat();
//         p1.walk();
//         p1.walk(5);
//     }
// }
//  class Person {
//         String name;
//         int age;

//         void walk()
//         {
//           System.out.println(name+ " is walking");  
//         }
//         void eat()
//         {
//             System.out.println(name + " is eating");
//         }
//         void walk(int steps)
//         {
//             System.out.println(name +" walked steps "+steps);

//         }

//     }


// Constructer &this keyword & static

//     public class Oops {
//     public static void main(String[] args) {
//         Person p1=new Person();
//         p1.age=21;
//         p1.name="Ashok";
        
//         Person p2=new Person(23, "Ashish ");
//         System.out.println(Person.count);
//     }
// }
//  class Person {
//     static int count;
//         String name;
//         int age;
//         public Person(){
//             count++;
//             System.out.println("its an constructor");
//         }
//         public Person(int age ,String name ){
//             this();
//            this.name=name;
//             this.age=age;   
//         }
//         void walk(int steps)
//         {
//             System.out.println(name +" walked steps "+steps);

//         }

//     }

    //Inheritance and run-time polymorphism
    
// public class Oops {
//     public static void main(String[] args) {
//         Person p1=new Person();
//         p1.age=21;
//         p1.name="Ashok";
//         p1.walk(5);
//            Person p2=new Person(23, "Ashish ");
//         Developer d1=new Developer(34, "Kuldeep");
//         d1.walk();
//         d1.doWork();
//     }
// }
//  class Person {
//         String name;
//         int age;

//           public Person(int age ,String name ){
//             this();
//             this.name=name;
//             this.age=age;   
//         }
//         public Person() {
//         }
//         void walk()
//         {
//           System.out.println(name+ " is walking");  
//         }
//         void eat()
//         {
//             System.out.println(name + " is eating");
//         }
//         void walk(int steps)
//         {
//             System.out.println(name +" walked steps "+steps);

//         }
//         void doWork()
//         {
//             System.out.println("is working");
//         }

//     }
//     class Developer extends Person{
//         public Developer(int age,String name) {
//             super(age,name);
           
//         }
//         void doWork()
//         {
//             System.out.println(age+" "+name+" "+"is working");
//         }

//     } 

// Encapsulation

import Encapsulation.EncapsulationIntro;

public class Oops {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.age=21;
        p1.name="Ashok";
        p1.walk(5);
           Person p2=new Person(23, "Ashish ");
           p2.eat();
        Developer d1=new Developer(34, "Kuldeep");
        d1.walk();
        d1.doWork();

       EncapsulationIntro obj=new EncapsulationIntro();
       obj.doWork();

    }
}
 class Person {
        String name;
        int age;

          public Person(int age ,String name ){
            this();
            this.name=name;
            this.age=age;   
        }
        public Person() {
        }
        void walk()
        {
          System.out.println(name+ " is walking");  
        }
        void eat()
        {
            System.out.println(name + " is eating");
        }
        void walk(int steps)
        {
            System.out.println(name +" walked steps "+steps);

        }
        void doWork()
        {
            System.out.println("is working");
        }

    }
    class Developer extends Person{
        public Developer(int age,String name) {
            super(age,name);
           
        }
        void doWork()
        {
            System.out.println(age+" "+name+" "+"is working");
        }

    } 