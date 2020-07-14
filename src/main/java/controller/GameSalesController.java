package controller;

import domain.GameSales;
import org.springframework.web.bind.annotation.*;
import service.GameSalesService;

import java.util.List;

@RestController
public class GameSalesController {

    GameSalesService gameSalesService = new GameSalesService();

    @RequestMapping(value = "/gameSales", method = RequestMethod.GET, headers = "Accept=application/json")
    public List<GameSales> getGameSales(){
        List<GameSales> gamesList = gameSalesService.getAllGameSales();
        return gamesList;
    }
    @RequestMapping(value = "/gameSales/{id}",method = RequestMethod.GET, headers = "Accept=application/json")
    public GameSales getGameSalesById(@PathVariable int id){
        return gameSalesService.getGameSales(id);
    }

    @RequestMapping(value = "/gameSales",method = RequestMethod.POST, headers = "Accept=application/json")
    public GameSales addGameSales(@RequestBody GameSales gameSales){

        return gameSalesService.addGameSales(gameSales);
    }
    @RequestMapping(value = "/gameSales", method = RequestMethod.PUT, headers ="Accept=application/json")
    public GameSales updateGameSales(@RequestBody GameSales gameSales){

        return  gameSalesService.updateGameSales(gameSales);
    }

    @RequestMapping(value = "/gameSales/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
    public void deleteGameSales(@PathVariable ("id") int id){
        gameSalesService.deleteGameSales(id);
    }
}
