package com.houie.gkg.service.impl;

import com.houie.gkg.dao.GameDAO;
import com.houie.gkg.lang.Game;
import com.houie.gkg.lang.Selection;
import com.houie.gkg.lang.Team;
import com.houie.gkg.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by houie on 8/1/2017.
 */
@Component
public class GameServiceImpl implements GameService {

    @Autowired
    private GameDAO gameDAO;

    private static final List<Selection> SELECTIONS = new ArrayList<Selection>();
    {
        SELECTIONS.add(new Selection(1, 'A', "Toivo", 1, 'A', Team.PHI));
        SELECTIONS.add(new Selection(2, 'B', "Holly", 21, 'A', Team.ANA));
        SELECTIONS.add(new Selection(3, 'C', "Kellie", 31, 'A', Team.CHI));
    }

    public List<Team> getTeams() {
        return new ArrayList<Team>(Arrays.asList(Team.values()));
    }

    public Team getTeam(String abbreviation) {
        for (Team t : Team.values()) {
            if (t.getAbbreviation().equals(abbreviation)) {
                return t;
            }
        }
        return null;
    }

    public List<Game> getGames() {
        return gameDAO.list();
    }

    public Game getGame(int id) {
        return gameDAO.get(id);
    }

    public List<Selection> getSelections() {
        return SELECTIONS;
    }

    public Selection createSelection(Selection selection) {
        SELECTIONS.add(selection);
        return selection;
    }
}
