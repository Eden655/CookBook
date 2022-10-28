public class Recipe {

    public String name;
    public String ImNotes;
    public String Instructions;
    public int Time;
    public double Likability;
    public int Difficulty;
    public String Ingredients;
    public boolean Milk;
    public boolean OthLactosePro;
    public boolean Eggs;
    public boolean Meat;
    public boolean Fruits;
    public boolean OthSeafoodPro;
    public boolean Vegetables;
    public boolean Grains;
    public boolean Fish;
    public boolean Condiments;

    //Constructor
    public Recipe(String name,String imNotes,String instructions,int time,double likability,int difficulty,String ingredients,boolean milk,boolean othLactosePro,boolean eggs,boolean meat,boolean fruits,boolean othSeafoodPro,boolean vegetables,boolean grains,boolean fish,boolean condiments) {
        this.name = name; ImNotes = imNotes; Instructions = instructions; Time = time;
        Likability = likability; Difficulty = difficulty; Ingredients = ingredients;
        Milk = milk; OthLactosePro = othLactosePro; Eggs = eggs; Meat = meat;
        Fruits = fruits; OthSeafoodPro = othSeafoodPro; Vegetables = vegetables;
        Grains = grains; Fish = fish; Condiments = condiments;
    }


    //Getters & Setters
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getImNotes() {return ImNotes;}
    public void setImNotes(String imNotes) {ImNotes = imNotes;}
    public String getInstructions() {return Instructions;}
    public void setInstructions(String instructions) {Instructions = instructions;}
    public int getTime() {return Time;}
    public void setTime(int time) {Time = time;}
    public double getLikability() {return Likability;}
    public void setLikability(double likability) {Likability = likability;}
    public int getDifficulty() {return Difficulty;}
    public void setDifficulty(int difficulty) {Difficulty = difficulty;}
    public String getIngredients() {return Ingredients;}
    public void setIngredients(String ingredients) {Ingredients = ingredients;}
    public boolean isMilk() {return Milk;}
    public void setMilk(boolean milk) {Milk = milk;}
    public boolean isOthLactosePro() {return OthLactosePro;}
    public void setOthLactosePro(boolean othLactosePro) {OthLactosePro = othLactosePro;}
    public boolean isEggs() {return Eggs;}
    public void setEggs(boolean eggs) {Eggs = eggs;}
    public boolean isMeat() {return Meat;}
    public void setMeat(boolean meat) {Meat = meat;}
    public boolean isFruits() {return Fruits;}
    public void setFruits(boolean fruits) {Fruits = fruits;}
    public boolean isOthSeafoodPro() {return OthSeafoodPro;}
    public void setOthSeafoodPro(boolean othSeafoodPro) {OthSeafoodPro = othSeafoodPro;}
    public boolean isVegetables() {return Vegetables;}
    public void setVegetables(boolean vegetables) {Vegetables = vegetables;}
    public boolean isGrains() {return Grains;}
    public void setGrains(boolean grains) {Grains = grains;}
    public boolean isFish() {return Fish;}
    public void setFish(boolean fish) {Fish = fish;}
    public boolean isCondiments() {return Condiments;}
    public void setCondiments(boolean condiments) {Condiments = condiments;}
}
