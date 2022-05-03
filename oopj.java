package com.SAM;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Enter VAlue Of L,B and H");
        Scanner s= new Scanner(System.in);
        int L = s.nextint();
        int B = s.nextint();
        int H = s.nextint();
        int v = L*B*H;
        System.out.println("Volume = "+v);
    }
}
