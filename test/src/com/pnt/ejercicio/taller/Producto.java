package com.pnt.ejercicio;

import java.util.ArrayList;

//Ejercicio Escuelita Somos PNT

//Imaginemos un supermercado chico, de barrio.
//Crear un programa cuyo punto de entrada sea un main en donde, al ejecutarse, se visualiza lo siguiente por consola y se termina la ejecución:

//Nombre: Coca-Cola Zero /// Litros: 1.5 /// Precio: $20
//Nombre: Coca-Cola /// Litros: 1.5 /// Precio: $18
//Nombre: Shampoo Sedal /// Contenido: 500mm /// Precio: $30
//Nombre: Frutillas /// Precio: $64 /// Unidad de venta: kilo
//=============================
//Producto más caro: Frutillas
//Producto más barato: Coca-Cola

//La solución debe cumplir con los siguientes requisitos:
//Diseñar una solución orientada a objetos.
//La salida es por consola.
//Usar Java 8 básico, sin librerías ni frameworks externos.
//Cargar la lista de productos en un único método.

public class Producto {

	private static final String BARRA = "///";
	private static final String SEPARADOR = "============================";

	private int may, men;
	private static ArrayList<Producto> producto = new ArrayList<Producto>();
	private String nombre;
	private String contenido;
	private String precio;
	private static int tipo; // define tipo de
								// producto

	public Producto() {

		setProductos();
		getThemAll();

	}
	// constructor utilizado desde la misma clase en este caso, el valor
	// entero "tipo" sirve para identificar
	// el tipo de producto a fin de asignarle un valor de medida al imprimir por
	// consola

	public Producto(String nombre, String contenido, String precio, int tipo) {

		this.nombre = nombre;
		this.contenido = contenido;
		this.precio = precio;
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public String getContenido() {
		return contenido;
	}

	public String getPrecio() {
		return precio;
	}

	// Carga Lista de productos en un único método

	public void setProductos() {

		producto.add(new Producto("Coca-Cola Zero", "1.5", "20", 1));
		producto.add(new Producto("Coca-Cola", "1.5", "18", 1));
		producto.add(new Producto("Shampoo Sedal", "500", "20", 2));
		producto.add(new Producto("Frutillas", "1", "64", 3));
	}

	// Evalúa el tipo de artículo para imprimir unidad correcta en pantalla

	public String evaluaTipo(int tipo) {

		switch (tipo) {
		case 1:

			return "Litros (lt): ";
		case 2:
			return "Contenido (ml): ";
		case 3:
			return "Unidad de venta (kg): ";

		default:
			return "Indefinido: ";
		}
	}

	public int getTipo() {
		return tipo;
	}

	// Imprime toda la información por consola

	public void getThemAll() {

		for (Producto e : producto) {

			// Imprime la colección
			System.out.println("Nombre: " + e.getNombre() + BARRA + e.evaluaTipo(e.getTipo()) + e.getContenido() + BARRA
					+ "Precio: $" + e.getPrecio());

		}
		System.out.println(SEPARADOR);

		getMayMen();
	}

	// Evalúa el mayor y el menor valor en los precios de los productos de la
	// lista
	public void getMayMen() {

		int ref = Integer.parseInt(producto.get(0).getPrecio());
		for (int i = 1; i < producto.size(); i++) {

			int ref1 = Integer.parseInt(producto.get(i).getPrecio());

			if (ref < ref1) {

				ref = Integer.parseInt(producto.get(i).getPrecio());
				may = i;

			} else if (ref > ref1) {

				ref1 = Integer.parseInt(producto.get(i).getPrecio());
				men = i;

			}

		}

		System.out.println("Producto más caro: " + producto.get(may).getNombre());
		System.out.println("Producto más barato: " + producto.get(men).getNombre());

	}
}
