class Movie {
  String[] movies = {"Indiana Jones et le Royaume du Crâne de Cristal", "Indiana Jones et la     Dernière Croisade", "Indiana Jones et le Temple maudit"};

  String[][] actors = new String[][] {
    {
      "Harrison Ford", "Cate Blanchett", "Karen Allen"
    },
    {
      "Harrison Ford", "Sean Connery", "Denholm Elliott"
    },
    {
      "Harrison Ford", "Kate Capshaw", "Jonathan Ke Quan"
    }  
  };

  public static void main (String[] args) {
    Movie movie = new Movie();
    for (int i = 0; i < movie.movies.length; i++){
        String actorsForMovie = "";
        for (int j = 0; j < movie.actors[i].length; j++){
            actorsForMovie += movie.actors[i][j];
            if (j < movie.actors[i].length - 1){
                actorsForMovie += ", ";
            }
        }
        System.out.println("Dans le film " + movie.movies[i] + " les acteurs principaux sont " + actorsForMovie);
    }
  }
}
