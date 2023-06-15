public class PostManager {
    private Film[] films = new Film[0];
    private int countOfMaxPrint = 5;

    public PostManager(int countOfMaxPrint) {
        this.countOfMaxPrint = countOfMaxPrint;
    }

    public PostManager() {

    }

    public void addFilm(String newFilm) {
        Film[] timeFilm = films;
        films = new Film[timeFilm.length + 1];
        for (int i = 0; i < films.length - 1; i++) {
            films[i] = timeFilm[i];
        }
        films[films.length - 1] = new Film(newFilm);
    }

    public void printFilms() {
        if (films.length <= countOfMaxPrint) {
            for (Film film : films) {
                System.out.println(film.getTitle());
            }
        } else {
            for (int i = films.length - 1; i > films.length - (countOfMaxPrint + 1); i--) {
                System.out.println(films[i].getTitle());
            }
        }
    }
}
