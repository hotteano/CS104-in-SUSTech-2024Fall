public class Test {
    public static void main(String[] args) {
        Land[] lands = new Land[8];
        for (int i = 0; i < lands.length; i++) {
            lands[i] = new Land(LandColor.values()[i / 2]);
        }
        Player[] players = new Player[3];
        for (int i = 0; i < players.length; i++) {
            players[i] = new Player(i + 1);
        }

        GameSystem gameSystem = new GameSystem(players, lands);
        System.out.println("GameOver:"+gameSystem.isGameOver());
        gameSystem.nextPlayer().buildHouse(lands[0], 80);//RED True
        gameSystem.getCurrentPlayer().buildHouse(lands[1],20);//RED True
        System.out.println(gameSystem.dealFailedPlayer());//false
        gameSystem.getCurrentPlayer().payRent(201);//player 1 failed
        System.out.println(gameSystem.dealFailedPlayer());
        gameSystem.nextPlayer().payRent(201);//player 2 failed
        System.out.println(gameSystem.dealFailedPlayer());
        System.out.println("GameOver:"+gameSystem.isGameOver());//true
        System.out.println(lands[0].getHouse());//null
        System.out.println(lands[1].getHouse());//null
    }
}
