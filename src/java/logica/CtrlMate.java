/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import javax.inject.Named;
import javax.faces.bean.ManagedBean;
import control.CtrlOperaciones;

/**
 *
 * @author Richard
 */
@Named(value = "ctrlMate")
@ManagedBean
public class CtrlMate {
    public Double numero1;
    public Double numero2;
    public String resultado;
    CtrlOperaciones operaciones;
    /**
     * Creates a new instance of CtrlMate
     */
    public CtrlMate() {
        operaciones = new CtrlOperaciones();
    }
    public void accionSumar(){
        resultado = operaciones.suma(getNumero1(), getNumero2())+"";
    }
    public void accionRestar(){
        setResultado ( operaciones.resta (getNumero1(), getNumero2())+"");
    }
    public void accionMultiplicar(){
        resultado = operaciones.multiplicacion (getNumero1(), getNumero2())+"";
    }
    public void accionDividir (){
        double res=operaciones.division(getNumero1(),getNumero2());
        if (res!=-1000){
            setResultado(res+"");
        }else{
            setResultado("Verificar los datos");
        }
    }

    public Double getNumero1() {
        return numero1;
    }

    public void setNumero1(Double numero1) {
        this.numero1 = numero1;
    }

    public Double getNumero2() {
        return numero2;
    }

    public void setNumero2(Double numero2) {
        this.numero2 = numero2;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public CtrlOperaciones getOperaciones() {
        return operaciones;
    }

    public void setOperaciones(CtrlOperaciones operaciones) {
        this.operaciones = operaciones;
    }
    
    
}
