package Encapsulation.Exercise.PizzaCalories_04.PizzaCalories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public String getFlourType() {
        return this.flourType;
    }

    public String getBakingTechnique() {
        return this.bakingTechnique;
    }

    public double getWeight() {
        return this.weight;
    }

    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    private void setFlourType(String flourType) {
        switch (flourType.trim().toLowerCase()) {
            case "white":
            case "wholegrain":
                break;
            default:
                throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.flourType = flourType.trim();
    }

    private void setBakingTechnique(String bakingTechnique) {
		switch (bakingTechnique.trim()){
			case "Crispy":
			case "Chewy":
			case "Homemade":
			break;
			default:
			 throw new IllegalArgumentException("Invalid type of dough.");
		}
        this.bakingTechnique = bakingTechnique.trim();
    }

    private void setWeight(double weight) {
        if (1 <= weight && weight <= 200) {
            this.weight = weight;
        } else throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
    }

    public double calculateCalories() {
        double flourTypeМultiplier = 0.0;
        if (this.flourType.equalsIgnoreCase("White")) {
            flourTypeМultiplier = 1.5;
        }
        if (this.flourType.equalsIgnoreCase("Wholegrain")) {
            flourTypeМultiplier = 1.0;
        }

        double bakingTechniqueМultiplier = 0.0;
        if (this.bakingTechnique.equalsIgnoreCase("Crispy")) {
            bakingTechniqueМultiplier = 0.9;
        }
        if (this.bakingTechnique.equalsIgnoreCase("Chewy")) {
            bakingTechniqueМultiplier = 1.1;
        }
        if (this.bakingTechnique.equalsIgnoreCase("Homemade")) {
            bakingTechniqueМultiplier = 1.0;
        }

        return (2 * this.weight) * flourTypeМultiplier * bakingTechniqueМultiplier;
    }
}
