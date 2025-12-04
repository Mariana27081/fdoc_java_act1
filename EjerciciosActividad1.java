public class EjerciciosActividad1 {
    public static void main(String[] args) {
        
        // --- Declaración de variables ---
        System.out.println("\n=== Declaración de variables ===");
        
        // 1. Declaración de int y asignación, luego impresión
        int numeroEntero = 10;
        System.out.println("Variable int: " + numeroEntero);
        
        // 2. Declaración y asignación en una línea de double
        double numeroDecimal = 15.75;
        System.out.println("Variable double: " + numeroDecimal);
        
        // 3. Declaración de String con texto y impresión
        String texto = "Hola, mundo!";
        System.out.println("Variable String: " + texto);
        
        // --- Tipos de datos primitivos ---
        System.out.println("\n=== Tipos de datos primitivos ===");
        
        // 1. Declaraciones de todos los tipos primitivos
        byte valorByte = 127;
        short valorShort = 32767;
        int valorInt = 2147483647;
        long valorLong = 9223372036854775807L;
        float valorFloat = 3.1416f;
        double valorDouble = 2.71828;
        boolean valorBoolean = true;
        char valorChar = 'A';
        
        System.out.println("byte: " + valorByte);
        System.out.println("short: " + valorShort);
        System.out.println("int: " + valorInt);
        System.out.println("long: " + valorLong);
        System.out.println("float: " + valorFloat);
        System.out.println("double: " + valorDouble);
        System.out.println("boolean: " + valorBoolean);
        System.out.println("char: " + valorChar);
        
        // 2. Operación aritmética básica con enteros
        int a = 15;
        int b = 4;
        int suma = a + b;
        System.out.println("Suma de " + a + " + " + b + " = " + suma);
        
        // 3. Uso de boolean con condicional
        boolean esMayor = a > b;
        if (esMayor) {
            System.out.println(a + " es mayor que " + b);
        } else {
            System.out.println(a + " no es mayor que " + b);
        }
        
        // --- Tipos de datos no primitivos ---
        System.out.println("\n=== Tipos de datos no primitivos ===");
        
        // 1. String con texto
        String saludo = "Bienvenido a Java";
        System.out.println("String: " + saludo);
        
        // 2. Arreglo int[] de tamaño 3
        int[] numeros = new int[3];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        System.out.println("Arreglo: " + numeros[0] + ", " + numeros[1] + ", " + numeros[2]);
        
        // 3. Clase Persona simple
        class Persona {
            String nombre;
            int edad;
            
            Persona(String nombre, int edad) {
                this.nombre = nombre;
                this.edad = edad;
            }
        }
        
        Persona persona = new Persona("Juan Pérez", 25);
        System.out.println("Persona: " + persona.nombre + ", " + persona.edad + " años");
        
        // --- Operadores aritméticos ---
        System.out.println("\n=== Operadores aritméticos ===");
        
        // 1. Cálculo de todas las operaciones básicas
        int x = 20;
        int y = 6;
        
        System.out.println("Suma: " + x + " + " + y + " = " + (x + y));
        System.out.println("Resta: " + x + " - " + y + " = " + (x - y));
        System.out.println("Multiplicación: " + x + " * " + y + " = " + (x * y));
        System.out.println("División: " + x + " / " + y + " = " + (x / y));
        System.out.println("Módulo: " + x + " % " + y + " = " + (x % y));
        
        // 2. División entera vs decimal
        double divisionDecimal = (double) x / y;
        int divisionEntera = x / y;
        System.out.println("División decimal: " + x + " / " + y + " = " + divisionDecimal);
        System.out.println("División entera: " + x + " / " + y + " = " + divisionEntera);
        
        // 3. Incremento y decremento
        int contador = 5;
        System.out.println("Valor inicial: " + contador);
        contador++;
        System.out.println("Después de incremento (contador++): " + contador);
        contador--;
        System.out.println("Después de decremento (contador--): " + contador);
        
        // --- Operadores de asignación ---
        System.out.println("\n=== Operadores de asignación ===");
        
        // 1. Uso de += y -=
        int valor = 10;
        System.out.println("Valor inicial: " + valor);
        valor += 5;  // valor = valor + 5
        System.out.println("Después de valor += 5: " + valor);
        valor -= 3;  // valor = valor - 3
        System.out.println("Después de valor -= 3: " + valor);
        
        // 2. Uso de *= y /=
        int numero = 8;
        System.out.println("\nNúmero inicial: " + numero);
        numero *= 4;  // numero = numero * 4
        System.out.println("Después de numero *= 4: " + numero);
        numero /= 2;  // numero = numero / 2
        System.out.println("Después de numero /= 2: " + numero);
        
        // 3. Uso de %=
        int resto = 17;
        System.out.println("\nValor inicial: " + resto);
        resto %= 5;  // resto = resto % 5
        System.out.println("Después de resto %= 5: " + resto);
        System.out.println("Explicación: 17 % 5 = 2 (resto de la división entera)");
        
        // --- Operadores de comparación ---
        System.out.println("\n=== Operadores de comparación ===");
        
        // 1. Comparaciones con == y !=
        int m = 10;
        int n = 20;
        System.out.println(m + " == " + n + " ? " + (m == n));
        System.out.println(m + " != " + n + " ? " + (m != n));
        
        // 2. Comparaciones con >, <, >=, <=
        System.out.println("\n" + m + " > " + n + " ? " + (m > n));
        System.out.println(m + " < " + n + " ? " + (m < n));
        System.out.println(m + " >= " + n + " ? " + (m >= n));
        System.out.println(m + " <= " + n + " ? " + (m <= n));
        
        // 3. Uso de if con comparaciones
        int p = 15;
        int q = 15;
        if (p > q) {
            System.out.println("\n" + p + " es mayor que " + q);
        } else if (p < q) {
            System.out.println("\n" + p + " es menor que " + q);
        } else {
            System.out.println("\n" + p + " es igual a " + q);
        }
        
        // --- Operadores lógicos ---
        System.out.println("\n=== Operadores lógicos ===");
        
        // 1. Expresiones con && y ||
        boolean condicion1 = true;
        boolean condicion2 = false;
        System.out.println("true && false = " + (condicion1 && condicion2));
        System.out.println("true || false = " + (condicion1 || condicion2));
        
        // 2. Uso de ! (negación)
        boolean estado = true;
        System.out.println("\nEstado original: " + estado);
        System.out.println("Negación (!estado): " + (!estado));
        
        // 3. Condición compuesta con paréntesis
        int edad = 25;
        boolean tieneLicencia = true;
        boolean puedeConducir = (edad >= 18) && tieneLicencia;
        System.out.println("\nEdad: " + edad + ", Tiene licencia: " + tieneLicencia);
        System.out.println("Puede conducir? " + puedeConducir);
        
        // --- If ---
        System.out.println("\n=== If ===");
        
        // 1. If simple
        int num1 = 30;
        int num2 = 20;
        if (num1 > num2) {
            System.out.println(num1 + " es mayor que " + num2);
        }
        
        // 2. If-else
        int calificacion = 75;
        if (calificacion >= 60) {
            System.out.println("Aprobado con " + calificacion + " puntos");
        } else {
            System.out.println("Reprobado con " + calificacion + " puntos");
        }
        
        // 3. If-else if-else con rangos
        int puntuacion = 85;
        if (puntuacion >= 90) {
            System.out.println("Categoría: Excelente");
        } else if (puntuacion >= 70) {
            System.out.println("Categoría: Bueno");
        } else if (puntuacion >= 50) {
            System.out.println("Categoría: Regular");
        } else {
            System.out.println("Categoría: Insuficiente");
        }
        
        // --- Operador ternario ---
        System.out.println("\n=== Operador ternario ===");
        
        // 1. Mayoría de edad
        int edadPersona = 17;
        String mensajeEdad = (edadPersona >= 18) ? "Mayor de edad" : "Menor de edad";
        System.out.println("Edad: " + edadPersona + " -> " + mensajeEdad);
        
        // 2. Descuento por cantidad
        int cantidadComprada = 15;
        double descuento = (cantidadComprada > 10) ? 0.10 : 0.0;
        System.out.println("Cantidad: " + cantidadComprada + " -> Descuento: " + (descuento * 100) + "%");
        
        // 3. Par o impar
        int numeroVerificar = 7;
        String paridad = (numeroVerificar % 2 == 0) ? "par" : "impar";
        System.out.println("Número " + numeroVerificar + " es " + paridad);
        
        // --- Switch ---
        System.out.println("\n=== Switch ===");
        
        // 1. Día de la semana a número
        String diaSemana = "Miércoles";
        int numeroDia;
        
        switch (diaSemana.toLowerCase()) {
            case "lunes":
                numeroDia = 1;
                break;
            case "martes":
                numeroDia = 2;
                break;
            case "miércoles":
            case "miercoles":
                numeroDia = 3;
                break;
            case "jueves":
                numeroDia = 4;
                break;
            case "viernes":
                numeroDia = 5;
                break;
            case "sábado":
            case "sabado":
                numeroDia = 6;
                break;
            case "domingo":
                numeroDia = 7;
                break;
            default:
                numeroDia = 0;
        }
        System.out.println(diaSemana + " -> Número: " + numeroDia);
        
        // 2. Calificación numérica a texto
        int nota = 88;
        String textoNota;
        
        switch (nota / 10) {
            case 10:
            case 9:
                textoNota = "Excelente";
                break;
            case 8:
                textoNota = "Muy Bueno";
                break;
            case 7:
                textoNota = "Bueno";
                break;
            case 6:
                textoNota = "Suficiente";
                break;
            default:
                textoNota = "Insuficiente";
        }
        System.out.println("Calificación " + nota + " -> " + textoNota);
        
        // 3. Estación del año según número
        int mes = 4;
        String estacion;
        
        switch (mes) {
            case 12:
            case 1:
            case 2:
                estacion = "Invierno";
                break;
            case 3:
            case 4:
            case 5:
                estacion = "Primavera";
                break;
            case 6:
            case 7:
            case 8:
                estacion = "Verano";
                break;
            case 9:
            case 10:
            case 11:
                estacion = "Otoño";
                break;
            default:
                estacion = "Mes inválido";
        }
        System.out.println("Mes " + mes + " -> Estación: " + estacion);
        
        // --- Otros ejemplos ---
        System.out.println("\n=== Otros ejemplos ===");
        
        // 1. Positivo, negativo o cero
        int numeroEvaluar = -5;
        if (numeroEvaluar > 0) {
            System.out.println(numeroEvaluar + " es positivo");
        } else if (numeroEvaluar < 0) {
            System.out.println(numeroEvaluar + " es negativo");
        } else {
            System.out.println("El número es cero");
        }
        
        // 2. Validación de contraseña
        String password = "admin123";
        String passwordEsperada = "admin123";
        
        if (password.equals(passwordEsperada)) {
            System.out.println("Contraseña válida");
        } else {
            System.out.println("Contraseña incorrecta");
        }
        
        // 3. Clasificación de calificación con if-else if-else
        int notaFinal = 92;
        String categoria;
        
        if (notaFinal >= 95) {
            categoria = "Sobresaliente";
        } else if (notaFinal >= 85) {
            categoria = "Notable";
        } else if (notaFinal >= 75) {
            categoria = "Bien";
        } else if (notaFinal >= 65) {
            categoria = "Suficiente";
        } else {
            categoria = "Insuficiente";
        }
        
        System.out.println("Nota: " + notaFinal + " -> Categoría: " + categoria);
        
        System.out.println("\n=== Todos los ejercicios completados ===");
    }
}