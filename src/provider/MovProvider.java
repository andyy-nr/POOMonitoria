/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package provider;

import java.util.Arrays;
import java.util.List;
import model.Movie;

/**
 *
 * @author isi7
 */
public class MovProvider {
    private static Movie movie1 = new Movie(1, "Spiderman", 2020); // Estatica significa que pertenece a la variable como tal, solo se crea una ez y sirve para llamarlo desde cualquier parte sin usar el cosntructor de nuevo
    private static Movie movie2 = new Movie(2, "The Godfather", 1989);
    private static Movie movie3;
    
    static{ // esta manera casi nunca se usa
        movie3 = new Movie(3, "The little mermaid", 2005);
    }
    public static List<Movie> getMovies(){
        return Arrays.asList(movie1, movie2, movie3);
    }
}
