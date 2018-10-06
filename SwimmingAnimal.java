/*@Comments  Java IngeritanceObj
1. In addition to the birds, can you model a fish?
	a. Fishes don’t sing
	b. Fishes don’t walk
	c. Fishes can swim
2. Can you specialize the fish as a Shark and as a Clownfish?
	a. Sharks are large and grey
	b. Clownfish are small and colourful (orange)
	c. Clownfish make jokes
d. Sharks eat other fish
	3. Dolphins are not exactly fish, yet, they are good swimmers
	a. Can you model a dolphin that swims without inheriting from a fish class?
	b. How do you avoid duplicating code or introducing unneeded overhead?
*/

class Animal{
   void walk()
   {
      System.out.println("Fishes don’t walk");
   }
}

class Fish extends Animal
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
      System.out.println("Fishes don’t sing");
   }

  
	}
public class JavaInheritance1
{

   public static void main(String args[])
   {

     Fish fish = new Fish();
     fish.walk();
     fish.fly();
     fish.sing();
     fish.swim();
	
   
   }
}
