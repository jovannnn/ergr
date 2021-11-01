package com.company;

public class Main {

    public static void main(String[] args) {
	Presmetaj n=new Presmetaj();
    n.SetBroj(2);
    n.SetBroj1(4);
    n.SetRezultat();
    n.SetIme("Jovan");
    System.out.println("Prviot broj e:"+" "+n.GetBroj());
        System.out.println("Vtoriot broj e:"+" "+n.GetBroj1());
        System.out.println("REZULTAT e:"+" "+n.GetRezultat());

        System.out.println("Bravos"+" "+n.GetIme()+" "+"uspesno ja resi zadacata");
    }
}
