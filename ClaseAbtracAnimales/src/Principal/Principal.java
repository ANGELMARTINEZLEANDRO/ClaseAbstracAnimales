package Principal;

import java.util.Scanner;

import Implemenatacion.ImpCarnivoro;
import Model.Carnivoros;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		String habitad;

		float peso;
		String comida;
		String categoria;
		Carnivoros AniCarnivoro;

		Scanner lectura = null;
		int mPrinc, mCarnivoro, subCarnivoro, indice;

		// INSTANCIA DE CLASE
		ImpCarnivoro impCarn = new ImpCarnivoro();
		do {
			System.out.println("MENU PRINCIPAL ANIMALES");
			System.out.println("1---CRUD CARNIVORO");
			System.out.println("2---SALIR");

			lectura = new Scanner(System.in);
			mPrinc = lectura.nextInt();

			switch (mPrinc) {
			case 1:
				do {
					System.out.println("MENU PRINCIPAL");
					System.out.println("1---ALTA");
					System.out.println("2---LISTAR");
					System.out.println("3---BUSCAR");
					System.out.println("4---EDITAR");
					System.out.println("5---ELIMINAR");
					System.out.println("6---REGRESAR MENU PRINCIPAL");
					lectura = new Scanner(System.in);
					mCarnivoro = lectura.nextInt();
					switch (mCarnivoro) {
					case 1:
						System.out.println("INGRESE EL NOMBRE DEL ANIMAL");
						lectura = new Scanner(System.in);
						nombre = lectura.nextLine();

						System.out.println("INGRESE EL HABITAD DEL ANIMAL");
						lectura = new Scanner(System.in);
						habitad = lectura.nextLine();

						System.out.println("INGRESE EL PESO");
						lectura = new Scanner(System.in);
						peso = lectura.nextFloat();

						System.out.println("INGRESE LA COMIDA DEL ANIMAL");
						lectura = new Scanner(System.in);
						comida = lectura.nextLine();

						System.out.println("INGRESE LA CATEGORIA DEL ANIMAL");
						lectura = new Scanner(System.in);
						categoria = lectura.nextLine();

						// OBJETO
						AniCarnivoro = new Carnivoros(nombre, habitad, peso, comida, categoria);

						// GUARDAR
						impCarn.guardar(AniCarnivoro);
						System.out.println("SE GUARDO");

						break;
					case 2:
						impCarn.listar();

						break;
					case 3:
						impCarn.indiceDescri();
						System.out.println("INGRESE EL INDICE A BUSCAR");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();

						// BUSCAR
						AniCarnivoro = (Carnivoros) impCarn.bucar(indice);
						System.out.println("SE ENCONTRO: " + AniCarnivoro);

						break;
					case 4:
						impCarn.indiceDescri();
						System.out.println("INGRESE EL INDICE A BUSCAR");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();

						// BUSCAR
						AniCarnivoro = (Carnivoros) impCarn.bucar(indice);
						System.out.println("SE ENCONTRO: " + AniCarnivoro);

						do {
							System.out.println("SUBMENU PARA EDITAR");
							System.out.println("1---PESO");
							System.out.println("2---CATEGORIA");
							System.out.println("3---REGRESAR MENU ANTERIOR.");
							lectura = new Scanner(System.in);
							subCarnivoro = lectura.nextInt();

							switch (subCarnivoro) {
							case 1:
								System.out.println("INGRESE EL NUEVO PESO");
								lectura = new Scanner(System.in);
								peso = lectura.nextFloat();

								// ACTUALIZACION
								AniCarnivoro.setPeso(peso);
								impCarn.editar(indice, AniCarnivoro);
								System.out.println("SE EDITO CORRECTAMENTE");
								break;
							case 2:
								System.out.println("INGRESE LA NUEVA CATEGORIA");
								lectura = new Scanner(System.in);
								categoria = lectura.nextLine();

								// ACTUALIZACION
								AniCarnivoro.setCategoria(categoria);
								impCarn.editar(indice, AniCarnivoro);
								System.out.println("SE EDITO CORRECTAMENTE");

								break;
							case 3:

								break;

							}

						} while (subCarnivoro < 3);

						break;
					case 5:
						impCarn.indiceDescri();
						System.out.println("INGRESE EL INDICE A ELIMINAR");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();

						// ELIMINAR
						impCarn.eliminar(indice);
						System.out.println("SE ELIMINO: ");

						break;
					case 6:

						break;

					}
				} while (mCarnivoro < 6);

				break;
			case 2:

				break;

			}

		} while (mPrinc < 2);

	}

}
