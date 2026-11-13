**1. Array operations**



Initial array:

\[10, 20, 30, 40, 50]



Step 1: Insert 25 at index 2



Elements from index 2 onward shift right:



\[10, 20, 25, 30, 40, 50]



Step 2: Delete element at index 0



Remove 10:



\[20, 25, 30, 40, 50]



Step 3: Left rotate by 2 positions



Move the first two elements 20, 25 to the end:



\[30, 40, 50, 20, 25]



Final answer: \[30, 40, 50, 20, 25]



**2. Linear search for 19**



Array:

\[5, 12, 8, 19, 3, 27]



Searching for 19:



| Step | Index checked | Value | Result    |

| ---- | ------------- | ----- | --------- |

| 1    |             0 |     5 | Not found |

| 2    |             1 |    12 | Not found |

| 3    |             2 |     8 | Not found |

| 4    |             3 |    19 |   Found   |





Answer: 19 is found at index 3.



**3. Binary search for 15**



Sorted array:

\[2, 4, 7, 10, 15, 20, 22]



Indices:

0 1 2 3 4 5 6



Searching for 15.



Step 1:

* low = 0
* high = 6
* mid = (0 + 6) / 2 = 3
* array\[3] = 10



Since 15 > 10, search the right half.



Step 2:

* low = 4
* high = 6
* mid = (4 + 6) / 2 = 5
* array\[5] = 20



Since 15 < 20, search the left half.



Step 3:

* low = 4
* high = 4
* mid = (4 + 4) / 2 = 4
* array\[4] = 15



Found at index 4.



| Step | Low | High | Mid |    Value |

| ---- | --- | ---- | --- | -------- |

| 1    |   0 |    6 |   3 |       10 |

| 2    |   4 |    6 |   5 |       20 |

| 3    |   4 |    4 |   4 | 	15 ✓ |



**4. Sparse triple representation**



Matrix:



D = \[\[0, 0, 5],

&#x20;    \[0, 8, 0],

&#x20;    \[3, 0, 0],

&#x20;    \[0, 0, 0]]



Non-zero elements in row-major order:



* 5 → row 0, column 2
* 8 → row 1, column 1
* 3 → row 2, column 0



Therefore, the sparse representation is:



(0, 2, 5)

(1, 1, 8)

(2, 0, 3)



Answer: \[(0,2,5), (1,1,8), (2,0,3)]



If your class uses 1-based indexing, the triples would be (1,3,5), (2,2,8), (3,1,3). The question's convention should be checked.



**5. Full vs sparse representation**



Matrix D has:



4 rows × 3 columns = 12 values



So, full 2D representation stores 12 values.



There are only 3 non-zero values.



Sparse representation therefore stores:



3 triples × 3 values per triple = 9 values



| Representation | Values stored |

| -------------- | ------------	 |

| Full 2D        |        12	 |

| Sparse         |         9	 |





Answer: Full representation = 12 values, sparse representation = 9 values (excluding the row/column count header).
