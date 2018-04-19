#include<stdio.h>
#include<string.h>
#include<sys/types.h>
#define MAX_COUNT 50
#define BUF_SIZE 100
void ChildProcess(void); /* child process prototype */
void ParentProcess(void); /* parent process prototype */
void main(void)
{
char buf[BUF_SIZE];
pid_t pid;
pid=fork();
if(pid==0)
ChildProcess();
else
ParentProcess();
}
void ChildProcess(void)
{
	char buf[BUF_SIZE];
int i;
for(i=1;i<= MAX_COUNT;i++)
{
if(i%2!=0) //Checking condtion for and odd number of lines
{
sprintf(buf, "Child process: pid %d, value = %d\n", 3, 3);
write(1, buf, strlen(buf));
}
}   
}
void ParentProcess(void)
{
	char buf[BUF_SIZE];
int i;
for(i=1;i<=MAX_COUNT;i++)
{
if(i%2==0) //Checking condtion for even number of lines
{
sprintf(buf, "Parent process: pid %d, value = %d\n", 4, 4);
write(1, buf, strlen(buf));
}
}
}
