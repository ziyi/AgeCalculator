# Age-Calculator
An answer to the age calculation question in Test 1.

Here's the question:

Upload a Java program that performs the following:

1. Get the current year using the following code:

   ```java
   int year = LocalDate.now().getYear();
   ```

   **Note** that you must import the LocalDate class:
   
   ```java
   import java.time.LocalDate;
   ```

1. Ask the user for their age.
2. Ask the user for another year.
3. Calculate the user's age in the year retrieved in the previous step.
4. Display the user's age in this year.

For example, suppose the current year is 2015 and the user enters 20 for their age and 2020 for the other year. You program should display 25, that is, the user will be 25-years-old in the year 2020.

**HINT**: The user should be allowed to enter years in the past. For example, in the above example, suppose the user enters 2010 instead of 2020. In this case, your program should output 15.

**HINT**: Valid ages are non-negative.
