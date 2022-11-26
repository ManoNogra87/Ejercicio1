/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto1;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Dell
 */
public class Proyecto1 {

    public static void main(String[] args) throws IOException {
        
        String nombre = "Camilo";
        String frace = "Hola mi nombre es ";
        Integer followerinstagrat = 100;
        Integer youtube = 200;
        String seguidores = " Tengo "+followerinstagrat+ " en instagrant"+
                " y en Youtube "+youtube+" en total tengo "+(followerinstagrat+youtube)+""; 
        System.out.println(frace+nombre+","+seguidores);
        String operacion = "Estamos trabajado desde el ";
        Integer ano1 = 2008;
        Integer ano2 = 2022;
        System.out.println(operacion+ano1+ano2+"el modulo de estos años es:"+(ano2-ano1)+" años");
        System.out.println("------------------------------------------------");
        System.out.println("Ingrese su edad");
        //creando el lector
        Scanner captura = new Scanner(System.in);
        //capturando el dato
        Integer edad = captura.nextInt();
        if (edad > 18){
        System.out.println("Es mayor de 18");
        } else {
            System.out.println("Es menor de edad");
        }       
        System.out.println("Ingrese su edad de nuevo");
        //creando el lector
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        //capturando el dato
        String valor = br.readLine();
        //evaluendo el dato
        if (Integer.parseInt(valor) > 18){
            System.out.println("El numero ingresado es mayor de 18");
        } else {
            System.out.println("El numero ingresado es menor de 18");
        }
                
    }   
    }
