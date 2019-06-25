import main.java.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {

        Random rand = new Random();
        int n = rand.nextInt(13);

        Tobot tobot = new TobotTritan();

        try {
            if ((n >= 1) && (n <= 3)) {
                tobot.transform(1);
                tobot.bonusAction();
                tobot.jump();
            } else if ((n >= 4) && (n <= 8)) {
                tobot.transform(2);
                tobot.shoot();
            } else if ((n >= 9) && (n <= 12)) {
                tobot.transform(3);
                tobot.walk();
            } else {
                throw new KillPeopleException("Tobot kills people. It should be terminated");
            }
        } catch (KillPeopleException ex) {
            System.err.println(ex);
        }

        Galaxy galaxy = new Galaxy();
        galaxy.abduct(tobot, galaxy.getRandomPlanet(rand.nextInt(3)));


    }
}



//Народ , сталась біда !
//        Вашого робота викрали інопланетяни і відомо що летять вони в певну галактику яка складається з трьох планет:
//        планета морів, вітру, і сонця. Ваш робот не пристосований до таких умов і він там 😵
//        Щоб цього не сталось вам потрібно переробити його так, що під відповідну планету буде відповідна трансформація .
//        Куди полетять інопланетяни - не відомо, можуть випланету А, можуть В, а можуть С.
//        Якщо буде А - то імплементація Робота Під море, В- вітер , С - сонце. Тут також заюзати раундом, но рандомно випадати мають букви(А-С).