#include<unistd.h>
#include<stdlib.h>
#include<sys/stat.h>
#include<fcntl.h>


int main(){

    //open returns a file descriptor that points to path specified; will be different if open used on the same file two times

    char c;
    int in, out;
    in = open("file.in", O_RDONLY); // in is the FD
    out = open("file.out", O_WRONLY | O_CREAT, S_IRUSR | S_IWUSR); //out is also an FD

    //read returns 0 for EOF

    while(read(in,&c,1)==1)
        write(out, &c, 1);

    close(in);
    close(out);

    exit(0);
}