package DAOs;

public class Pokemon {

	int id;
	String identifier;
	int cost;
	
	public Pokemon(int id,String identifier,String pokemon_type, int cost, int hit_points, int power_points, boolean legendary, String weaknesses, String strengths, int evolution_level, int catch_rate, int hatch_time)
	{
		this.id=id;
		this.identifier = identifier;
		this.cost = cost;
	}

	public int getid() {
		return id;
	}

	public void setid(int id) {
		this.id = id;
	}

	public String getidentifier() {
		return identifier;
	}

	public void setidentifier(String identifier) {
		this.identifier = identifier;
	}

	public int getcost() {
		return cost;
	}

	public void setcost(int cost) {
		this.cost = cost;
	}

	
	public String toString()
	{
		String s = " id=" + id +'\n'+
			    " identifier="+ identifier +'\n' +
				" cost=" + cost;
		return s;
	}
}
