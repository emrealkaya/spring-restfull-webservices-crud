package domain;

public class GameSales {

    private int id;
    private String gameName;
    private String gameProducer;
    private double gamePrice;

    public GameSales(){
        super();
    }

    public GameSales(int id, String gameName, String gameProducer, double gamePrice) {
        this.id = id;
        this.gameName = gameName;
        this.gameProducer = gameProducer;
        this.gamePrice = gamePrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGameProducer() {
        return gameProducer;
    }

    public void setGameProducer(String gameProducer) {
        this.gameProducer = gameProducer;
    }

    public double getGamePrice() {
        return gamePrice;
    }

    public void setGamePrice(int gamePrice) {
        this.gamePrice = gamePrice;
    }
}

