public class Rooms {
    private RoomSituation startRooSituation;
    public RoomSituation currentSituation;


    public Rooms(){
        startRooSituation = new RoomSituation(
                "Вы идёте по тёмной пещере, дорогу вам освещает только ваш факел.\n" +
                        "Вы приближаетесь к пещере.\n" +
                        "В этой пещере явно находится ловушка!\n" +
                        "Что вы сделаете?\n" +
                        "(1) Быстро пробежать комнату\n" +
                        "(2) Наклониться и пробежать комнату\n" +
                        "(3) Проползти комнату\n",
                3, 0, 0 , 0);
        startRooSituation.direction[0] = new RoomSituation(
                "Вы бежали очень быстро и стрела промчалась у вас за затылком.\n" +
                        "Вам сильно повезло и теперь будет чем похвастаться друзьям!",
                0, 0, 0, 100);
        startRooSituation.direction[1] = new RoomSituation(
                "Вы бежали очень быстро и стрела чуть-чуть задела и поцарапала вас.\n",
                0, 0, -10, 0);
        startRooSituation.direction[2] = new RoomSituation(
                "Вы успешно поползли комнату и ничего не произошло, может быть тут не было ловушек?.\n" +
                        "Но пока вы ползли, вы обожглись факелом",
                0, 0, -5, 0);

        currentSituation = startRooSituation;

    }
    public void go(int num) {
        if (num <= currentSituation.direction.length)
            currentSituation = currentSituation.direction[num - 1];
        else
            System.out.println("Вы можете выбирать из "
                    + currentSituation.direction.length + " вариантов");
    }

    public boolean isEnd() {
        return currentSituation.direction.length == 0;
    }
}
