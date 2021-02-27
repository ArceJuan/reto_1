package com.reto.shoppingSimulator.models.service;

import com.reto.shoppingSimulator.models.entity.Formulario;
import com.reto.shoppingSimulator.models.entity.Response;
import io.reactivex.Single;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

@Service
public class SimuladorServiceImpl implements ISimuladorService{
    DecimalFormat df = new DecimalFormat("###.##");

    @Override
    public Single<Response> calcular(Formulario formulario) {

        double tem = calcularTem(formulario.getTea());
        String primeraCuota = calcularPrimeraCuota(formulario.getMonto(),formulario.getCuota(),tem);

        String fechaPago= calcularFechaPrimeraCuota(formulario.getDiaPago());
        String estado = "Exitoso";
        Response response = new Response(primeraCuota,formulario.getMoneda(),fechaPago,estado);

        return Single.just(response);
    }

    public String calcularPrimeraCuota(double monto, int cuota, double tem){
        double base = Math.pow(( 1 + tem),cuota);
        double primeraCuota = monto*(tem*((base)/(base-1)));
        String parsePrimeraCuota = df.format(primeraCuota);

        return parsePrimeraCuota;
    }

    public double calcularTem(String tea){
        double base = 1 + (Double.parseDouble(tea)/100);
        double exponente = 30*1.0/360;
        double tem = (Math.pow((base),(exponente))-1);

        return tem;
    }

    public String calcularFechaPrimeraCuota(String diaPago){
        return null;
    }
}
