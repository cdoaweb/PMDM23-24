package com.example.pelicula

        class Pelicula(val codigo: Int, var nombre: String, var director: String, var año: Int) {
    constructor(codigo: Int) : this(codigo, "", "", 0)

        override fun toString(): String {
        return "Código: $codigo\nNombre: $nombre\nDirector: $director\nAño: $año\n"
    }
}

fun main() {
    val peliculas = mutableMapOf<Int, Pelicula>()
    var contadorCodigo = 1

    while (true) {
        println("\nMenú:")
        println("1. Insertar nueva película")
        println("2. Mostrar película por código")
        println("3. Buscar película por código")
        println("4. Borrar película por código")
        println("5. Editar película")
        println("6. Salir")
        print("Seleccione una opción: ")

        val opcion = readLine()?.toIntOrNull() ?: continue

        when (opcion) {
            1 -> {
                print("Nombre de la película: ")
                val nombre = readLine() ?: ""
                print("Director de la película: ")
                val director = readLine() ?: ""
                print("Año de la película: ")
                val año = readLine()?.toIntOrNull() ?: 0

                val pelicula = Pelicula(contadorCodigo, nombre, director, año)
                peliculas[contadorCodigo] = pelicula
                contadorCodigo++
            }
            2 -> {
                print("Ingrese el código de la película: ")
                val codigo = readLine()?.toIntOrNull() ?: continue
                val pelicula = peliculas[codigo]
                if (pelicula != null) {
                    println(pelicula)
                } else {
                    println("Película no encontrada.")
                }
            }
            3 -> {
                print("Ingrese el código de la película a buscar: ")
                val codigo = readLine()?.toIntOrNull() ?: continue
                val pelicula = peliculas[codigo]
                if (pelicula != null) {
                    println("Película encontrada:")
                    println(pelicula)
                } else {
                    println("Película no encontrada.")
                }
            }
            4 -> {
                print("Ingrese el código de la película a borrar: ")
                val codigo = readLine()?.toIntOrNull() ?: continue
                val pelicula = peliculas.remove(codigo)
                if (pelicula != null) {
                    println("Película eliminada:")
                    println(pelicula)
                } else {
                    println("Película no encontrada.")
                }
            }
            5 -> {
                print("Ingrese el código de la película a editar: ")
                val codigo = readLine()?.toIntOrNull() ?: continue
                val pelicula = peliculas[codigo]
                if (pelicula != null) {
                    print("Nuevo nombre (dejar en blanco para mantener el actual): ")
                    val nuevoNombre = readLine() ?: pelicula.nombre
                    print("Nuevo director (dejar en blanco para mantener el actual): ")
                    val nuevoDirector = readLine() ?: pelicula.director
                    print("Nuevo año (dejar 0 para mantener el actual): ")
                    val nuevoAño = readLine()?.toIntOrNull() ?: pelicula.año

                    pelicula.nombre = nuevoNombre
                    pelicula.director = nuevoDirector
                    pelicula.año = nuevoAño
                    println("Película editada exitosamente.")
                } else {
                    println("Película no encontrada.")
                }
            }
            6 -> {
                println("Saliendo del programa.")
                return
            }
            else -> println("Opción no válida.")
        }
    }
}