/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SIL
 */
public class Operaciones {

    public int suma(int num1, int num2) {
        return num1 + num2;
    }

    public int resta(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplicacion(int num1, int num2) {
        return num1 * num2;
    }

    public double division(int num1, int num2) {
        if (num1 == 0) {
            return 0;
        } else {
            if (num2 == 0) {
                return Double.NaN;
            } else {
                return num1 / num2;
            }
        }
    }

    public int modulo(int num1, int num2) {
        return num1 % num2;
    }

    public int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            if (exponente == 1) {
                return base;
            } else {
                if (exponente > 1) {
                    int resultado = 1;
                    for (int i = 0; i < exponente; i++) {
                        resultado = resultado * base;
                    }

                    return resultado;
                } else {
                    int resultado = 1;
                    for (int i = 0; i < exponente; i++) {
                        resultado = resultado * base;
                    }
                    return 1 / resultado;
                }
            }
        }
    }

    public int factorial(int x) {
        if (x < 1) {
            return 1;
        } else {
            int result = 1;
            for (int i = 2; i < x; i++) {
                result = result * i;
            }

            return result;
        }
    }

    public double ecuacionCuadratica(int a, int b, int c) {
        Operaciones op = new Operaciones();
        int term1 = op.potencia(b, 2);

        int term2 = 4 * a * c;
        int termino = term1 - term2;
        int end = (int) Math.sqrt(termino);
        int x1 = -b + end;
        x1 = x1 / 2 * a;
        int x2 = -b - end;
        x2 = x2 / 2 * a;
        System.out.print("X1 = " + x1 + "\nX2 = " + x2 + "\n");
        return 0;
    }

}
