public class LearnDSA {
    public static void main(String[] args){
        // Merge Two Arrays in Java. Merging two arrays in Java is similar to concatenate or combine two arrays in a single array object.
        /* There are following ways to merge two arrays:

Java 1 arraycopy() method
With2  without using arraycopy() method
Java 3 Collections
Java 4 Stream API

Java arraycopy() method
Java arraycopy() is the method of System class which belongs to java.lang package.
Syntax:
public static void arraycopy(Object source, int source_position,
Object destination, int destination_position, int length)

 code:
Java arraycopy() is the method of System class which belongs to java.lang package
 import java.util.Arrays;
public class MergeArrayExample1
{
public static void main(String[] args)
{
int[] firstArray = {23,45,12,78,4,90,1};        //source array
int[] secondArray = {77,11,45,88,32,56,3};  //destination array
int fal = firstArray.length;        //determines length of firstArray
int sal = secondArray.length;   //determines length of secondArray
int[] result = new int[fal + sal];  //resultant array of size first array and second array
System.arraycopy(firstArray, 0, result, 0, fal);
System.arraycopy(secondArray, 0, result, fal, sal);
System.out.println(Arrays.toString(result));    //prints the resultant array
}
}



Let's see another example in which we have specified soure_array, destination, dest_position, source position, and length. We can merge array according to the specified positions and length.

Example

import java.lang.*;
public class MergeArrayExample2
{
public static void main(String[] args)
{
int firstArray[] = { 11,22,33,44,55,98,76,54,60};
int secondArray[] = {66,77,88,99,22,67,21,90,80,70};
int source_arr[], sourcePos, dest_arr[], destPos, len;
source_arr = firstArray;
dest_arr = secondArray;
sourcePos = 2;
destPos = 4;
len = 3;
// Print elements of source
System.out.print("source_array : ");
for (int i = 0; i < firstArray.length; i++)
System.out.print(firstArray[i] + " ");
System.out.println("");
System.out.println("sourcePos : " + sourcePos);
// Print elements of destination
System.out.print("dest_array : ");
for (int i = 0; i < secondArray.length; i++)
System.out.print(secondArray[i] + " ");
System.out.println("");
System.out.println("destPos : " + destPos);
System.out.println("len : " + len);
//invoking arraycopy() method
System.arraycopy(source_arr, sourcePos, dest_arr,destPos, len);
// Print elements of destination after
System.out.print("Resultant array : ");
for (int i = 0; i < secondArray.length; i++)
System.out.print(secondArray[i] + " ");
}
}
Output:


source_array: 11 22 33 44 55 98 76 54 60
sourcePos: 2
dest_array: 66 77 88 99 22 67 21 90 80 70
destPos: 4
len: 3
Resultant array: 66 77 88 99 33 44 55 90 80 70



Without using arraycopy() method
Example of merging two arrays

In the following example, we have initialized two arrays firstArray and secondArray of integer type. Manually copy the each element of both arrays to mergedArray and convert that array into String by using toString() method of Array class.

public class MergeArrayExample3
{
public static void main(String[] args)
{
int[] firstArray = {56,78,90,32,67,12}; //initialized array
int[] secondArray = {11,14,9,5,2,23,15};
int length = firstArray.length + secondArray.length; //add the length of firstArray into secondArray
int[] mergedArray = new int[length];    //resultant array
int pos = 0;
for (int element : firstArray) //copying elements of secondArray using for-each loop
{
mergedArray[pos] = element;
pos++;              //increases position by 1
}
for (int element : secondArray) //copying elements of firstArray using for-each loop
{
mergedArray[pos] = element;
pos++;
}
System.out.println(Arrays.toString(mergedArray));   //prints the resultant array
}
}
Output:

[56, 78, 90, 32, 67, 12, 11, 14, 9, 5, 2, 23, 15]




Using Collections
Example of merging two arrays in Java

In the following example, we have initialized two arrays str1 and str2 of String type. After that we have created a list view of str1 by using the Arrays.asList() method. Now we have created the list view of str2 and added all the elements of str2 into the list. Again perform conversion from list to array and store the resultant array into str3 variable.

import java.util.*;
public class MergeArrayExample4
{
public static void main(String args[])
{
String str1[] = { "A", "E", "I" };          //source array
String str2[] = { "O", "U" };               //destination array
List list = new ArrayList(Arrays.asList(str1)); //returns a list view of an array
//returns a list view of str2 and adds all elements of str2 into list
list.addAll(Arrays.asList(str2));
Object[] str3 = list.toArray();         //converting list to array
System.out.println(Arrays.toString(str3));  //prints the resultant array
}
}
Output:

[A, E, I, O, U]



Java Stream API
Stream.of() method

The Stream.of() method of Stream interface returns a sequential ordered stream whose elements are the values.

Syntax

static <T> Stream<T> of(T....values)
Where MT is the type of stream elements. The method accepts values (elements of the new stream).

flatMap() method

The flatMap() method is the method of Stream interface. It returns a stream consisting of the result.

Syntax

<R> Stream<R> flatMap(Function<? Super T, ? extends Stream<? Extends R>> mapper)
Where R is the element type of new stream. The method accepts a mapper (a function to apply to each element which produces a stream of new values) as a parameter.

toArray() method

The toArray() method of Stream interface returns an array containing the elements of the stream.

Syntax


Object[] toArray()
Example of merging two arrays using Stream API

import java.util.stream.Stream;
import java.util.Arrays;
import java.io.*;
public class MergeArrayExample5
{
// function to merge two arrays
public static <T> Object[] mergeArray(T[] arr1, T[] arr2)
{
return Stream.of(arr1, arr2).flatMap(Stream::of).toArray();
}
public static void main (String[] args)
{
Integer[] firstArray = new Integer[]{13,12,11,6,9,3}; //source array
Integer[] secondArray = new Integer[]{78,34,56,67,2,11,7}; //destination array
Object[] mergedArray = mergeArray(firstArray,secondArray); //merged array
System.out.println("Merged array: "+ Arrays.toString(mergedArray));
}
}
Output:

Merged array: [13, 12, 11, 6, 9, 3, 78, 34, 56, 67, 2, 11, 7]

*/

    }
}
