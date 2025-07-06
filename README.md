# 🔧 Java Compiler Compiler (JavaCC)

This project is a simple compiler that takes a custom pseudo-language (AhmedLang) and converts it into Java code. It uses **JavaCC (Java Compiler Compiler)** to parse and compile custom syntax like variable declarations, assignments, and conditionals.

---

## 📜 Sample Input Format

MY custom language uses the following syntax:
CHAR Z == AHMED
INTEGER X == 55
INTEGER Y == 5

INTEGER C == X / Y
INTEGER mm == 77
mm =88
CHAR A = FF
CHAR D == AHMED

INTEGER C == X / Y
INTEGER n == mm * C
INTEGER v == X / Y


IF 5 = C kbgghg
IF 5 = 5 7

##  Sample Output Format
```plaintext
Z TYPE OF CHAR
X TYPE OF INTEGER
Y TYPE OF INTEGER
C = 50
mm TYPE OF INTEGER
A SYNTEXT ERROR
D TYPE OF CHAR
C = 50
n = 66
v = 50
FALSE IF CONDITION 
IF CONDITION EQUAL 7


HashMap Contents:
mm : 77
C : 11
v : 11
X : 55
Y : 5
n : 847

HashMap Contents:
D : AHMED
Z : AHMED

CONVERT TO JAVA :
String Z = AHMED;
int X = 55;
int Y = 5;
int C = X / Y;
int mm = 77;
String D = AHMED;
int C = X / Y;
int n = mm * C;
int v = X / Y;
if (5 == C) { kbgghg }
if (5 == 5) { 7 }
