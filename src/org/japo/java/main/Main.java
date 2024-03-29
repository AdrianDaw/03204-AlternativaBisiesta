/* 
 * Copyright 2019 Adrián Pérez Rodríguez - adrianp899@gmail.com .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Adrián Pérez Rodríguez - adrianp899@gmail.com
 */
public class Main {
// Instanciar Scanner

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
        final String MSG_SI = "SI";
        final String MSG_NO = "NO";

        //Variable respuesta para la salida
        String respuesta;

        try {
            //Introduce año a analizar
            System.out.printf("Análisis año ...: ");
            int any = SCN.nextInt();

            //Separador
            System.out.println("---");

            //Analiza el año
            if (((any % 4 == 0) && (any % 100 != 0)) || (any % 400 == 0)) {
                respuesta = MSG_SI;
            } else {
                respuesta = MSG_NO;
            }

            //Salida
            System.out.printf("El año %d ....: %s es bisiesto %n", any, respuesta);

        } catch (Exception e) {
            System.out.println("ERROR: Boing Boom Tschak, PEIM!!");
        } finally {
            SCN.nextLine();
        }
    }
}