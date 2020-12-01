public class RoomSituation {
    public RoomSituation[] direction;
    public String text;
    public int addMoney, addHealth, addReputation;

    public RoomSituation(String text, int variants, int addMoney, int addHealth, int addReputation) {
        this.text = text;
        this.addMoney = addMoney;
        this.addHealth = addHealth;
        this.addReputation = addReputation;
        direction = new RoomSituation[variants];
    }
}
