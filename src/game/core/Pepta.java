package game.core;

public class Pepta {
	public void Pozdrav(){
		System.out.println("Pepta v�s zdrav�!");	
		Player pepa = new Player();
		pepa.Name = "Pepa";
		while (pepa.kills<=20){
			pepa.addKill();
		}
	}
}
