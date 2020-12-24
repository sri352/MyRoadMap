#include <stdlib.h>
#include<unistd.h>


int main(){

    char buffer[128];
    int nread;

    //nread returns the input given max possible length 128 as we defined the length of array as 128

    //read call takes the file descriptor in the first argument

    nread = read(0, buffer, 128);

    if (nread == -1)
    {
        write(2, "A read error has occured\n", 26);
    }

    if(write(1,buffer,nread)!=nread){
        write(2, "A write error has occured\n", 27);
    }

    exit(0);

}