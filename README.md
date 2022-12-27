# Sudoku

Using multithreads to validate a 9x9 sudoku grid. 
1 thread to validate each of the 8 sub grids. 
1 thread validates all columns, and 1 thread validates all rows. 

To run: 
javac Sudoku.java
java Sudoku sudoku.txt
