Java in-built provides some useful dataStructures making the programmers life much easier;


public void basicArrayMethodsAndOperations(){

    //Declaring an array is nothing but giving [] after the required data type. Length is compulsory
    int length = 20;
    int[] arr = new int[length];

    int[] arr2 = {36, 25, 15, 45, 76, 20};
    System.out.println(arr.length); //getting the length of an array
    
    for(int i=0;i<arr.length;i++){
        System.out.println("iterating over the array access the repective array element" + arr[i]);
    }

    for(int a: arr2){
        System.out.println("iterating over the array using the for each loop without index" + arr[i]);
    }

    Arrays.sort(arr2);  //inbuilt method for sorting the array in ascending order

    int fromIndex = 2;
    int endindex = arr2.length - 3;

    Arrays.sort(arr2, fromIndex, endindex); // sorts the array only in the specified indexes

    Arrays.binarySearch(arr2, 5); // using the binary search algo search 5 in the passed int array

    Arrays.fill(arr2, 20); //In-built method for filling the entire array with a value rather than writing an iteration loop


}


public void basicArrayListMethodsAndOperations(){

    ArrayList<Integer> arrList = new ArrayList<>();

    ArrayList<String> stringArrList = new ArrayList<>();

    for(int i=0;i<=5;i++){

        arrList.add(i); // adding an element in the arrayList should be compatible with the before instanitated data type

    }

    int index = 3;

    arrList.remove(index); //remove the element at a specified index make sure you pass an int for this 
    
    stringArrList.remove("hello"); // will find the first occurence of hello in the arraylist and remove it.

    System.out.println(arrList.get(index)); // get the element at a specified index in arrayList

    arrList.set(index,123); //change the value of a element at specified index

    arrList.add(index,456); //addind a new element at specified index

    Object[] objArr = arrList.toArray(); //Converting the list to an array

    stringArrList.indexOf("hello"); //returns the index of first occurence of the given object or -1

    stringArrList.lastIndexOf("hello"); //returns the index of last occurence of the given object or -1

}