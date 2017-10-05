/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import modelo.Automovil;
import modelo.Persona;

/**
 *
 * @author IRINA
 */
public class GestionarPicoPlaca {

    private Automovil auto;
    private Persona dueño;

    public GestionarPicoPlaca() {

        dueño = new Persona("Katherine Avalos", "Sangolqui", 2093932, 1719238121, "05/07/1993", "O+");
        auto = new Automovil("", "BLANCO", "SPARK", dueño);
    }

    public static int obtenerDia(String fecha) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date d = formato.parse(fecha);
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(d);
        return cal.get(Calendar.DAY_OF_WEEK);
    }

    public boolean verificarPlaca(String placa, String fecha, String hora) throws ParseException {

        boolean estado = true;
        DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");

        auto.setPlaca(placa);

        if (formatoHora.parse(hora).after(formatoHora.parse("07:00:00")) && formatoHora.parse(hora).before(formatoHora.parse("09:30:00"))
                || formatoHora.parse(hora).after(formatoHora.parse("16:00:00")) && formatoHora.parse(hora).before(formatoHora.parse("19:30:00"))) {

            switch (obtenerDia(fecha)) {

                //Lunes
                case 2:

                    if (auto.getPlaca().charAt(auto.getPlaca().length() - 1) == '1'
                            || auto.getPlaca().charAt(auto.getPlaca().length() - 1) == '2') {
                        estado = false;
                    }
                    break;
                //Martes
                case 3:
                    if (auto.getPlaca().charAt(auto.getPlaca().length() - 1) == '3'
                            || auto.getPlaca().charAt(auto.getPlaca().length() - 1) == '4') {
                        estado = false;
                    }
                    break;

                //Miercoles
                case 4:
                    if (auto.getPlaca().charAt(auto.getPlaca().length() - 1) == '5'
                            || auto.getPlaca().charAt(auto.getPlaca().length() - 1) == '6') {
                        estado = false;
                    }
                    break;

                //Jueves
                case 5:
                    if (auto.getPlaca().charAt(auto.getPlaca().length() - 1) == '7'
                            || auto.getPlaca().charAt(auto.getPlaca().length() - 1) == '8') {
                        estado = false;
                    }
                    break;

                //Viernes
                case 6:
                    if (auto.getPlaca().charAt(auto.getPlaca().length() - 1) == '9'
                            || auto.getPlaca().charAt(auto.getPlaca().length() - 1) == '0') {
                        estado = false;
                    }
                    break;

                default:
                    estado = true;
            }

        }

        return estado;

    }

    public Automovil getAuto() {
        return auto;
    }

}
