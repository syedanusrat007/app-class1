/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

/**
 *
 * @author Tonni
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    int a=10;
    int b=20;
    static void m1(){
      JavaApplication19 j= new  JavaApplication19();
        System.out.println(j.a);
        System.out.println(j.b);
    }
    static void m2(){
      JavaApplication19 j= new  JavaApplication19();
        System.out.println(j.a);
        System.out.println(j.b);
    }
     void m3(){
      JavaApplication19 j= new  JavaApplication19();
        System.out.println(j.a);
        System.out.println(j.b);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        m1();
        m2();
        JavaApplication19 m =new JavaApplication19();
        m.m3();
        
    }
}
