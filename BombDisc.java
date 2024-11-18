public class BombDisc implements Disc {
    private Player own;
    public BombDisc (Player owner){
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
        return "💣";
    }

}
