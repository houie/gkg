package com.houie.gkg.service;

import com.houie.gkg.dao.GameDAO;
import com.houie.gkg.lang.Game;
import com.houie.gkg.lang.Team;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by houie on 8/1/2017.
 */
public interface GameService {

    List<Team> getTeams();
    Team getTeam(String abbreviation);
    List<Game> getGames();
    Game getGame(int id);
}
