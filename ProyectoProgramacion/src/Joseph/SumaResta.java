/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Joseph;

/**
 *
 * @author joseph
 */
public class SumaResta {

    // ====== MÉTODOS SOBRECARGADOS PARA SUMA ======
    public int sumar(int a, int b) {
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public int sumar(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacío");
        }
        int total = 0;
        for (int n : numeros) total += n;
        return total;
    }

    // ====== MÉTODOS SOBRECARGADOS PARA RESTA ======
    public int restar(int a, int b) {
        return a - b;
    }

    public int restar(int a, int b, int c) {
        return a - b - c;
    }

    public int restar(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacío");
        }
        int total = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            total -= numeros[i];
        }
        return total;
    }

    public void SumaResta() {
        SumaResta sr = new SumaResta();

        try {
            int[] numeros = {20, 5, 3};

            System.out.println("Suma de 2: " + sr.sumar(5, 10));
            System.out.println("Suma de 3: " + sr.sumar(5, 10, 15));
            System.out.println("Suma de array: " + sr.sumar(numeros));

            System.out.println("Resta de 2: " + sr.restar(10, 5));
            System.out.println("Resta de 3: " + sr.restar(20, 5, 3));
            System.out.println("Resta de array: " + sr.restar(numeros));

        } catch (IllegalArgumentException e) {
            System.out.println("Error detectado: " + e.getMessage());
        }
    }
}
