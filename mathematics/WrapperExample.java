class WrapperExample
{
    public static void main(String args[])
    {
        String a="C";
        String b="C";
        System .out.println(a.compareTo(b));
    }
}

/*_____________________________[Multi Threading]___________________________

Thrade:----------------

A thrade is the smalest unit of excecution inside a process

A single process can cantain multiple thrades

Process:----

A process is an excequting extans of a program
Example :----
Ms would ,Google;

Multithrading:----------
A multithrading is an concerrent Excequation of two or more thrade inside a single process

Advantages of Multithrading:---

Improves Applicatin performens
* better cpu utilization
* Reduce Respons time
*Excequate Multiple task simultensly
better user experiance
Resource  Sharing 



LIFE CYCLE OF A THRADE:-------------

*                           [NEW]
|                             |
|                             |
|                             [Start]
|                              |
|                            [Runable]
|                                 |
|                            [Runing]
|                              |
|                             [Wait/block]
|                                    |
|                                 [teminale ] Normal and Abnormal

New:--
Threade object is created

Base to create a Threade
[1]= by Extending threade class
[2]= implementing Runable interface

class  Myclass extends thread
{

// code

}

class myclass implements Runnable             
{
  
// code


}

__________________________________________________[New]_____________________________________

Thread object is created but not started

______________________________________[Runable]_____________
Thread ready to excecute after calling start

RUNNING:----
Thread is currently excecuting

WATING:--------------
Thread waits indefinet till another Thread notifies it

TIMEWAITING:------------
Thread wait for a specific amount of sin

BLOCKED:------
thread waits to equare a block heald by another thread


*/