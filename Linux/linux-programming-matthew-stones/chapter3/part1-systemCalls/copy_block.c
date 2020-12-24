#include<unistd.h>
#include<stdlib.h>
#include<sys/stat.h>
#include<fcntl.h>


int main(){

    char block[1204];
    int in, out;
    int nread;

    in = open("file.in", O_RDONLY);
    out = open("file.out", O_WRONLY | O_CREAT, S_IRUSR | S_IWUSR); //out is also an FD

    //lseek(out, 10000, SEEK_END); 
    //to set the offset or the pointer from where to start writing of the FD
    //has multiple options like EOF,Absolute position, etc
    while ((nread = read(in, block, sizeof(block))) > 0)
    {
        write(out, block, nread);
    }

    exit(0);
}


//Findings from the results of the copy system and the copy block

// $ TIMEFORMAT="" time ./copy_system
// 0.89user 2.82system 0:03.71elapsed 100%CPU (0avgtext+0avgdata 1160maxresident)k
// 0inputs+3168outputs (0major+57minor)pagefaults 0swaps
// $ TIMEFORMAT="" time ./copy_block
// 0.00user 0.00system 0:00.00elapsed 100%CPU (0avgtext+0avgdata 1156maxresident)k
// 0inputs+3168outputs (0major+56minor)pagefaults 0swaps