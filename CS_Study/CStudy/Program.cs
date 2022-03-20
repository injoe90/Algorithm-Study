using System;

namespace CStudy
{
    class Program
    {
        static void Main(string[] args)
        {
            //Console.WriteLine("Hello World!");
            String[] numberList = Console.ReadLine().Split(' ');
            Console.WriteLine("{0}", int.Parse(numberList[0]) + int.Parse(numberList[1]));
        }
    }
}
