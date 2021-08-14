package examen1_karimguifarro;

import java.awt.Color;
import java.util.*;

public class Examen1_KarimGuifarro {

    public static ArrayList<figura> fig = new ArrayList();
    public static ArrayList<Plano> planos = new ArrayList();
    public static Scanner KaOz = new Scanner(System.in);

    public static void main(String[] args) {
        char k = 'k';
        while (k == 'k') {
            System.out.println("******MENU*******\n"
                    + "1)Metodo Recursivo\n"
                    + "2)Crear Plano o Agregar Figura\n"
                    + "3)Imprimir info de un triangulo rectangulo\n"
                    + "4)Determinar si algun circulo se toca\n"
                    + "5)Imprimir area y perimetro\n"
                    + "6)Salir");
            int op = KaOz.nextInt();
            switch (op) {
                case 1: {
                    int[] arr = new int[10];
                    for (int i = 0; i < 10; i++) {
                        System.out.print("Ingrese el número en la posición " + (i) + " :");
                        arr[i] = KaOz.nextInt();
                    }
                    orden(arr, arr.length);
                    System.out.println(Arrays.toString(arr));
                }
                break;
                case 2: {
                    System.out.println("******MENU*******\n"
                            + "1)Crear Plano\n"
                            + "2)Agregar Figura");
                    int op1 = KaOz.nextInt();
                    switch (op) {
                        case 1: {
                            int x, y;
                            System.out.println("Ingrese x:");
                            x = KaOz.nextInt();
                            System.out.println("Ingrese y:");
                            y = KaOz.nextInt();
                            planos.add(new Plano(x, y));
                        }
                        break;
                        case 2: {
                            int x = 0, y = 0;
                            Color c = null;
                            String tipo="";
                            System.out.println("1)Triangulo\n"
                                    + "2)Circulo");
                            int op2 = KaOz.nextInt();
                            switch (op2) {
                                case 1: {
                                    ArrayList<Plano> coordenada = new ArrayList(3);
                                    for (int i = 0; i < 3; i++) {
                                        System.out.println("Ingrese x:");
                                        x = KaOz.nextInt();
                                        System.out.println("Ingrese y:");
                                        y = KaOz.nextInt();
                                        coordenada.add(new Plano(x, y));
                                    }
                                    if (coordenada.get(0).equals(coordenada.get(1)) && coordenada.get(1).equals(coordenada.get(2))) {
                                        tipo = "Equilatero";
                                    } else if (coordenada.get(0).equals(coordenada.get(1)) && !coordenada.get(1).equals(coordenada.get(2))) {
                                        tipo = "Isoceles";
                                    } else if (!coordenada.get(0).equals(coordenada.get(1)) && !coordenada.get(1).equals(coordenada.get(2))) {
                                        tipo = "Escaleno";
                                    }
                                    System.out.println("COLOR:\n"
                                            + "1)Rojo\n"
                                            + "2)Azul\n"
                                            + "3)Verde\n"
                                            + "4)Blanco\n"
                                            + "5)Negro\n");
                                    int e = KaOz.nextInt();
                                    switch (e) {
                                        case 1: {
                                            c = Color.red;
                                        }
                                        break;
                                        case 2: {
                                            c = Color.blue;
                                        }
                                        break;
                                        case 3: {
                                            c = Color.GREEN;
                                        }
                                        break;
                                        case 4: {
                                            c = Color.WHITE;
                                        }
                                        break;
                                        case 5: {
                                            c = Color.BLACK;
                                        }
                                        break;
                                    }
                                    System.out.println("Ingrese a que plano quiere ingresar esta figura");
                                    int tip = KaOz.nextInt();
                                   fig.add(new Triangulo(tipo,c,x,y));
                                   planos.get(tip).setFigu(fig);
                                }
                                break;
                                case 2:{
                                    double a=0;
                                    ArrayList<Plano> coordenada = new ArrayList(1);
                                        System.out.println("Ingrese x:");
                                        x = KaOz.nextInt();
                                        System.out.println("Ingrese y:");
                                        y = KaOz.nextInt();
                                        System.out.println("Ingrese su Area:");
                                        a=KaOz.nextDouble();
                                        coordenada.add(new Plano(x, y));
                                     System.out.println("COLOR:\n"
                                            + "1)Rojo\n"
                                            + "2)Azul\n"
                                            + "3)Verde\n"
                                            + "4)Blanco\n"
                                            + "5)Negro\n");
                                    int e = KaOz.nextInt();
                                    switch (e) {
                                        case 1: {
                                            c = Color.red;
                                        }
                                        break;
                                        case 2: {
                                            c = Color.blue;
                                        }
                                        break;
                                        case 3: {
                                            c = Color.GREEN;
                                        }
                                        break;
                                        case 4: {
                                            c = Color.WHITE;
                                        }
                                        break;
                                        case 5: {
                                            c = Color.BLACK;
                                        }
                                        break;
                                    }
                                    area(a);
                                     System.out.println("Ingrese a que plano quiere ingresar esta figura");
                                    int tip = KaOz.nextInt();
                                   fig.add(new Circulo(a,c,x,y));
                                   planos.get(tip).setFigu(fig);
                                }
                            }
                        }
                    }
                }
                case 6: {
                    k = 'n';
                }
            }
        }
    }

    static void orden(int arr[], int n) {
        if (n == 1) {
            return;
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        orden(arr, n - 1);
    }
    public static void area(double a){
        double A=3.14;
        double v=a*a;
        double g=A*v;
    }
}
