/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;


/**
 *
 * @author Richard
 */
@Named(value = "ctrlOperaciones")
@RequestScoped
public class CtrlOperaciones {
    
    public double suma(double num1,double num2){
        double sum=num1+num2;
        return sum;
    }
    public double resta(double num1,double num2){
        double rest=num1-num2;
        return rest;
    }
    public double multiplicacion(double num1,double num2){
        double mult=num1*num2;
        return mult;
    }
    public double division(double num1,double num2){
        double div=-1000;
        if(num2>0){
            div=num1/num2;
        }
        return div;
    }

}