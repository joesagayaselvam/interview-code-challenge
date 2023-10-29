# code-challenge
There are two parts in Technical Exercise:
 - Part1 : With any integer, show the roman numeral
 - Part2 : With any roman numeral, show the integer

# Project Details
- Maven project
- Java 11

# Process followed
- Test Driven Development is followed.
- Wrote automated test cases beforehand based on the acceptance criteria.
- In the TDD framework, only when the test fails, it suggests writing new code which prevents code duplication.
- In this case, it's a new implementation, So source code is developed to satisfy the test cases.

# Steps to execute this project
- Clone the repo : https://github.com/joesagayaselvam/interview-code-challenge.git
- Configure in your preferred IDE (I used IntelliJ IDEA)
- Run the JUnit testcases mentioned in 'Testcase and run results'.

# Testcase and run results
- NumberToRomanNumeralTestResult
- RomanNumeralToNumberTestResult
- Results are printed in the console (used few randomly picked number).
- Testcase coverage: Both happy path and negative scenarios were covered.
- NumberToRomanNumeralTest
  1. testRomanNumerals_BetweenOneAndThreeThousand()
  2. testRomanNumerals_MoreThanThreeThousand()
  3. testRomanNumerals_NegativeNumbers()
- RomanLettersToNumberTest
    1. testNumerals_BetweenOneAndThreeThousand()
    2. testNumerals_GreaterThanThreeThousand()
- Screenshots attached for reference
- Any valid number () can be provided in the Testcase file for any further verification.

# Status of the Technical Exercise
- Both part 1 and 2 have been completed. 
- For evidence : Screenshots have been attached in the 'document' directory of the project.