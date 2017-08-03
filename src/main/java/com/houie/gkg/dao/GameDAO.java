package com.houie.gkg.dao;

import com.houie.gkg.lang.Game;
import com.houie.gkg.lang.Team;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by houie on 8/1/2017.
 */
@Component
public class GameDAO {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("MM/dd/yyyy");
    private static List<Game> games;
    {
        games = new ArrayList<Game>();
        // TODO: Database hookup; for demo purposes, games are hardcoded
        try {
            games.add(new Game(1, Team.PHI, DATE_FORMAT.parse("10/07/2017")));
            games.add(new Game(2, Team.CGY, DATE_FORMAT.parse("10/11/2017")));
            games.add(new Game(3, Team.BUF, DATE_FORMAT.parse("10/14/2017")));
            games.add(new Game(4, Team.NYI, DATE_FORMAT.parse("10/15/2017")));
            games.add(new Game(5, Team.MTL, DATE_FORMAT.parse("10/18/2017")));
            games.add(new Game(21, Team.ANA, DATE_FORMAT.parse("01/13/2018")));
            games.add(new Game(31, Team.CHI, DATE_FORMAT.parse("03/03/2018")));
        } catch (ParseException pe) {
            pe.printStackTrace();
        }
    }

    public List<Game> list() {
        return games;
    }

    public Game get(int id) {
        for (Game g : games) {
            if (g.getId() == id) {
                return g;
            }
        }
        return null;
    }
}
