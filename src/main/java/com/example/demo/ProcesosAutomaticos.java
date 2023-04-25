package com.example.demo;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class ProcesosAutomaticos {

    public void proces () {
        Timer timer = new Timer();

        // Crear la tarea a ejecutar
        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                // Realizar la tarea programada
                System.out.println("Tarea programada ejecutada");
            }
        };

        // Calcular la hora de ejecución (3:00 AM)
        Calendar horaEjecucion = Calendar.getInstance();
        horaEjecucion.set(Calendar.HOUR_OF_DAY, 9);
        horaEjecucion.set(Calendar.MINUTE, 7);
        horaEjecucion.set(Calendar.SECOND, 0);

// Programar la tarea para que se ejecute a las 3:00 AM
        timer.schedule(tarea, horaEjecucion.getTime());
    }
}
