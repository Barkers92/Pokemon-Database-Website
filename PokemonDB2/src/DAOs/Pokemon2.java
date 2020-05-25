package DAOs;

public class Pokemon2 {

	int Per;
	int Nat;
	String Pokemon;
	int HP;
	int Atk;
	int Def;
	int SpA;
	int SpD;
	int Spe;
	int Total;
	String TypeI;
	String TypeII;
	String Tier;
	String AbilityI;
	String AbilityII;
	String HiddenAbility;
	int LKGK;
	String EVWorth;
	int EXPV;
	String Color;
	int Hatch;
	String Gender;
	String EggGroupI;
	String EggGroupII;
	int Catch;
	int EXP;
	String Evolve;
	
	public Pokemon2()
	{
	}

	public Pokemon2(int Per,int Nat,String Pokemon,int HP,int Atk,int Def,int SpA,int SpD,int Spe,int Total,String TypeI,String TypeII,String Tier,String AbilityI,String AbilityII,String HiddenAbility,int LKGK,String EVWorth,int EXPV,String Color,int Hatch,String Gender,String EggGroupI,String EggGroupII,int Catch,int EXP,String Evolve)
	{
		this.Per = Per;
		this.Nat = Nat;
		this.Pokemon = Pokemon;
		this.HP = HP;
		this.Atk = Atk;
		this.Def = Def;
		this.SpA = SpA;
		this.SpD = SpD;
		this.Spe = Spe;
		this.Total = Total;
		this.TypeI = TypeI;
		this.TypeII = TypeII;
		this.Tier = Tier;
		this.AbilityI = AbilityI;
		this.AbilityII = AbilityII;
		this.HiddenAbility = HiddenAbility;
		this.LKGK = LKGK;
		this.EVWorth = EVWorth;
		this.EXPV = EXPV;
		this.Color = Color;
		this.Hatch = Hatch;
		this.Gender = Gender;
		this.EggGroupI = EggGroupI;
		this.EggGroupII = EggGroupII;
		this.Catch = Catch;
		this.EXP = EXP;
		this.Evolve = Evolve;
	}
	
	public int getPer() {
		return Per;
	}

	public void setPer(int per) {
		Per = per;
	}

	public int getNat() {
		return Nat;
	}

	public void setNat(int nat) {
		Nat = nat;
	}

	public String getPokemon() {
		return Pokemon;
	}

	public void setPokemon(String pokemon) {
		Pokemon = pokemon;
	}

	public int getHP() {
		return HP;
	}

	public void setHP(int hP) {
		HP = hP;
	}

	public int getAtk() {
		return Atk;
	}

	public void setAtk(int atk) {
		Atk = atk;
	}

	public int getDef() {
		return Def;
	}

	public void setDef(int def) {
		Def = def;
	}

	public int getSpA() {
		return SpA;
	}

	public void setSpA(int spA) {
		SpA = spA;
	}

	public int getSpD() {
		return SpD;
	}

	public void setSpD(int spD) {
		SpD = spD;
	}

	public int getSpe() {
		return Spe;
	}

	public void setSpe(int spe) {
		Spe = spe;
	}

	public int getTotal() {
		return Total;
	}

	public void setTotal(int total) {
		Total = total;
	}

	public String getTypeI() {
		return TypeI;
	}

	public void setTypeI(String typeI) {
		TypeI = typeI;
	}

	public String getTypeII() {
		return TypeII;
	}

	public void setTypeII(String typeII) {
		TypeII = typeII;
	}

	public String getTier() {
		return Tier;
	}

	public void setTier(String tier) {
		Tier = tier;
	}

	public String getAbilityI() {
		return AbilityI;
	}

	public void setAbilityI(String abilityI) {
		AbilityI = abilityI;
	}

	public String getAbilityII() {
		return AbilityII;
	}

	public void setAbilityII(String abilityII) {
		AbilityII = abilityII;
	}

	public String getHiddenAbility() {
		return HiddenAbility;
	}

	public void setHiddenAbility(String hiddenAbility) {
		HiddenAbility = hiddenAbility;
	}

	public int getLKGK() {
		return LKGK;
	}

	public void setLKGK(int lKGK) {
		LKGK = lKGK;
	}

	public String getEVWorth() {
		return EVWorth;
	}

	public void setEVWorth(String eVWorth) {
		EVWorth = eVWorth;
	}

	public int getEXPV() {
		return EXPV;
	}

	public void setEXPV(int eXPV) {
		EXPV = eXPV;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public int getHatch() {
		return Hatch;
	}

	public void setHatch(int hatch) {
		Hatch = hatch;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getEggGroupI() {
		return EggGroupI;
	}

	public void setEggGroupI(String eggGroupI) {
		EggGroupI = eggGroupI;
	}

	public String getEggGroupII() {
		return EggGroupII;
	}

	public void setEggGroupII(String eggGroupII) {
		EggGroupII = eggGroupII;
	}

	public int getCatch() {
		return Catch;
	}

	public void setCatch(int catch1) {
		Catch = catch1;
	}

	public int getEXP() {
		return EXP;
	}

	public void setEXP(int eXP) {
		EXP = eXP;
	}

	public String getEvolve() {
		return Evolve;
	}

	public void setEvolve(String evolve) {
		Evolve = evolve;
	}
	
	public String toString()
	{
	return "Pokemon2 [Per=" + Per + ", Nat=" + Nat + ", Pokemon=" + Pokemon
			+ ", HP=" + HP + ", Atk=" + Atk + ", Def=" + Def + ", SpA="
			+ SpA + ", SpD=" + SpD + ", Spe=" + Spe + ", Total=" + Total
			+ ", TypeI=" + TypeI + ", TypeII=" + TypeII + ", Tier=" + Tier
			+ ", AbilityI=" + AbilityI + ", AbilityII=" + AbilityII
			+ ", HiddenAbility=" + HiddenAbility + ", LKGK=" + LKGK
			+ ", EVWorth=" + EVWorth + ", EXPV=" + EXPV + ", Color="
			+ Color + ", Hatch=" + Hatch + ", Gender=" + Gender
			+ ", EggGroupI=" + EggGroupI + ", EggGroupII=" + EggGroupII
			+ ", Catch=" + Catch + ", EXP=" + EXP + ", Evolve=" + Evolve
			+ "]";
	}
}