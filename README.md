# FizzBuzz - TDD
Fizz Buzz is a simple game used to teach elementary school kids division, but it is also often used as a computer programming exercise.

## The Rules (Requirements)
* Only positive numbers are allowed, so if the number is negative, the program should not say anything
* If a number is not evenly divisible by 3 or 5, the program should not say anything
* If a number is evenly divisible by 3, the program should say "Fizz"
* If a number is evenly divisible by 5, the program should say "Buzz"
* If a number is evenly divisible by both 3 and 5, the program should say "Fizz Buzz"

## Goals
* Look for ways to build code iteratively
  * You might be tempted to solve the whole thing and then write unit tests – don’t! 
* Get more comfortable with TDD and Unit Testing!
  * This is a relatively simple problem, but we want to learn more about unit testing, building on last month’s exercise
  * You should have at least one unit test for each requirement
* Try not to use the debugger or things like console.log/println statements
  * This is a simple enough problem that if you build it iteratively and have good unit tests, you should not need to do any debugging

## Recommended Unit Tests
You should implement at least the following unit tests – but you may add others as you see fit.
* -3 returns empty string (even though this is evenly divisible by 3, it is negative)
* 13 returns empty string (sanity check – it has the number 3, but is not evenly divisible by 3 or 5)
* 3 returns "Fizz"
* 21 returns "Fizz"
* 5 returns "Buzz"
* 40 returns "Buzz"
* 15 returns "Fizz Buzz"

## Part 2
Now that we have a solid set of unit tests, let's add some new requirements!
* All requirements from Part 1 still apply
* If a number is evenly divisible by 7, the program should say "Bazz"
* If a number is evenly divisible by 8, the program should say "Bozz"
* For all the different combinations of 3, 5, 7, 8, return a string containing the appropriate words, ordered by the divisor – for example:
  * 21 (3, 7) -> "Fizz Bazz"
  * 56 (7, 8) -> "Bazz Bozz"
  * 280 (5, 7, 8) -> "Buzz Bazz Bozz"
  * 840 (3, 5, 7, 8) -> "Fizz Buzz Bazz Bozz"

### TDD Considerations
Note that some of the unit tests from Part 1 will continue to succeed, but some may fail because of the new requirements.

Before you begin changing/writing code, think about this in a TDD fashion. Consider how you might update tests for the new requirements, so that you can then confidently make changes in the code without fear of breaking existing functionality.

Assuming a good test suite, you should be able to update existing tests to match the new requirements, and write new tests for the new requirements.

### Existing Unit Tests
Existing Unit Tests to Update
Assuming you implemented these tests in Part 1, you should first update their expectations for Part 2
* 21 returns "Fizz"
  * Now should be "Fizz Bazz" (divisible by 3 and 7)
* 40 returns "Buzz"
  * Now should be "Buzz Bozz" (divisible by 5 and 8)

These tests should be updated before any other coding is started. We know that the new requirements make these test cases invalid, and after updating the tests, these should fail. This is expected and ok!

### New Unit Tests
These tests should be new for Part 2, and should exercise many of the different new combinations that can occur – but consider what other tests you might need (hint hint)!
* 24 returns "Fizz Bozz"
* 35 returns "Buzz Bazz"
* 56 returns "Bazz Bozz"
* 105 returns "Fizz Buzz Bazz"
* 120 returns "Fizz Buzz Bozz"
* 168 returns "Fizz Bazz Bozz"
* 280 returns "Buzz Bazz Bozz"

# C3ProjectTemplate
-   [C#](Templates/C%23) - [Microsoft Visual Studio](https://visualstudio.microsoft.com/vs/community/)
-   [Java](Templates/Java) - [IntelliJ Idea](https://www.jetbrains.com/idea/download) (Community Edition is fine)
-   [JavaScript](Templates/JavaScript) - [Microsoft Visual Studio Code](https://code.visualstudio.com/)
-   [Kotlin](Templates/Kotlin) - [IntelliJ Idea](https://www.jetbrains.com/idea/download) (Community Edition is fine)
-   [Python](Templates/Python) - [Pycharm](https://www.jetbrains.com/pycharm/download/?section=windows) (Community Edition is fine)
-   [TypeScript](Templates/TypeScript) - [Microsoft Visual Studio Code](https://code.visualstudio.com/)
