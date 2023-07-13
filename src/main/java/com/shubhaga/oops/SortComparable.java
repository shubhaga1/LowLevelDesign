package com.shubhaga.oops;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;

@Data
@AllArgsConstructor
class Movie implements Comparable<Movie> {

    String name;
    private double rating;
    private int year;

    @Override
    public int compareTo(Movie o) {
        return this.year - o.year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", year=" + year +
                '}';

    }
}

public class SortComparable {
    public static void main(String args[]) {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

        System.out.println("Before sorting : ");
        System.out.println(list);

        Collections.sort(list);
        System.out.println("After sorting : ");
        System.out.println(list);

//        for(int i = 0; i<list.size();i++) {
//            System.out.println(list.get(i).getName() + "\t" +
//                    list.get(i).getRating() + "\t" +
//                    list.get(i).getYear());
//        }
    }
}
