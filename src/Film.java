import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Film {
    private String id;
    private String title;
    private int year;
    private double rating;

    public Film(String id, String title, int year, double rating) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.rating = rating;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public double getRating() {
        return rating;
    }

    public String toString() {
        return "ID: " + id + "\nTitle: " + title + "\nYear: " + year + "\nRating: " + rating + "\n";
    }

    public static void main(String[] args) {
        // Buat daftar film terlaris
        List<Film> filmList = new ArrayList<>();
        filmList.add(new Film("tt1375666", "The Flash", 2023, 7.3));
        filmList.add(new Film("tt0468569", "Spider-Man:Across the spider-verse", 2023, 9.0));
        filmList.add(new Film("tt0816692", "Transformers:Rise of the beasts", 2023, 6.6));
        filmList.add(new Film("tt1375666", "Avatar:The way of water", 2022, 7.6));
        filmList.add(new Film("tt2276350", "The Little Mermaid", 2023, 7.2));
        filmList.add(new Film("tt8001268", "Extraction", 2023, 7.2));
        filmList.add(new Film("tt8029690", "Fast X", 2023, 6.0));

        // Tampilkan semua film terlaris
        System.out.println("Daftar Film Terlaris:");
        for (Film film : filmList) {
            System.out.println(film);
        }

        // Urutkan daftar film terlaris menggunakan Selection Sort berdasarkan rating (dari terendah ke tertinggi)
        for (int i = 0; i < filmList.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < filmList.size(); j++) {
                if (filmList.get(j).getRating() < filmList.get(minIndex).getRating()) {
                    minIndex = j;
                }
            }
            Collections.swap(filmList, i, minIndex);
        }

        // Tampilkan daftar film terlaris yang sudah diurutkan
        System.out.println("\nDaftar Film Terlaris (Urutkan berdasarkan Rating):");
        for (Film film : filmList) {
            System.out.println(film);
        }
    }
}