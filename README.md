# Problem statement

A palindrome is a word, phrase, number, or other sequence of units that can be read the same way in either direction, with general allowances for adjustments to punctuation and word dividers.
For a positive integer P of not more than 1000000 digits, write the value of the smallest palindrome larger than P to output. (Numbers are always displayed without leading zeros.)
Ensure that the assignment is submitted with working test cases

## Input 
The first argument is integer t which is the number of test cases. Followed by t number of positive integers.

## Output 
For each P, output the smallest palindrome larger than P.

### Example

```
Input 
2 
809 
2136
```

```
Output 
818 2222
```


## Getting Started

Clone this repo to your local machine using https://github.com/SushantAd/myRepo.git


## Prerequisites

* java jdk and/or any java ide.

##### For running test cases:
* junit.jar (v4.12)
* hamcrest-core.jar (v1.3)


## Running the Code:
We can run the code using 2 modes:
#### IDE:
For console inputs:
![Run NextPallindrome.java](nextPallindrome/images/img1.jpg)

```
Input 
2          --> No of test inputs 
809 
2136
```

For test values from File:
![Run NextPalindromeFileInput.java](nextPallindrome/images/img2.jpg)


#### Command Prompt:
For console inputs:
* javac NextPallindrome.java
* java NextPallindrome 

```
Input 
2          --> No of test inputs 
809 
2136
```

For test values from File:
* javac NextPalindromeFileInput.java
* java NextPalindromeFileInput 


## Test Cases

I have used JUnit to run the tests. We can run the testcases using 2 modes:

#### IDE
Run NextPallindromeTest.java 

![Run NextPallindromeTest.java](nextPallindrome/images/img3.jpg) 
 
#### Command Prompt

##### Compile:
* javac -cp junit-4.12.jar;. NextPallindromeTest.java

##### Run Java:
* java -cp junit-4.12.jar;hamcrest-core-1.3.jar;. org.junit.runner.JUnitCore NextPallindromeTest

#### Test cases will deal with the following use cases:

* Leading Zeroes
* Strings and Alpha numeric Values
* Negative Values
* Floating point Values
* Empty spaces in Input values (for console inputs)

## Acknowledgments

* Thanks to stackoverflow for the multiple ideas.

