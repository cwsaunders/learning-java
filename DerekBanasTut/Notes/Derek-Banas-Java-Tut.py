# Boilerplate
'''
String[] <-- if used in terminal the function can recieve a string array
static <-- function is part of a class
void <-- Returns nothing (e.g C++)
args <-- Function that stores String[]
'''

# Static keyword
'''
In public static void main() the 'static' means it is a function belonging to a class
'''

# Constant ( final )
'''
final Double floatExample = 42.5;
final Integer integerExample = 42;
etc
'''

# Variable types
'''
byte
short
double
integer
string
char
boolean
float
long
'''

# Type casting
'''
Double to int:
double testDub = 1.5;
int testInt = (int) testDub;

Double to String:
String favNum = Double.toString(1.618);

String to Int:
int strInt = Integer.parseInt("10");

'''

# Math
'''
integer++ is the same as integer += 1
++integer increments before using variable (e.g for print output)

Functions:
abs
ceil
floor
round
max
min
exp
log
log10
pow
sqrt
cbrt
hypot
PI
sin
cos
tan
asin
acos
atan
sinh
cosh
tanh
toDegrees
toRadians

****
finding random int between 5 - 20:
int minNum = 5;
int maxNum = 20;
int randNum = minNum + (int)(Math.random() * ((maxNum - minNum) + 1));
****


'''

# Manipulating Strings
'''
System.out.println(stringName.charAt(0)); // finds char at selected array number
System.out.println(stringName.contains("Christian")); // Returns true or false if the String contains/doesn't contain 'Christian'
System.out.println(stringName.indexOf("Christian")); // Returns index of "christian" if it exists
System.out.println(stringName.length()); // Returns length of string

System.out.println("dog equals cat : " + ("dog".equals("cat")) // Returns whether "dog" == "cat"
note:
NEVER use == to compare strings, always use method mentioned above

'''