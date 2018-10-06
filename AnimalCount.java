/*@Comments  Java IngeritanceObj
	a. how many of these animals can fly?
	b. how many of these animals can walk?
	c. how many of these animals can sing?
	d. how many of these animals can swim?
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

public class AnimalCount
{

   public static void main(String args[])
   {

	Animal[] animals = new Animal[]{
	new Bird(),
	new Duck(),
	new Chicken(),
	new Rooster(),
	new Parrot(),
	new Fish(),
	new Shark(),
	new Clownfish(),
	new Dolhpin(),
	new Frog(),
	new Dog(),
	new Butterfly(),
	new Cat()
	};
  }

}