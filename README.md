Previous challenges not included because they only included the basics of Java
______________________________
22  - Dog years -
We think that one dog year is equal to 7 human years. That's not true, on average the first dog year is equal to 15 human years, the second dog year is equal to 9 human years, from the third to the sixth each is equal 4 human years and every next year after that is equal to 5 human years.
If you know how old is your dog in dog years, calculate how old it is human years.

Write a function named dogYears that given a natural number N from input representing the years of your dog. Return how old is your dog in human years.

Input:
2
Output:
24

Input:
4
Output:
32

Explanation #1: 2 dog years are equal to 15 + 9 = 24 human years
Explanation #2: 4 dog years are equal to 15 + 9 + 4 + 4 = 32 human years

______________________________
23  - Anagrams -
For two numbers we say that they are anagrams if the digits of the first number can be rearranged, so that we get the second number. For ex. 123 is an anagram of 231, because they are the same digit in a different order. 

Write a program that gets a natural number N from input. In the next N lines you have two numbers, A and B. Output how many of those pairs of numbers are anagrams

Input:
3
123 231
4567 6574
2345 2874
Output:
2

______________________________
24  - Walking -
John wants to walk 10.000 steps every day, so he could be healthy. But unfortunately, today his pedometer (app for counting steps) doesn't work.
John already measured that he walked X minutes and ran Y minutes, but he is sure that he still hasn't achieved his 10.000 steps mark.

Write a program that will calculate how many more steps does John need to make to achieve his goal if you know that when he is walking he makes 2 steps in a second, while when he is running he is making 4 steps in a second.
Write a function named steps that given two natural numbers X and Y from input. Output the remaining steps John needs to make to achieve his goal

Input
15 25
Output
2200

Input:
26 22
Output:
1600

______________________________
25  - Football -
In the games of football, the winner is awarded 3 points, the loser is not awarded any points and if the match is a draw, both teams get 1 point each. 

Write a program that gets a natural number N from input. In the next N lines there are three numbers W, D, L representing the wins, draws and loses of the specific team respectively. Output the number of points that the team with most points has.

Input:
3
4 0 1
2 0 2
0 1 4
Output:
12

______________________________
26  - Winter number -
We call a number a winter number in two cases:

if it's a palindrome (reads the same backward or forward)
is divisible by all of its digits
For ex. 
505 and 1331 are winter numbers. They are both palindromes.
12 is a winter number because it's divided by both 1 and 2.
*notice that a non-palindromic number containing zero cannot be winter number because division with zero is not allowed*\

Write a program that gets in the first line a number N. In the next N rows you're given N natural numbers. For every number output if it's a winter number. Output "YES" if it's a winter number, and "NO", otherwise.

Input:
2
505 1331
Output:
YES YES

Input:
3
12 9 340
Output:
YES YES NO

______________________________
27  - Chess -


