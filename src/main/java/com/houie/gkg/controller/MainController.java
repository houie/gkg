package com.houie.gkg.controller;

import com.houie.gkg.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * Created by houie on 8/1/2017.
 */
@Controller
public class MainController {

    @Autowired
    private GameService gameService;

    @RequestMapping(value = {"", "/"})
    public ModelAndView getMain(ModelMap model, HttpSession session) {
        return new ModelAndView("main", model);
    }

    @RequestMapping(value = {"/teams"}, method = RequestMethod.GET)
    public ModelAndView getTeams(ModelMap model) {
        model.put("teams", gameService.getTeams());
        return new ModelAndView("jsonView", model);
    }

    @RequestMapping(value = {"/teams/{abbreviation}"}, method = RequestMethod.GET)
    public ModelAndView getTeam(@PathVariable String abbreviation, ModelMap model) {
        model.put("team", gameService.getTeam(abbreviation));
        return new ModelAndView("jsonView", model);
    }

    @RequestMapping(value = {"/games"}, method = RequestMethod.GET)
    public ModelAndView getGames(ModelMap model, HttpSession session) {
        model.put("games", gameService.getGames());
        return new ModelAndView("jsonView", model);
    }

    @RequestMapping(value = {"/games/{id}"}, method = RequestMethod.GET)
    public ModelAndView getGameById(@PathVariable int id, ModelMap model, HttpSession session) {
        model.put("game", gameService.getGame(id));
        return new ModelAndView("jsonView", model);
    }

    @RequestMapping(value = {"/selections"}, method = RequestMethod.GET)
    public ModelAndView getSelections(ModelMap model, HttpSession session) {
        model.put("selections", gameService.getSelections());
        return new ModelAndView("jsonView", model);
    }

}
