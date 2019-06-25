package main.java;

public class TobotTritan extends Tobot implements RobotActions{

    private String tetraGun;

    public TobotTritan () {}

    public TobotTritan(String tetraGun) {
        this.tetraGun = tetraGun;
    }

    public TobotTritan(String id, String name, String weapon, Boolean healthStatus, int defenseValue, int tobotForm, String tetraGun) {
        super(id, name, weapon, healthStatus, defenseValue, tobotForm);
        this.tetraGun = tetraGun;
    }

    public void shoot () {
        System.out.println("Shooting...");
    };
    public void walk () {
        System.out.println("Walking...");
    };
    public void jump () {
        System.out.println("Jumping...");
    };
    public void bonusAction() {
        System.out.println("It can fly....");
    };
    public void transform(int tobotForm) {
        System.out.println("Transformation started...");
        System.out.println("Transformation completed.");
    };

}
