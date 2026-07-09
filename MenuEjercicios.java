import java.util.ArrayList;
import java.util.Scanner;

import NivelBasico.CalculadoraBasica;
import NivelBasico.ValidadorDeNumeros;
import NivelBasico.ConversorDeUnidades;
import NivelBasico.OperacionesConListas;
import NivelBasico.ManipulacionDeCadenas;
import NivelIntermedio.Agenda;
import NivelIntermedio.Contacto;
import NivelIntermedio.CuentaBancaria;
import NivelIntermedio.Carrito;
import NivelIntermedio.Producto;
import NivelIntermedio.RegistroEmpleados;
import NivelIntermedio.Empleado;
import NivelIntermedio.Estudiante;
import NivelIntermedioAvanzado.Vehiculo;
import NivelIntermedioAvanzado.Auto;
import NivelIntermedioAvanzado.Moto;
import NivelIntermedioAvanzado.Camion;
import NivelIntermedioAvanzado.Figura;
import NivelIntermedioAvanzado.Circulo;
import NivelIntermedioAvanzado.Rectangulo;
import NivelIntermedioAvanzado.Triangulo;
import NivelIntermedioAvanzado.Libro;
import NivelIntermedioAvanzado.Usuario;
import NivelIntermedioAvanzado.Biblioteca;
import NivelIntermedioAvanzado.Habitacion;
import NivelIntermedioAvanzado.Reserva;
import NivelIntermedioAvanzado.Hotel;
import NivelIntermedioAvanzado.Dado;
import NivelIntermedioAvanzado.Jugador;
import NivelIntermedioAvanzado.Juego;

public class MenuEjercicios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nivel;

        do {
            System.out.println("========= MENÚ PRINCIPAL =========");
            System.out.println("1. Nivel Básico");
            System.out.println("2. Nivel Intermedio");
            System.out.println("3. Nivel Avanzado");
            System.out.println("0. Salir");
            System.out.print("¿Qué nivel deseas ejecutar?: ");

            nivel = leerEntero(scanner);

            switch (nivel) {
                case 1:
                    menuNivelBasico(scanner);
                    break;
                case 2:
                    menuNivelIntermedio(scanner);
                    break;
                case 3:
                    menuNivelAvanzado(scanner);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

            System.out.println();
        } while (nivel != 0);

        scanner.close();
    }

    // ========= MENÚ NIVEL BÁSICO =========
    private static void menuNivelBasico(Scanner scanner) {
        int opcion;
        do {
            System.out.println("========= MENÚ NIVEL BÁSICO =========");
            System.out.println("1. Calculadora básica");
            System.out.println("2. Validador de números");
            System.out.println("3. Conversor de unidades");
            System.out.println("4. Operaciones con listas (arreglos)");
            System.out.println("5. Manipulación de cadenas");
            System.out.println("0. Volver");
            System.out.print("Elige una opción: ");

            opcion = leerEntero(scanner);

            switch (opcion) {
                case 1:
                    menuCalculadora(scanner);
                    break;
                case 2:
                    menuValidador(scanner);
                    break;
                case 3:
                    menuConversor(scanner);
                    break;
                case 4:
                    menuOperacionesConListas(scanner);
                    break;
                case 5:
                    menuManipulacionDeCadenas(scanner);
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

            System.out.println();
        } while (opcion != 0);
    }

    // ========= MENÚ NIVEL INTERMEDIO =========
    private static void menuNivelIntermedio(Scanner scanner) {
        int opcion;

        // Estructuras persistentes durante el submenú
        Agenda agenda = new Agenda();
        CuentaBancaria cuenta = null;
        Carrito carrito = new Carrito();
        RegistroEmpleados registro = new RegistroEmpleados();

        do {
            System.out.println("========= MENÚ NIVEL INTERMEDIO =========");
            System.out.println("6. Clase Estudiante");
            System.out.println("7. Sistema de Contactos");
            System.out.println("8. Cuenta Bancaria Simple");
            System.out.println("9. Carrito de Compras");
            System.out.println("10. Registro de Empleados");
            System.out.println("0. Volver");
            System.out.print("Elige una opción: ");

            opcion = leerEntero(scanner);

            switch (opcion) {
                case 6:
                    ejecutarClaseEstudiante(scanner);
                    break;
                case 7:
                    menuAgenda(scanner, agenda);
                    break;
                case 8:
                    cuenta = menuCuentaBancaria(scanner, cuenta);
                    break;
                case 9:
                    menuCarrito(scanner, carrito);
                    break;
                case 10:
                    menuRegistroEmpleados(scanner, registro);
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

            System.out.println();
        } while (opcion != 0);
    }

    // ========= MENÚ NIVEL AVANZADO =========
    private static void menuNivelAvanzado(Scanner scanner) {
        int opcion;

        Biblioteca biblioteca = new Biblioteca();
        Hotel hotel = new Hotel("Hotel Ejercicio");
        Juego juego = new Juego();

        do {
            System.out.println("========= MENÚ NIVEL AVANZADO =========");
            System.out.println("11. Jerarquía de Vehículos");
            System.out.println("12. Sistema de Figuras Geométricas");
            System.out.println("13. Gestión de Biblioteca");
            System.out.println("14. Sistema de Reservas de Hotel");
            System.out.println("15. Juego de Dados");
            System.out.println("0. Volver");
            System.out.print("Elige una opción: ");

            opcion = leerEntero(scanner);

            switch (opcion) {
                case 11:
                    menuVehiculos(scanner);
                    break;
                case 12:
                    menuFiguras(scanner);
                    break;
                case 13:
                    menuBiblioteca(scanner, biblioteca);
                    break;
                case 14:
                    menuHotel(scanner, hotel);
                    break;
                case 15:
                    menuJuegoDados(scanner, juego);
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

            System.out.println();
        } while (opcion != 0);
    }

    // ========= MENÚ CALCULADORA =========
    private static void menuCalculadora(Scanner scanner) {
        int opcion;
        do {
            System.out.println("--- Calculadora básica ---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz cuadrada");
            System.out.println("0. Volver");
            System.out.print("Elige una opción: ");

            opcion = leerEntero(scanner);

            switch (opcion) {
                case 1: {
                    System.out.print("Ingresa el primer número entero: ");
                    int n1 = leerEntero(scanner);
                    System.out.print("Ingresa el segundo número entero: ");
                    int n2 = leerEntero(scanner);
                    System.out.println("Resultado de la suma: " + CalculadoraBasica.sumar(n1, n2));
                    break;
                }
                case 2: {
                    System.out.print("Ingresa el primer número entero: ");
                    int n1 = leerEntero(scanner);
                    System.out.print("Ingresa el segundo número entero: ");
                    int n2 = leerEntero(scanner);
                    System.out.println("Resultado de la resta: " + CalculadoraBasica.restar(n1, n2));
                    break;
                }
                case 3: {
                    System.out.print("Ingresa el primer número entero: ");
                    int n1 = leerEntero(scanner);
                    System.out.print("Ingresa el segundo número entero: ");
                    int n2 = leerEntero(scanner);
                    System.out.println("Resultado de la multiplicación: " + CalculadoraBasica.multiplicar(n1, n2));
                    break;
                }
                case 4: {
                    System.out.print("Ingresa el primer número entero: ");
                    int n1 = leerEntero(scanner);
                    int n2;
                    while (true) {
                        System.out.print("Ingresa el segundo número entero (distinto de 0): ");
                        n2 = leerEntero(scanner);
                        try {
                            System.out.println("Resultado de la división: " + CalculadoraBasica.dividir(n1, n2));
                            break;
                        } catch (ArithmeticException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                    break;
                }
                case 5: {
                    System.out.print("Ingresa la base: ");
                    int base = leerEntero(scanner);
                    while (true) {
                        System.out.print("Ingresa el exponente (>= 0): ");
                        int exponente = leerEntero(scanner);
                        try {
                            System.out.println("Resultado de la potencia: " + CalculadoraBasica.calcularPotencia(base, exponente));
                            break;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                    break;
                }
                case 6: {
                    while (true) {
                        System.out.print("Ingresa un número con raíz cuadrada exacta (cuadrado perfecto): ");
                        int numeroRaiz = leerEntero(scanner);
                        try {
                            System.out.println("Raíz cuadrada (entera): " + CalculadoraBasica.calcularRaizCuadrada(numeroRaiz));
                            break;
                        } catch (IllegalArgumentException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                    break;
                }
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

            System.out.println();
        } while (opcion != 0);
    }

    // ========= MENÚ VALIDADOR =========
    private static void menuValidador(Scanner scanner) {
        System.out.println("--- Validador de números ---");

        System.out.print("Ingresa un número entero para saber si es par: ");
        int nPar = leerEntero(scanner);
        ValidadorDeNumeros.esPar(nPar);

        System.out.print("Ingresa un número entero para saber si es primo: ");
        int nPrimo = leerEntero(scanner);
        ValidadorDeNumeros.esPrimo(nPrimo);

        System.out.print("Ingresa un número entero para saber si es perfecto: ");
        int nPerfecto = leerEntero(scanner);
        ValidadorDeNumeros.esPerfecto(nPerfecto);

        System.out.print("Ingresa un número entero para saber si es palíndromo: ");
        int nPalindromo = leerEntero(scanner);
        ValidadorDeNumeros.esPalindromo(nPalindromo);
    }

    // ========= MENÚ CONVERSOR =========
    private static void menuConversor(Scanner scanner) {
        System.out.println("--- Conversor de unidades ---");

        // Temperatura
        System.out.print("Ingresa grados Celsius: ");
        double celsius = leerDouble(scanner);
        System.out.println("Celsius a Fahrenheit: " + ConversorDeUnidades.convertirCelsiusAFahrenheit(celsius));
        System.out.println("Celsius a Kelvin: " + ConversorDeUnidades.convertirCelsiusAKelvin(celsius));

        System.out.print("Ingresa grados Fahrenheit: ");
        double fahrenheit = leerDouble(scanner);
        System.out.println("Fahrenheit a Celsius: " + ConversorDeUnidades.convertirFahrenheitACelsius(fahrenheit));
        System.out.println("Fahrenheit a Kelvin: " + ConversorDeUnidades.convertirFahrenheitAKelvin(fahrenheit));

        System.out.print("Ingresa grados Kelvin: ");
        double kelvin = leerDouble(scanner);
        System.out.println("Kelvin a Celsius: " + ConversorDeUnidades.convertirKelvinACelsius(kelvin));
        System.out.println("Kelvin a Fahrenheit: " + ConversorDeUnidades.convertirKelvinAFahrenheit(kelvin));

        // Longitud
        System.out.print("Ingresa metros: ");
        double metros = leerDouble(scanner);
        System.out.println("Metros a kilómetros: " + ConversorDeUnidades.convertirMetrosAKilometros(metros));
        System.out.println("Metros a millas: " + ConversorDeUnidades.convertirMetrosAMillas(metros));

        System.out.print("Ingresa kilómetros: ");
        double kilometros = leerDouble(scanner);
        System.out.println("Kilómetros a metros: " + ConversorDeUnidades.convertirKilometrosAMetros(kilometros));
        System.out.println("Kilómetros a millas: " + ConversorDeUnidades.convertirKilometrosAMillas(kilometros));

        System.out.print("Ingresa millas: ");
        double millas = leerDouble(scanner);
        System.out.println("Millas a metros: " + ConversorDeUnidades.convertirMillasAMetros(millas));
        System.out.println("Millas a kilómetros: " + ConversorDeUnidades.convertirMillasAKilometros(millas));

        // Peso
        System.out.print("Ingresa libras: ");
        double libras = leerDouble(scanner);
        System.out.println("Libras a kilogramos: " + ConversorDeUnidades.convertirLibrasAKilogramos(libras));
        System.out.println("Libras a onzas: " + ConversorDeUnidades.convertirLibrasAOnzas(libras));

        System.out.print("Ingresa kilogramos: ");
        double kilogramos = leerDouble(scanner);
        System.out.println("Kilogramos a libras: " + ConversorDeUnidades.convertirKilogramosALibras(kilogramos));
        System.out.println("Kilogramos a onzas: " + ConversorDeUnidades.convertirKilogramosAOnzas(kilogramos));

        System.out.print("Ingresa onzas: ");
        double onzas = leerDouble(scanner);
        System.out.println("Onzas a libras: " + ConversorDeUnidades.convertirOnzasALibras(onzas));
        System.out.println("Onzas a kilogramos: " + ConversorDeUnidades.convertirOnzasAKilogramos(onzas));

        // Tiempo
        System.out.print("Ingresa segundos: ");
        double segundos = leerDouble(scanner);
        System.out.println("Segundos a minutos: " + ConversorDeUnidades.convertirSegundosAMinutos(segundos));
        System.out.println("Segundos a horas: " + ConversorDeUnidades.convertirSegundosAHoras(segundos));

        System.out.print("Ingresa minutos: ");
        double minutos = leerDouble(scanner);
        System.out.println("Minutos a segundos: " + ConversorDeUnidades.convertirMinutosASegundos(minutos));
        System.out.println("Minutos a horas: " + ConversorDeUnidades.convertirMinutosAHoras(minutos));

        System.out.print("Ingresa horas: ");
        double horas = leerDouble(scanner);
        System.out.println("Horas a segundos: " + ConversorDeUnidades.convertirHorasASegundos(horas));
        System.out.println("Horas a minutos: " + ConversorDeUnidades.convertirHorasAMinutos(horas));
    }

    // ========= MENÚ OPERACIONES CON LISTAS =========
    private static void menuOperacionesConListas(Scanner scanner) {
        System.out.println("--- Operaciones con listas (arreglos) ---");
        System.out.print("¿Cuántos elementos tendrá la lista? ");
        int n = leerEntero(scanner);

        int[] lista = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            lista[i] = leerEntero(scanner);
        }

        OperacionesConListas.encontrarMayor(lista);
        OperacionesConListas.encontrarMenor(lista);
        OperacionesConListas.calcularPromedio(lista);
        OperacionesConListas.eliminarDuplicados(lista);
        OperacionesConListas.ordenarLista(lista);
    }

    // ========= MENÚ MANIPULACIÓN DE CADENAS =========
    private static void menuManipulacionDeCadenas(Scanner scanner) {
        System.out.println("--- Manipulación de cadenas ---");
        System.out.print("Ingresa una cadena de texto: ");
        String cadena = leerLineaCompleta(scanner);

        System.out.println(ManipulacionDeCadenas.contarVocales(cadena));
        System.out.println(ManipulacionDeCadenas.cualquierCosa(cadena));
        System.out.println(ManipulacionDeCadenas.invertirCadena(cadena));
        System.out.println(ManipulacionDeCadenas.contarPalabras(cadena));
    }

    // ========= EJERCICIO 6: ESTUDIANTE =========
    private static void ejecutarClaseEstudiante(Scanner scanner) {
        System.out.println("--- Clase Estudiante ---");
        System.out.print("Nombre del estudiante: ");
        String nombre = leerLineaCompleta(scanner);
        System.out.print("Edad: ");
        int edad = leerEntero(scanner);

        Estudiante estudiante = new Estudiante(nombre, edad);

        while (true) {
            System.out.print("Ingresa una calificación (o -1 para terminar): ");
            double cal = leerDouble(scanner);
            if (cal == -1) break;
            estudiante.agregarCalificacion(cal);
        }

        System.out.println();
        System.out.println(estudiante.mostrarInformacionCompleta());
    }

    // ========= EJERCICIO 7: AGENDA =========
    private static void menuAgenda(Scanner scanner, Agenda agenda) {
        int opcion;
        do {
            System.out.println("--- Sistema de Contactos (Agenda) ---");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Eliminar contacto por nombre");
            System.out.println("3. Buscar por nombre");
            System.out.println("4. Listar todos");
            System.out.println("0. Volver");
            System.out.print("Elige una opción: ");

            opcion = leerEntero(scanner);

            switch (opcion) {
                case 1: {
                    System.out.print("Nombre: ");
                    String nombre = leerLineaCompleta(scanner);
                    System.out.print("Teléfono: ");
                    String telefono = leerLineaCompleta(scanner);
                    System.out.print("Email: ");
                    String email = leerLineaCompleta(scanner);
                    agenda.agregar(new Contacto(nombre, telefono, email));
                    System.out.println("Contacto agregado.");
                    break;
                }
                case 2: {
                    System.out.print("Nombre a eliminar: ");
                    String nombre = leerLineaCompleta(scanner);
                    boolean ok = agenda.eliminarPorNombre(nombre);
                    System.out.println(ok ? "Contacto eliminado." : "No se encontró el contacto.");
                    break;
                }
                case 3: {
                    System.out.print("Nombre a buscar: ");
                    String nombre = leerLineaCompleta(scanner);
                    Contacto c = agenda.buscarPorNombre(nombre);
                    System.out.println(c == null ? "No se encontró el contacto." : c.mostrar());
                    break;
                }
                case 4: {
                    ArrayList<Contacto> lista = agenda.listarTodos();
                    if (lista.isEmpty()) {
                        System.out.println("(Agenda vacía)");
                    } else {
                        for (Contacto c : lista) {
                            System.out.println(c.mostrar());
                        }
                    }
                    break;
                }
                case 0:
                    System.out.println("Volviendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

            System.out.println();
        } while (opcion != 0);
    }

    // ========= EJERCICIO 8: CUENTA BANCARIA =========
    private static CuentaBancaria menuCuentaBancaria(Scanner scanner, CuentaBancaria cuenta) {
        int opcion;
        do {
            System.out.println("--- Cuenta Bancaria Simple ---");
            System.out.println("1. Crear cuenta");
            System.out.println("2. Depositar");
            System.out.println("3. Retirar");
            System.out.println("4. Consultar saldo");
            System.out.println("0. Volver");
            System.out.print("Elige una opción: ");

            opcion = leerEntero(scanner);

            switch (opcion) {
                case 1: {
                    System.out.print("Titular: ");
                    String titular = leerLineaCompleta(scanner);
                    System.out.print("Número de cuenta: ");
                    String numero = leerLineaCompleta(scanner);
                    cuenta = new CuentaBancaria(titular, numero);
                    System.out.println("Cuenta creada para " + cuenta.getTitular() + " (" + cuenta.getNumeroCuenta() + ").");
                    break;
                }
                case 2: {
                    if (cuenta == null) {
                        System.out.println("Primero debes crear una cuenta.");
                        break;
                    }
                    System.out.print("Monto a depositar: ");
                    double monto = leerDouble(scanner);
                    cuenta.depositar(monto);
                    break;
                }
                case 3: {
                    if (cuenta == null) {
                        System.out.println("Primero debes crear una cuenta.");
                        break;
                    }
                    System.out.print("Monto a retirar: ");
                    double monto = leerDouble(scanner);
                    cuenta.retirar(monto);
                    break;
                }
                case 4: {
                    if (cuenta == null) {
                        System.out.println("Primero debes crear una cuenta.");
                        break;
                    }
                    System.out.println("Saldo actual: " + cuenta.consultarSaldo());
                    break;
                }
                case 0:
                    System.out.println("Volviendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

            System.out.println();
        } while (opcion != 0);
        return cuenta;
    }

    // ========= EJERCICIO 9: CARRITO =========
    private static void menuCarrito(Scanner scanner, Carrito carrito) {
        int opcion;
        do {
            System.out.println("--- Carrito de Compras ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Listar productos");
            System.out.println("4. Calcular total");
            System.out.println("5. Aplicar descuento (%)");
            System.out.println("0. Volver");
            System.out.print("Elige una opción: ");

            opcion = leerEntero(scanner);

            switch (opcion) {
                case 1: {
                    System.out.print("Nombre del producto: ");
                    String nombre = leerLineaCompleta(scanner);
                    System.out.print("Precio: ");
                    double precio = leerDouble(scanner);
                    System.out.print("Cantidad: ");
                    int cantidad = leerEntero(scanner);
                    carrito.agregarProducto(new Producto(nombre, precio, cantidad));
                    System.out.println("Producto agregado.");
                    break;
                }
                case 2: {
                    System.out.print("Nombre del producto a eliminar: ");
                    String nombre = leerLineaCompleta(scanner);
                    boolean ok = carrito.eliminarProducto(nombre);
                    System.out.println(ok ? "Producto eliminado." : "No se encontró el producto.");
                    break;
                }
                case 3: {
                    ArrayList<Producto> lista = carrito.listarProductos();
                    if (lista.isEmpty()) {
                        System.out.println("(Carrito vacío)");
                    } else {
                        for (Producto p : lista) {
                            System.out.println(p.mostrar());
                        }
                    }
                    break;
                }
                case 4:
                    System.out.println("Total: " + carrito.calcularTotal());
                    break;
                case 5: {
                    System.out.print("Porcentaje de descuento: ");
                    double porcentaje = leerDouble(scanner);
                    System.out.println("Total con descuento: " + carrito.aplicarDescuento(porcentaje));
                    break;
                }
                case 0:
                    System.out.println("Volviendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

            System.out.println();
        } while (opcion != 0);
    }

    // ========= EJERCICIO 10: EMPLEADOS =========
    private static void menuRegistroEmpleados(Scanner scanner, RegistroEmpleados registro) {
        int opcion;
        do {
            System.out.println("--- Registro de Empleados ---");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Buscar por ID");
            System.out.println("3. Listar empleados");
            System.out.println("4. Ver salario anual por ID");
            System.out.println("5. Aplicar aumento (%) por ID");
            System.out.println("0. Volver");
            System.out.print("Elige una opción: ");

            opcion = leerEntero(scanner);

            switch (opcion) {
                case 1: {
                    System.out.print("Nombre: ");
                    String nombre = leerLineaCompleta(scanner);
                    System.out.print("ID: ");
                    String id = leerLineaCompleta(scanner);
                    System.out.print("Salario mensual: ");
                    double salario = leerDouble(scanner);
                    System.out.print("Departamento: ");
                    String depto = leerLineaCompleta(scanner);
                    registro.agregar(new Empleado(nombre, id, salario, depto));
                    System.out.println("Empleado agregado.");
                    break;
                }
                case 2: {
                    System.out.print("ID a buscar: ");
                    String id = leerLineaCompleta(scanner);
                    Empleado e = registro.buscarPorId(id);
                    System.out.println(e == null ? "No se encontró el empleado." : e.mostrar());
                    break;
                }
                case 3: {
                    ArrayList<Empleado> lista = registro.listar();
                    if (lista.isEmpty()) {
                        System.out.println("(Sin empleados)");
                    } else {
                        for (Empleado e : lista) {
                            System.out.println(e.mostrar());
                        }
                    }
                    break;
                }
                case 4: {
                    System.out.print("ID del empleado: ");
                    String id = leerLineaCompleta(scanner);
                    Empleado e = registro.buscarPorId(id);
                    if (e == null) {
                        System.out.println("No se encontró el empleado.");
                    } else {
                        System.out.println("Salario anual: " + e.salarioAnual());
                    }
                    break;
                }
                case 5: {
                    System.out.print("ID del empleado: ");
                    String id = leerLineaCompleta(scanner);
                    Empleado e = registro.buscarPorId(id);
                    if (e == null) {
                        System.out.println("No se encontró el empleado.");
                    } else {
                        System.out.print("Porcentaje de aumento: ");
                        double porcentaje = leerDouble(scanner);
                        e.aplicarAumentoPorcentual(porcentaje);
                        System.out.println("Actualizado: " + e.mostrar());
                    }
                    break;
                }
                case 0:
                    System.out.println("Volviendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

            System.out.println();
        } while (opcion != 0);
    }

    // ========= EJERCICIO 11: VEHÍCULOS =========
    private static void menuVehiculos(Scanner scanner) {
        System.out.println("--- Jerarquía de Vehículos ---");
        System.out.println("1. Crear Auto");
        System.out.println("2. Crear Moto");
        System.out.println("3. Crear Camión");
        System.out.print("Elige un vehículo: ");
        int tipo = leerEntero(scanner);

        System.out.print("Marca: ");
        String marca = leerLineaCompleta(scanner);
        System.out.print("Modelo: ");
        String modelo = leerLineaCompleta(scanner);
        System.out.print("Año: ");
        int anio = leerEntero(scanner);

        Vehiculo vehiculo = null;
        switch (tipo) {
            case 1:
                System.out.print("Número de puertas: ");
                int puertas = leerEntero(scanner);
                vehiculo = new Auto(marca, modelo, anio, puertas);
                break;
            case 2:
                System.out.print("Cilindrada (cc): ");
                int cilindrada = leerEntero(scanner);
                vehiculo = new Moto(marca, modelo, anio, cilindrada);
                break;
            case 3:
                System.out.print("Capacidad en toneladas: ");
                double toneladas = leerDouble(scanner);
                vehiculo = new Camion(marca, modelo, anio, toneladas);
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }
        System.out.println(vehiculo.mostrar());
    }

    // ========= EJERCICIO 12: FIGURAS =========
    private static void menuFiguras(Scanner scanner) {
        System.out.println("--- Sistema de Figuras Geométricas ---");
        System.out.println("1. Círculo");
        System.out.println("2. Rectángulo");
        System.out.println("3. Triángulo");
        System.out.print("Elige una figura: ");
        int tipo = leerEntero(scanner);

        Figura figura = null;
        switch (tipo) {
            case 1:
                System.out.print("Radio: ");
                double radio = leerDouble(scanner);
                figura = new Circulo(radio);
                break;
            case 2:
                System.out.print("Base: ");
                double base = leerDouble(scanner);
                System.out.print("Altura: ");
                double altura = leerDouble(scanner);
                figura = new Rectangulo(base, altura);
                break;
            case 3:
                System.out.print("Lado 1: ");
                double l1 = leerDouble(scanner);
                System.out.print("Lado 2: ");
                double l2 = leerDouble(scanner);
                System.out.print("Lado 3: ");
                double l3 = leerDouble(scanner);
                try {
                    figura = new Triangulo(l1, l2, l3);
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                    return;
                }
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }
        System.out.println(figura.mostrar());
    }

    // ========= EJERCICIO 13: BIBLIOTECA =========
    private static void menuBiblioteca(Scanner scanner, Biblioteca biblioteca) {
        int opcion;
        do {
            System.out.println("--- Gestión de Biblioteca ---");
            System.out.println("1. Agregar libro");
            System.out.println("2. Registrar usuario");
            System.out.println("3. Prestar libro");
            System.out.println("4. Devolver libro");
            System.out.println("5. Listar libros");
            System.out.println("6. Listar usuarios");
            System.out.println("0. Volver");
            System.out.print("Elige una opción: ");

            opcion = leerEntero(scanner);

            switch (opcion) {
                case 1: {
                    System.out.print("Título: ");
                    String titulo = leerLineaCompleta(scanner);
                    System.out.print("Autor: ");
                    String autor = leerLineaCompleta(scanner);
                    System.out.print("ISBN: ");
                    String isbn = leerLineaCompleta(scanner);
                    biblioteca.agregarLibro(new Libro(titulo, autor, isbn));
                    System.out.println("Libro agregado.");
                    break;
                }
                case 2: {
                    System.out.print("Nombre del usuario: ");
                    String nombre = leerLineaCompleta(scanner);
                    biblioteca.registrarUsuario(new Usuario(nombre));
                    System.out.println("Usuario registrado.");
                    break;
                }
                case 3: {
                    System.out.print("Nombre del usuario: ");
                    String nombre = leerLineaCompleta(scanner);
                    System.out.print("ISBN del libro: ");
                    String isbn = leerLineaCompleta(scanner);
                    System.out.println(biblioteca.prestarLibro(nombre, isbn));
                    break;
                }
                case 4: {
                    System.out.print("Nombre del usuario: ");
                    String nombre = leerLineaCompleta(scanner);
                    System.out.print("ISBN del libro: ");
                    String isbn = leerLineaCompleta(scanner);
                    System.out.println(biblioteca.devolverLibro(nombre, isbn));
                    break;
                }
                case 5: {
                    ArrayList<Libro> libros = biblioteca.listarLibros();
                    if (libros.isEmpty()) {
                        System.out.println("(Sin libros)");
                    } else {
                        for (Libro l : libros) {
                            System.out.println(l.mostrar());
                        }
                    }
                    break;
                }
                case 6: {
                    ArrayList<Usuario> usuarios = biblioteca.listarUsuarios();
                    if (usuarios.isEmpty()) {
                        System.out.println("(Sin usuarios)");
                    } else {
                        for (Usuario u : usuarios) {
                            System.out.println(u.mostrar());
                        }
                    }
                    break;
                }
                case 0:
                    System.out.println("Volviendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
            System.out.println();
        } while (opcion != 0);
    }

    // ========= EJERCICIO 14: HOTEL =========
    private static void menuHotel(Scanner scanner, Hotel hotel) {
        int opcion;
        do {
            System.out.println("--- Sistema de Reservas de Hotel ---");
            System.out.println("1. Agregar habitación");
            System.out.println("2. Hacer reserva");
            System.out.println("3. Cancelar reserva");
            System.out.println("4. Listar habitaciones");
            System.out.println("5. Listar reservas");
            System.out.println("0. Volver");
            System.out.print("Elige una opción: ");

            opcion = leerEntero(scanner);

            switch (opcion) {
                case 1: {
                    System.out.print("Número de habitación: ");
                    int num = leerEntero(scanner);
                    System.out.print("Tipo (simple/doble/suite): ");
                    String tipo = leerLineaCompleta(scanner);
                    System.out.print("Precio por noche: ");
                    double precio = leerDouble(scanner);
                    hotel.agregarHabitacion(new Habitacion(num, tipo, precio));
                    System.out.println("Habitación agregada.");
                    break;
                }
                case 2: {
                    System.out.print("Nombre del cliente: ");
                    String cliente = leerLineaCompleta(scanner);
                    System.out.print("Tipo de habitación: ");
                    String tipo = leerLineaCompleta(scanner);
                    System.out.print("Número de días: ");
                    int dias = leerEntero(scanner);
                    System.out.println(hotel.hacerReserva(cliente, tipo, dias));
                    break;
                }
                case 3: {
                    System.out.print("Número de habitación: ");
                    int num = leerEntero(scanner);
                    System.out.println(hotel.cancelarReserva(num));
                    break;
                }
                case 4: {
                    ArrayList<Habitacion> habitaciones = hotel.listarHabitaciones();
                    if (habitaciones.isEmpty()) {
                        System.out.println("(Sin habitaciones)");
                    } else {
                        for (Habitacion h : habitaciones) {
                            System.out.println(h.mostrar());
                        }
                    }
                    break;
                }
                case 5: {
                    ArrayList<Reserva> reservas = hotel.listarReservas();
                    if (reservas.isEmpty()) {
                        System.out.println("(Sin reservas)");
                    } else {
                        for (Reserva r : reservas) {
                            System.out.println(r.mostrar());
                        }
                    }
                    break;
                }
                case 0:
                    System.out.println("Volviendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
            System.out.println();
        } while (opcion != 0);
    }

    // ========= EJERCICIO 15: JUEGO DE DADOS =========
    private static void menuJuegoDados(Scanner scanner, Juego juego) {
        int opcion;
        do {
            System.out.println("--- Juego de Dados ---");
            System.out.println("1. Agregar jugador");
            System.out.println("2. Jugar ronda");
            System.out.println("3. Ver resultados");
            System.out.println("0. Volver");
            System.out.print("Elige una opción: ");

            opcion = leerEntero(scanner);

            switch (opcion) {
                case 1: {
                    System.out.print("Nombre del jugador: ");
                    String nombre = leerLineaCompleta(scanner);
                    juego.agregarJugador(nombre);
                    System.out.println("Jugador agregado.");
                    break;
                }
                case 2: {
                    if (juego.getJugadores().size() < 2) {
                        System.out.println("Se necesitan al menos 2 jugadores.");
                        break;
                    }
                    juego.jugarRonda();
                    System.out.println("Resultados de la ronda:");
                    for (Jugador j : juego.getJugadores()) {
                        System.out.println(j.mostrar());
                    }
                    Jugador ganador = juego.determinarGanador();
                    System.out.println("Ganador: " + ganador.getNombre() + " con " + ganador.getPuntos() + " puntos!");
                    break;
                }
                case 3: {
                    if (juego.getJugadores().isEmpty()) {
                        System.out.println("(Sin jugadores)");
                    } else {
                        for (Jugador j : juego.getJugadores()) {
                            System.out.println(j.mostrar());
                        }
                    }
                    break;
                }
                case 0:
                    System.out.println("Volviendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
            System.out.println();
        } while (opcion != 0);
    }

    // ========= MÉTODOS AUXILIARES DE LECTURA =========
    private static int leerEntero(Scanner scanner) {
        while (true) {
            try {
                String input = scanner.nextLine().trim();
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.print("Valor no válido. Ingresa un número entero: ");
            }
        }
    }

    private static double leerDouble(Scanner scanner) {
        while (true) {
            try {
                String input = scanner.nextLine().trim();
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.print("Valor no válido. Ingresa un número: ");
            }
        }
    }

    private static String leerLineaCompleta(Scanner scanner) {
        return scanner.nextLine();
    }
}

