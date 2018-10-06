/*@Comments  Java IngeritanceObj
1.implement the sing() method for the bird
2. Now, we have 2 special kinds of birds: the Duck and the Chicken... Can you
implement them to make their own special sound?
	a. A duck says: “Quack, quack”
	b. A duck can swim
	c. A chicken says: “Cluck, cluck”
	d. A chicken cannot fly (assumption: its wings are clipped but ignore that)
3. Now how would you model a rooster?
	a. A rooster says: “Cock-a-doodle-doo”
	b. How is the rooster related to the chicken?
	c. Can you think of other ways to model a rooster without using inheritance?
4. Can you model a parrot? We are specifically interested in three parrots, one that
lived in a house with dogs one in a house with cats, the other lived on a farm next to
the rooster.
	a. A parrot living with dogs says: “Woof, woof”
	b. A parrot living with cats says: “Meow”
	c. A parrot living near the rooster says: “Cock-a-doodle-doo”
	d. How do you keep the parrot maintainable? What if we need another parrot
	lives near a Duck? Or near a phone that rings frequently?
*/

class Animal{
   void walk()
   {
      System.out.println("I am walking");
   }
}

class Bird extends Animal
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
      System.out.println("I am singing");
   }

   void duck()
	{
	  System.out.println("Quack, quack");
	}

	void chicken()
	{
	   System.out.println("Quack, quack");
	  
	}

	void rooster()
	{
		System.out.println("Cock-a-doodle-doo");
	}

	void parrot()
	{
	System.out.println("Woof, woof");
	}
}
public class JavaInheritance1
{

   public static void main(String args[])
   {

     Bird bird = new Bird();
     bird.walk();
     bird.fly();
     bird.sing();
	 bird.swim();
	 bird.duck();
	 bird.rooster();
	 bird.parrot();
   
   }
}