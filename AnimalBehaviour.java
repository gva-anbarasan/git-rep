/*@Comments  Java IngeritanceObj
1. Can you model a butterfly?
	a. A butterfly can fly
	b. A butterfly does not make a sound
2. Can you optimize your model to account for the metamorphosis from caterpillar to
butterfly?
	a. A caterpillar cannot fly
	b. A caterpillar can walk (crawl)
*/

class Animal{
   void walk()
   {
      System.out.println("Buttefly don’t walk");
   }
}

class Butterfly extends Animal
{
   void fly()
   {
      System.out.println("I am flying");
	  
   }

   void swim()
	{
	System.out.println("I am swiming");
	}

    void sing()
   {
      System.out.println("Buttefly don’t sing");
   }

   void sound()
	{
	System.out.println("butterfly does not make a sound");
	}


  
	}
public class JavaInheritance1
{

   public static void main(String args[])
   {

     Butterfly butteObj = new Butterfly();
     butteObj.walk();
     butteObj.fly();
     butteObj.sing();
	 butteObj.swim();
	 butteObj.sound()
	
   
   }
}