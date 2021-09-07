class Main {
  public static void main(String[] args) {
    // if ( condition to test ) 
    // boolean condition => evals to true or false 
    // if ( time <= 630am ) 
    // then I can go get caffeine 

    // if (condition)
      // statement to execute 
    // else if (condition 2)
      // statement to execute 

    // if (time <= 630 am)
      // go to farther away cofee shop 
    // else if (time > 630am && time <= 7am)
      //go to closer coffee shop 

    // if (condition)
      // statement to execute 
    // else 
      // statement to execute 

/*
    int age = 22; 
    if ( age >= 21 ) {
       System.out.println("You can go out to the bars");
    } 
    else if (age >= 18)
    {
      System.out.println("You can got to the clubs");
    }
    else {
      System.out.println("Sorry");
    }

*/
    // can't have a variable in between an if and an else statement

/*
    int age = 22; 
    if ( age >= 18 ) {
       System.out.println("You can go out to the bars");
    } 
    else if (age >= 21)
    {
      System.out.println("You can got to the clubs");
    }
    else {
      System.out.println("Sorry");
    }
*/

/*
    // if (condition) { 
      // if (condition 2) {
        //...
      // }
    // }

*/
/*
int age = 19; 
if (age >= 18) { 
  System.out.println("You can go to the clubs");
  if (age >= 21) {
    System.out.println("You can go out to the bars");
  }
  else {
    System.out.println("Sorry no bars yet");
  }
}
else {
  System.out.println("Sorry");
}

*/ 

// two different ideas: 
    // if (it's raining outside) 
      // go puddle jumping 
    // if (the trees are green)
      // go on a walk 
      

  /*
    int age = 22; 
    if ( age >= 18 ) {
       System.out.println("You can go out to the bars");
    } 
    if (age >= 21)
    {
      System.out.println("You can got to the clubs");
    }
    if (age < 18) {
      System.out.println("Sorry");
  */

  // switch statement 

/* Come back to this one 
  int age = 22; 
  switch (age) {
    case 1000:
    case 21: System.out.println("You can go to the bars"); 
          break;
    case 18: System.out.println("You can go out ot the clubs");
          break;
    default: System.out.println("Sorry");
  }
  */ 

  int day = 4; 
  // 1 = Sunday 2 = Monday... 
  switch (day) { 
    case 1: System.out.println ("It's Sunday!"); break; 
    case 2: System.out.println ("It's Monday!"); break;
    case 3: System.out.println ("It's Tuesday!"); break;
    case 4: System.out.println ("It's Wednesday!"); break;
    case 5: System.out.println ("It's Thursday!"); break;
    case 6: System.out.println ("It's Friday!"); break;
    case 7: System.out.println ("It's Saturday!"); break;
  }

  }
}