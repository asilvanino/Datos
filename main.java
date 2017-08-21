
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Sil
 */
public class main {

    BufferedWriter Bw = new BufferedWriter(new OutputStreamWriter(System.out));
    BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        main Final = new main ();
        Final.opciones();
        //Final.acciones(0, parametros);
        //Final.getParametros(0)

    }

    public int opciones() throws IOException {
        Bw.write("\n Escoja alguna de la siguientes opciones: \n 1.Suma  \n 2.resta \n 3.multiplicacion  \n 4. Division \n 5. Mudulo  \n 6.potencia \n 7. Factorial \n 8. Ecuacion cuadratica \n 9. Salir ");
        return Integer.parseInt(Br.readLine());
    }

    public void acciones(int acciones, int[] parametros) throws IOException {
        Operaciones op = new Operaciones();

        switch (acciones) {
            case 1: //suma
            {
                int resultado = op.suma(parametros[0], parametros[1]);
                Bw.write("El resultado de la suma es : " + resultado);
            }

            break;
            case 2: //resta
            {
                int resultado = op.resta(parametros[0], parametros[1]);
                Bw.write("El resultado de la resta es : " + resultado);
            }
            break;
            case 3: {
                int resultado = op.multiplicacion(parametros[0], parametros[1]);
                Bw.write("El resultado de la multiplicacion es : " + resultado);
            }
            break;
            case 4: // division
            {
                int resultado = (int) op.division(parametros[0], parametros[1]);
                Bw.write("El resultado de la division es : " + resultado);
            }
            break;
            case 5: // modulo
            {
                int resultado = op.modulo(parametros[0], parametros[1]);
                Bw.write("El resultado del modulo es : " + resultado);
            }
            break;
            case 6://potencia
            {
                int resultado = op.potencia(parametros[0], parametros[1]);
                Bw.write("El resultado de la potencia es : " + resultado);
            }
            break;
            case 7: // Factorial
            {
                int resultado = op.factorial(parametros[0]);
                Bw.write("El resultado del factorial es : " + resultado);
            }
            break;
            case 8: // cuadratica
            {
                double resultado = op.ecuacionCuadratica(parametros[0], parametros[1], parametros[2]);
                Bw.write("El resultado de la suma es : " + resultado);
            }
            break;
            case 9: {
                System.exit(0);
            }

            default:
        }
    }

    public int[] getParametros(int acciones) throws IOException {
        int[] parametros;

        switch (acciones) {
            case 1: //suma
            {
                parametros = new int[2];
                Bw.write("ingrese el primer termino de la suma: \n");
                parametros[0] = Integer.parseInt(Br.readLine());

                Bw.write("ingrese el segundo termino de la suma: \n");
                parametros[1] = Integer.parseInt(Br.readLine());

                return parametros;
            }

            case 2: //resta
            {
                parametros = new int[2];
                Bw.write("ingrese el primer termino de la resta: \n");
                parametros[0] = Integer.parseInt(Br.readLine());

                Bw.write("ingrese el segundo termino de la resta: \n");
                parametros[1] = Integer.parseInt(Br.readLine());

                return parametros;
            }

            case 3: {
                parametros = new int[2];
                Bw.write("ingrese el primer termino de la Multiplicacion: \n");
                parametros[0] = Integer.parseInt(Br.readLine());

                Bw.write("ingrese el segundo termino de la Multiplicacion: \n");
                parametros[1] = Integer.parseInt(Br.readLine());

                return parametros;
            }

            case 4: // division
            {
                parametros = new int[2];
                Bw.write("ingrese el primer termino de la division: \n");
                parametros[0] = Integer.parseInt(Br.readLine());

                Bw.write("ingrese el segundo termino de la division: \n");
                parametros[1] = Integer.parseInt(Br.readLine());
            }
            break;
            case 5: // modulo
            {
                parametros = new int[2];
                Bw.write("ingrese el primer termino del modulo: \n");
                parametros[0] = Integer.parseInt(Br.readLine());

                Bw.write("ingrese el segundo termino del modulo: \n");
                parametros[1] = Integer.parseInt(Br.readLine());
            }

            case 6://potencia
            {
                parametros = new int[2];
                Bw.write("ingrese la base: \n");
                parametros[0] = Integer.parseInt(Br.readLine());

                Bw.write("ingrese el exponente: \n");
                parametros[1] = Integer.parseInt(Br.readLine());
            }
            case 7: // Factorial
            {
                parametros = new int[1];
                Bw.write("ingrese el numero que desea convertir en factorial: \n");
                parametros[0] = Integer.parseInt(Br.readLine());
            }
            case 8: // cuadratica
            {
                parametros = new int[3];
                Bw.write("ingrese el termino a: \n");
                parametros[0] = Integer.parseInt(Br.readLine());

                Bw.write("ingrese el termino b: \n");
                parametros[1] = Integer.parseInt(Br.readLine());

                Bw.write("ingrese el termino c: \n");
                parametros[2] = Integer.parseInt(Br.readLine());
            }
            case 9: {
                parametros = new int[1];
                Bw.write("terminar programa: \n");
                parametros[0] = Integer.parseInt(Br.readLine());
            }

            default:
        }
        return null;
    }

}
