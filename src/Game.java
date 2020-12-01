import java.util.Scanner;

import static java.lang.System.out;

public class Game{
    private Player player;
    private static Rooms rooms;

    public void start(){
        //HelloFunction();


        Scanner in = new Scanner(System.in);
        out.print("Добро пожаловать в симулятор искателя приключений!\n" +
                "Введите своё име для начала игры: ");
        String name = new Scanner(System.in).nextLine();
        if (name.isEmpty()){
            do {
                out.println("Имя не может быть пустым, введите его заново: ");
                name = new Scanner(System.in).nextLine();
            }while (name.isEmpty());
        }

        player = new Player(name);

        out.println("На этот раз вам предстоит сыскать несметные сокровища!");
        rooms = new Rooms();
        while (true) {
            player.setHealth(player.getHealth() + rooms.currentSituation.addHealth);
            player.setReputation(player.getReputation() + rooms.currentSituation.addReputation);
            player.setMoney(player.getMoney() + rooms.currentSituation.addMoney);
            out.println("=====\nДеньги:" + player.money + "\tЗдоровье:"
                    + player.health + "\tРепутация:" + player.reputation + "\n=====");
            out.println(rooms.currentSituation.text);
            if (rooms.isEnd()) {
                out.println("==================== Конец ===================");
                return;
            }
            rooms.go(in.nextInt());
        }
    }
}
