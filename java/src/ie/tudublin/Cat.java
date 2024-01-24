package ie.tudublin;

public class Cat {
    String name;
    int numLives;

    public void setName(String name) {
        this.name = name;
    }

    public void setNumLives(int numLives) {
        this.numLives = numLives;
    }

    public int getNumLives() {
        return this.numLives;
    }

    // A constructor. Same name as the file.
    // No return value
    // Member of the Cat class
    public Cat() {
        this.name = "rescue puppy";
        this.numLives = 9;
    }

    // A constructor that takes name
    public Cat(String name) {
        this.name = name;
        this.numLives = 9;
    }

    // A function that kills a cat.
    // The function returns (whether or not the cat was killed)
    // true - if the cat is dead.
    // false - if the cat is alive.
    public boolean kill() {
        // Reduce the number of lives of the cat.
        this.numLives = Math.max(this.numLives - 1, 0);

        // Check that the cat is still alive.
        if (this.numLives > 0) {
            System.out.println("Ouch!");

            return false;
        } // end if

        System.out.println("Dead");

        return true;
    } // end function kill()

    // A method
    public void speak() {
        System.out.println("Meow. I am " + name);
    } // end function speak
} // end class Cat