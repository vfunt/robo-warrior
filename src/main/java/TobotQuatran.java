package main.java;

public class TobotQuatran extends TobotTritan {

    private String quadroGun;

    public TobotQuatran(String quadroGun) {
        this.quadroGun = quadroGun;
    }

    public TobotQuatran(String tetraGun, String quadroGun) {
        super(tetraGun);
        this.quadroGun = quadroGun;
    }

    public String getQuadroGun() {
        return quadroGun;
    }

    public void setQuadroGun(String quadroGun) {
        this.quadroGun = quadroGun;
    }
}
