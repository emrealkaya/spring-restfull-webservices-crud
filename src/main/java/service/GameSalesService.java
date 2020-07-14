package service;

import domain.GameSales;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class GameSalesService {

    private static HashMap<Integer, GameSales> gameSalesHashMap = getGameSalesHashMap();

    public GameSalesService() {
        super();
        if (gameSalesHashMap == null) {
            gameSalesHashMap = new HashMap<Integer, GameSales>();

            GameSales game1 = new GameSales(1, "Gta 5", "RockStar Games", 29.99);
            GameSales game2 = new GameSales(2, "Mount & Blade II", "TaleWorlds Entertainment", 49.99);
            GameSales game3 = new GameSales(3, "Cyperpunk 2077", "CD PROJEKT RED", 59.99);

            gameSalesHashMap.put(1, game1);
            gameSalesHashMap.put(2, game2);
            gameSalesHashMap.put(3, game3);


        }
    }

    public static int getMaximumId() {
        int max = 0;
        for (int id : gameSalesHashMap.keySet()) {
            if (max <= id) {
                max = id;
            }
        }
        return max;
    }

    public static HashMap<Integer, GameSales> getGameSalesHashMap() {
        return gameSalesHashMap;
    }

    public List<GameSales> getAllGameSales() {
        List<GameSales> gameSales = new ArrayList<GameSales>(gameSalesHashMap.values());
        return gameSales;
    }

    public GameSales getGameSales(int id) {
        GameSales gameSales = gameSalesHashMap.get(id);
        return gameSales;
    }

    public GameSales addGameSales(GameSales gameSales) {
        gameSales.setId(getMaximumId() + 1);
        gameSalesHashMap.put(gameSales.getId(), gameSales);
        return gameSales;
    }

    public GameSales updateGameSales(GameSales gameSales) {
           if(gameSales.getId() <= 0 ) {
               return null;
           }
               gameSalesHashMap.put(gameSales.getId(), gameSales);
               return gameSales;
           }

      public void deleteGameSales(int id){
        gameSalesHashMap.remove(id);
        }
    }
