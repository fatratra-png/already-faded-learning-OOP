public class Player {
      //Attributs
      int id;
      String name;
      String position;
      String team;

      //Constructeur: methode speciale qui permet de creer un objet avec initialisation des attributs
      Player(int id, String name,String position,String team){
            this.id = id;
            this.name = name;
            this.position = position;
            this.team = team;
      }

      //Methodes
      void showInfo(){
            System.out.println(this.name+", "+this.position+", plays in :"+this.team+" as number :"+this.id);
      }
      void dribble(){
            System.out.println(name+" is Dribbling");
      }

      public static void main (String[] args){
            Player rakoto=  new Player(1, "Rakoto", "GB", "Reversed CowGIRL");
            Player spicy= new Player(69, "Spicy", "AC","MissionaryBoys");
            rakoto.showInfo();
            spicy.dribble();
      }
}
