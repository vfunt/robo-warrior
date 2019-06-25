package main.java;

public class Tobot implements RobotActions{
    private String id;
    private String name;
    private String weapon;
    private Boolean healthStatus;
    private int defenseValue;
    private int tobotForm;

    public Tobot () {

    }

    public Tobot(String id, String name, String weapon, Boolean healthStatus, int defenseValue, int tobotForm) {
        this.id = id;
        this.name = name;
        this.weapon = weapon;
        this.healthStatus = healthStatus;
        this.defenseValue = defenseValue;
        this.tobotForm = tobotForm;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public Boolean getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(Boolean healthStatus) {
        this.healthStatus = healthStatus;
    }

    public int getDefenseValue() {
        return defenseValue;
    }

    public void setDefenseValue(int defenseValue) {
        this.defenseValue = defenseValue;
    }

    @Override
    public void shoot () {
        System.out.println("Tra...ta..ta..ta");
    }

    @Override
    public void walk() {

    }

    @Override
    public void jump() {

    }

    @Override
    public void bonusAction() {

    }

    @Override
    public void transform(int tobotForm) {
        System.out.println("Transformation: " + tobotForm);
    }

    public void transform(Planet planet) {
        if (planet == Planet.Jupiter) {
            this.setDefenseValue(1);
            System.out.println("Defense has been set to:" + this.getDefenseValue());
        } else if (planet == Planet.Moon) {
            this.setDefenseValue(4);
            System.out.println("Defense has been set to:" + this.getDefenseValue());
        } else if (planet == Planet.Cybertron) {
            this.setDefenseValue(5);
            System.out.println("Defense has been set to:" + this.getDefenseValue());
        } else {
            System.out.println("Unknown planet");
        }
    }
}
