
package com.mycompany.reto3;
public class Reto3 {

    public static void main(String[] args) {
        Automovil carrito = new Automovil("123plc","chevrolet", 2020, 243.24, "morado", 60000000, "lindo", "vendedor");
        Vendedor vendedor1 = new Vendedor("1000378849", "Juan", "Bolibar", 23, 2020, 1560000000);
        System.out.println(vendedor1.calcularCalidad());
        System.out.println(carrito.calcularModelo());
    }
}
