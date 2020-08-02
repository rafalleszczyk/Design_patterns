package design.patterns;
/**
 Prototype is a pattern which allows to create the same copy (clone) of an object.
 As result of prototype we have got two the same objects.
 * Concepts
    - Avoid costly creation
    - Avoid subclassing
    - Typically doesn't use 'new'
    - Often utilizes an Interface
    - Usually implemented with Registry

 * Desing
    - Clone/Cloneable
    - Avoids keyword 'new"
    - Although a copy, each instance unique
    - Costly construction not handled by client
    - Can still utilize parameters for construction
    - Shallow vs Deep copy

 * **/
public class Main {

    public static void main(String[] args) {

        Registry registry = new Registry();
        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Test");

        System.out.println(movie);
        System.out.println(movie.getRuntime());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());

        Movie secondMovie = (Movie) registry.createItem("Movie");
        movie.setTitle("Test_2");

        System.out.println(secondMovie);
        System.out.println(secondMovie.getRuntime());
        System.out.println(secondMovie.getTitle());
        System.out.println(secondMovie.getUrl());


    }
}
