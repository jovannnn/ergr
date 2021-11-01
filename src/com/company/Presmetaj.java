package com.company;

public class Presmetaj {
    int a;
    int b;
    int rez;
    String ime;

    public Presmetaj(){

    }
    public int GetBroj(){
        return a;
    }
    public int GetBroj1(){
        return b;
    }
    public int GetRezultat(){
        return rez;
    }
    public String GetIme(){
        return ime;
    }

    public void SetBroj(int a){
        this.a=a;
    }
    public void SetBroj1(int b){
        this.b=b;
    }
    public void SetRezultat(){
        rez=a+b;
    }
    public void SetIme(String ime){
        this.ime=ime;
    }
}
