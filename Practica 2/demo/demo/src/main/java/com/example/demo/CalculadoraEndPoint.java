package com.example.demo;

import org.example.calculadora.SumarRequest;
import org.example.calculadora.RestarRequest;
import org.example.calculadora.MultiplicarRequest;
import org.example.calculadora.DividirRequest;
import org.example.calculadora.SumarResponse;
import org.example.calculadora.RestarResponse;
import org.example.calculadora.MultiplicarResponse;
import org.example.calculadora.DividirResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class CalculadoraEndPoint {

    @PayloadRoot(namespace = "http://www.example.org/Calculadora", localPart = "SumarRequest")
    @ResponsePayload
    
    public SumarResponse dameSuma(@ RequestPayload SumarRequest peticion){
        SumarResponse respuesta = new SumarResponse();
        respuesta.setResultado(String.valueOf(
            Integer.parseInt(peticion.getA() ) +
            Integer.parseInt(peticion.getB())
        ));


        return respuesta;

    }
    @PayloadRoot(namespace = "http://www.example.org/Calculadora", localPart = "RestarRequest")
    @ResponsePayload

    public RestarResponse dameResta(@ RequestPayload RestarRequest peticion){
        RestarResponse respuesta = new RestarResponse();
        respuesta.setResultado(String.valueOf(
            Integer.parseInt(peticion.getA() ) -
            Integer.parseInt(peticion.getB())
        ));


        return respuesta;

    }

    @PayloadRoot(namespace = "http://www.example.org/Calculadora", localPart = "MultiplicarRequest")
    @ResponsePayload

    public MultiplicarResponse dameMultiplicacion(@ RequestPayload MultiplicarRequest peticion){
        MultiplicarResponse respuesta = new MultiplicarResponse();
        respuesta.setResultado(String.valueOf(
            Integer.parseInt(peticion.getA() ) *
            Integer.parseInt(peticion.getB())
        ));


        return respuesta;

    }

    @PayloadRoot(namespace = "http://www.example.org/Calculadora", localPart = "DividirRequest")
    @ResponsePayload

    public DividirResponse dameMultiplicacion(@ RequestPayload DividirRequest peticion){
        DividirResponse respuesta = new DividirResponse();
        respuesta.setResultado(String.valueOf(
            Integer.parseInt(peticion.getA() ) /
            Integer.parseInt(peticion.getB())
        ));


        return respuesta;

    }
    
}
