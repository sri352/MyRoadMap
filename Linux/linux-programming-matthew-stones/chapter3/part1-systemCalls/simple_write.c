#include<stdlib.h>
#include<unistd.h>

int main(){


	//Write returns the length of the data that is written to the given file descriptor.
	//If the whole data is not written we should maintain some extra precautions to write the remaining data.

	//first argument is the FD 1 = Stdout, 2 = stderror, 0 = StdIn
	if(write(1,"Here is some data\n",16)!=18){
		write(2,"some error occured\n",19);
	}

	exit(0);
	

}

