public class UnflippableDisc implements Disc {

    private Player own;
    public UnflippableDisc (Player owner){
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
        return "⭕";
    }

}
