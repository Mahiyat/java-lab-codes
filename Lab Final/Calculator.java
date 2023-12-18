/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author jucse
 */
import java.util.*;
class Addition
{
    private int a,num1,num2;
    public Addition()
    {
        a=0;
        num1=0;
        num2=0;
    }
    public void setValue(int n1, int n2)
    {
        num1=n1;
        num2=n2;
    }
    public void setResult(int n)
    {
        a=n;
    }
    public int getNum1()
    {
        return num1;
    }
    public int getNum2()
    {
        return num2;
    }
    public void calculate()
    {
        int n=num1+num2;
        setResult(n);
    }
    public int getResult()
    {
        calculate();
        return a;
    }
    public void displayResult()
    {
        calculate();
        System.out.println("After addition of "+getNum1()+" and "+getNum2()+" the result is "+getResult());
    }
}

class Subtraction
{
    private int a,num1,num2;
    public Subtraction()
    {
        a=0;
        num1=0;
        num2=0;
    }
    public void setValue(int n1, int n2)
    {
        num1=n1;
        num2=n2;
    }
    public int getNum1()
    {
        return num1;
    }
    public int getNum2()
    {
        return num2;
    }
    public void calculate()
    {
        a=num1-num2;
    }
    public int getResult()
    {
        calculate();
        return a;
    }
    public void displayResult()
    {
        System.out.println("After subtraction of "+getNum1()+" and "+getNum2()+" the result is "+getResult());
    }
}

class Product extends Addition
{
    @Override
    public void calculate()
    {
        int n=getNum1()*getNum2();
        setResult(n);
    }
    @Override
    public void displayResult()
    {
        System.out.println("After product of "+getNum1()+" and "+getNum2()+" the result is "+getResult());
    }
}

public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1,n2;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        n1=sc.nextInt();
        System.out.print("Enter the second number: ");
        n2=sc.nextInt();
        Addition obja=new Addition();
        obja.setValue(n1, n2);
        obja.displayResult();
        Subtraction objs=new Subtraction();
        objs.setValue(n1, n2);
        objs.displayResult();
        Product objp=new Product();
        objp.setValue(n1, n2);
        objp.displayResult();
    }
    
}
