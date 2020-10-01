public static int linearSearch(int[] arr, int x) {
    
    //Basic linearSearch which returns the first index of the found element else -1;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==x){
            return i;
    }
    return -1;

}