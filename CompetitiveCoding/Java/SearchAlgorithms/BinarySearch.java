/*BinarySearch is a basic search alogorithm which works in sorted arrays instead of iterating through
the whole array we try to optimize it by eliminating the half of the array which is greater or lesser
than the element which we are trying to find.

BinarySearch has some intresting problems in the competitive programming world. 

It can also be used in places where you can run the alogorithm on the solution set
For example:
    for finding the root of a number(floor) lets say the solution set looks something
    similar to this 
    Y Y Y Y Y N N N N N N N N N N N N N 

    if you are finding the root of 28 if you consider taking mid^2 as the number <=28 
    the solution looks like above where you have to find the last Y element.
    
The complexity of a basic linear search is O(N) where as the complexity of binary search is O(log(N)) */



public static int binarySearchIteration(int[] arr, int x) {

    int leftPointer = 0;
    int rightPointer = arr.length - 1;

    while(leftPointer <= rightPointer){
        int mid = (leftPointer + rightPointer) / 2;

        if(arr[mid] == x){
            return mid;
        }else if(arr[mid] > x){
            rightPointer = mid - 1;  
        }else{
            leftPointer = mid + 1;
        }
    }

    return -1;
    
}


public static int binarySearchRecursive(int[] arr, int x, int leftPointer, int rightPointer){

    if(leftPointer <= rightPointer){
        
        int mid = (leftPointer + rightPointer) /2;

        if(arr[mid]==x){
            return mid;
        }

        if(arr[mid] > x){
            return binarySearchRecursive(arr,x,leftPointer,mid-1);
        }

        return binarySearchRecursive(arr,x,mid+1,rightPointer);

    }

    return -1;


}