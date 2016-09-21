package com.asovel.bibicleta.Interface_Usuario.CatalogoBicicletas;

import java.util.Arrays;
import java.util.List;
import com.asovel.bibicleta.R;

/**
 * Creado por staf.
 */
/*
new Bicicleta(
variables a añadir
 modelo bici            "Curso Online De Seo Para Principiantes",
 texto1                 "Aprende prácticas para optimizar tanto internos como externos de tu sitio " +
 texto2                 "web con el fin de recibir mas tráfico desde los motores de búsqueda\n" +
                        "\n" +
 texto3                 "Más de 30 clases \n" +
 texto4                 "12 horas de contenido",
 proveedor              "Carlos Villa",


        variables a añadir
        nº estrellasf, precio, cantidad en stock, R.drawable.fotobici), ...



        public class Bicicletas {
        private static Bicicleta[] Bicicletas = {
            new Bicicleta( modelo bici, texto1 + texto2 + "\n" + texto3 + texto4,  proveedor ,nº estrellasf, precio, cantidad en stock, foto) , ...
             , };




        */


public class Bicicletas {
    private static Bicicleta[] Bicicletas = {
            new Bicicleta("Curso Online De Seo Para Principiantes",
                    "Aprende prácticas para optimizar tanto internos como externos de tu sitio " +
                            "web con el fin de recibir mas tráfico desde los motores de búsqueda\n" +
                            "\n" +
                            "Más de 30 clases \n" +
                            "12 horas de contenido", "Fabricante1",
                    3f, "modelo 2323", 22, "http://www.zonagravedad.com/images/Gravity_Bike/bicis_para_transformar/Scott_Jr.jpg"),
            new Bicicleta("La ciencia del Marketing Online",
                    "Obtén este curso y aprende paso a paso como crear un negocio que genere" +
                            " ingresos constantes lo más pronto posible.\n" +
                            "\n" +
                            "20 excelentes clases\n" +
                            "\n" +
                            "Plantillas para inexpertos\n", "Fabricante1",
                    5f,"modelo 2323", 24,"http://www.zonagravedad.com/images/Gravity_Bike/bicis_para_transformar/Scott_Jr.jpg"),
            new Bicicleta("Publicidad Rápida y Furiosa",
                    "Con este curso obtendrás todos los secretos para generar campañas " +
                            "publicitarias que tus clientes no puedan resistirse.\n" +
                            "\n" +
                            "45 clases didácticas\n" +
                            "\n" +
                            "Desarrolla tu creatividad y asertividad comercial\n", "Fabricante1",
                    4.4f,"modelo 2323", 32, "http://www.zonagravedad.com/images/Gravity_Bike/bicis_para_transformar/Scott_Jr.jpg"),
            new Bicicleta("Aumentando el control de mis finanzas",
                    "Curso introductorio sobre finanzas personales. " +
                            "Aprende a gestionar tus recursos financieros a " +
                            "través de una estrategia de planificación sencilla y probada.\n" +
                            "\n" +
                            "¡Más de 13 clases y 20 horas de contenido!\n" +
                            "\n" +
                            "Satisfacción garantizada", "Fabricante1",
                    3.4f,"modelo 2323", 35, "http://www.zonagravedad.com/images/Gravity_Bike/bicis_para_transformar/Scott_Jr.jpg"),
            new Bicicleta("Coaching Extremo",
                    "Aprende a conseguir resultados, alcanzar metas, cooperar " +
                            "con otras personas y a motivar su entorno.\n" +
                            "\n" +
                            "23 clases dividas en 10 horas \n" +
                            "Ejemplo prácticos", "Fabricante1",
                    4.0f,"modelo 2323", 45, "http://www.zonagravedad.com/images/Gravity_Bike/bicis_para_transformar/Scott_Jr.jpg"),
            new Bicicleta("¿Cómo sacar máximo provecho a las redes sociales?",
                    "Aprende a gestionar y manejar eficazmente las comunidades " +
                            "sociales. Automatiza tareas, crea contenidos " +
                            "interesantes y saca el mejor provecho de las análiticas.\n" +
                            "\n" +
                            "Plantillas descargables para planificación.\n" +
                            "21 Infografías potentes para simplificar tu acción",
                    "Fabricante1", 3.2f, "modelo 2323", 34, "http://www.zonagravedad.com/images/Gravity_Bike/bicis_para_transformar/Scott_Jr.jpg"),
    };

    /**
     * Obtiene como lista todos los cursos de prueba
     *
     * @return Lista de cursos
     */
    public static List<Bicicleta> getBicicletas() {
        return Arrays.asList(Bicicletas);
    }

    /**
     * Obtiene un curso basado en la posición del array
     *
     * @param position Posición en el array
     * @return Curso seleccioando
     */
    public static Bicicleta getBicicletaByPosition(int position) {
        return Bicicletas[position];
    }

}
