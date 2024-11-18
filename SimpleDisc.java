public class SimpleDisc implements Disc {
    private Player own;
    public SimpleDisc (Player owner){
        this.own = owner;
    }
    public Player getOwner(){
        return own;
    }

    @Override
    public void setOwner(Player player) {
        own=player;

    }

    @Override
    public String getType() {
        return "⬤";
    }

}
