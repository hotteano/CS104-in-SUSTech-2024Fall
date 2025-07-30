public class GameSystem {
    private final Land[] Lands;
    private int pointer=-1;
    private Player[] players;
    private String[] playerState;
    private String[] landState;
    private boolean gameOver;
    public GameSystem(Player[] players, Land[] lands) {
        this.Lands = lands;
        this.players = players;
    }
    public Player nextPlayer() {
        pointer=(pointer+1)%players.length;
        if(players[pointer].getStatus()){
            return players[pointer];
        }
        else{
            return nextPlayer();
        }
    }
    public Player getCurrentPlayer() {
        return players[pointer];
    }
    public boolean isGameOver() {
        return gameOver;
    }
    public boolean dealFailedPlayer()
    {
        if(!getCurrentPlayer().getStatus()){
            for(Land l:Lands)
            {
                if(l.getHouse()==null){continue;}
                if(l.getHouse().getPlayer().equals(getCurrentPlayer()))
                {
                    l.removeHouse();
                }
            }
        }
        int activePlayers=0;
        for(Player p:players)
        {
            if(p.getStatus()){
                activePlayers++;
            }
        }
        if(activePlayers==1){
            gameOver=true;
        }
        return !getCurrentPlayer().getStatus();
    }
    public String[] currentPlayersState()
    {
        String[] state=new String[players.length];
        for(int i=0;i<players.length;i++)
        {
            state[i]=players[i].toString();
        }
        return state;
    }
    public String[] currentLandsState()
    {
        String[] state=new String[Lands.length];
        int top=0;
        for(int i=0;i<Lands.length;i++)
        {
            if(Lands[i].getHouse()!=null)
            {
                state[top]=Lands[i].toString();
                top++;
            }
        }
        String[] landState=new String[top];
        for(int i=0;i<top;i++)
        {
            landState[i]=state[i];
        }
        return landState;
    }
    public void nextTurn(int step, int cost)
    {
        nextPlayer();
        if(players[pointer].getStatus()) {
            int location = (players[pointer].getLocation() + step) % Lands.length;
            LandColor presentColor = Lands[location].getColor();
            players[pointer].setLocation(location);
            if (Lands[location].getHouse() == null) {
                boolean flag = true;
                for (int i = 0; i < Lands.length; i++) {
                    if (i == location) {
                        continue;
                    }
                    if (Lands[i].getHouse() != null && (Lands[i].getColor().equals(presentColor) && !Lands[i].getHouse().getPlayer().equals(getCurrentPlayer()))) {
                        flag = false;
                    }
                }
                if (flag) {
                    players[pointer].buildHouse(Lands[location], cost);
                }
            }
            else {
                if (Lands[location].getHouse().getPlayer().equals(getCurrentPlayer())) {

                    players[pointer].collectRent(Lands[location].getHouse().getRent());
                    Lands[location].getHouse().setRent(0);
                } else {
                    Lands[location].getHouse().addRent(players[pointer].payRent(Lands[location].getHouse().getHousePrice()));
                }
            }
            if (Lands[location].getHouse() != null) {
                if (Lands[location].getHouse().getPlayer().getLocation() == location) {
                    Lands[location].getHouse().getPlayer().collectRent(Lands[location].getHouse().getRent());
                    Lands[location].getHouse().setRent(0);
                }
            }
            if (!getCurrentPlayer().getStatus()) {
                for (Land l : Lands) {
                    if (l.getHouse() == null) {
                        continue;
                    }
                    if (l.getHouse().getPlayer().equals(getCurrentPlayer())) {
                        l.removeHouse();
                    }
                }
            }
            int activePlayers = 0;
            for (Player p : players) {
                if (p.getStatus()) {
                    activePlayers++;
                }
            }
            if (activePlayers == 1) {
                gameOver = true;
            }
        }
        else{
            nextTurn(step, cost);
        }
    }
}
