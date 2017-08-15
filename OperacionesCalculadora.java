/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SIL
 */
public class OperacionesCalculadora {

    public int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public int resta(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public int multiplicacion(int numero1, int numero2) {
        int resultado = 0;

        for (int i = 0; i < numero2; i++) {
            resultado = suma(resultado, numero1);
        }
        return resultado;
    }

    public double division(int numero1, int numero2) {
        if (numero2 != 0) {
            return numero1 / numero2;
        } else {
            return Double.NaN;
        }
    }

    public int mudulo(int numero1, int numero2) {
        return numero1 % numero2;
    }

    public int potencia(int base, int exponente) {
        if (exponente == 1) {
            return base;
        } else {
            if (exponente > 1) {
                return base * potencia(base, exponente - 1);
            } else {
                if (exponente == 0) {
                    return 1;
                } else {
                    return 1 / potencia(base, exponente * (-1));
                }
            }
        }
    }

    public int factorial(int x) {
        if (x < 1) {
            return 1;
        } else {
            return x * factorial(x - 1);
        }
    }

    public double[] EcuacionCuadratica(int a, int b, int c) {
        int raizadentro = 0;
        if (b >= 0) {
            raizadentro = b * b - 4 * a * c;
        } else {
            raizadentro = b * b * (-1) - 4 * a * c;
        }
        double raiz = (int) Math.sqrt(raizadentro);

        System.out.println(raiz);
        double x1 = (b * - 1) + raiz / (2 * a);
        System.out.println("x1 = " + x1);
        double x2 = (b * - 1) - raiz / (2 * a);
        System.out.println("x2 = " + x2);
        return null;
    }
}
