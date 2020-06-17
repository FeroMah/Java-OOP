package InterfacesAndAbstraction.Exercise.BirthdayCelebrations_03.DefineAnInterfacePerson;


public class Pet implements Birthable {
    private String name;
    private String birthDate;

    public Pet(String name, String birthDate) {
        setName(name);
        setBirthDate(birthDate);
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }


}
