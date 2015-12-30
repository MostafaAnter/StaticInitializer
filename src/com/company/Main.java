package com.company;

import olive.Olive;
import olive.OliveJar;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	//using static initializing
        //#when i make instance from class contain static initializing
        // #OliveJar oliveJar = new OliveJar();
        // first thing that compiler do it execute all thing inside static block


        ArrayList<Olive> olives = OliveJar.olives;
        System.out.println("after");
        for(Olive o : olives){
            System.out.println(o.getOliveName() + o.getOliveColor());
        }



    }
}
