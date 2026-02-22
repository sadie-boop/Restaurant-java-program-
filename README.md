# Restaurant Class Ideas

### Properties 
- int waitTime
- double rating
- double avgPrice
- double distance
- String hoursOpen
 <!--menu items (Type?) --> 
 # What did I learn 
  ## Object-Oriented Programming Foundations (The Big Three)
- The three foundational concepts of OOP covered, which appear on tests and interview questions:
- Encapsulation — setting data fields to private so other classes can't directly access or change them, protecting the data
- Inheritance — every Java class automatically inherits from the base Object class, getting default behaviors like hashCode() and toString()
- Polymorphism — overriding inherited methods (like toString()) to give them new behavior specific to your class; "many forms" of the same method
## Getters and Setters (Accessors and Mutators)
- Why private fields require getters and setters — without them, no outside class can read or change the restaurant's data
- Getters (accessors) return the value of a private field; setters (mutators) update it
- IntelliJ can auto-generate getters and setters so you don't have to write them all manually
- These are considered "boilerplate" code — they always follow the same structure
## Overriding toString()
- By default, printing a restaurant object just outputs its class name and a hash code (meaningless output)
- Overriding toString() lets you define exactly what a restaurant looks like as text
- Used @Override annotation and return to build a formatted string using the class's own private variables (no getters needed since you're inside the class itself)
## Taking User Input to Build an Object
- Used JOptionPane.showInputDialog() to prompt the user for each restaurant property
- All JOptionPane input comes in as a String, so numeric fields (wait time, rating, price, distance) required Integer.parseInt() or Double.parseDouble() to convert them
- Took all those input variables and passed them into the restaurant constructor to instantiate a new object (new Restaurant(name, waitTime, rating, ...))
- Variable naming matters — calling it userRestaurant signals to other programmers that its values came from user input
## ArrayLists
- A regular array has a fixed size set at creation; an ArrayList grows automatically as you add items — making it better for an ongoing list of restaurants
- Syntax: ArrayList<Restaurant> restaurantList = new ArrayList<>();
- The angle brackets (<Restaurant>) are called generics — they specify what type of object the list holds
- Used .add(userRestaurant) to add the newly created restaurant object to the list
- All elements in an ArrayList must be the same type
## Output Formatting
- Labels on output matter for readability — printing raw values without labels is meaningless to the user
- Used \n (newline character) and \t (tab character) inside the toString() method to organize output neatly
- Alignment takes testing and iteration to get right



 
